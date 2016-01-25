package uk.tldcode.apps;

import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApp extends Application {

    private static final Logger log = LogManager.getLogger(MainApp.class);
    private static MainController controller;

    public static void main(String[] args) throws Exception {
        System.setProperty("TLDCONF", System.getProperty("user.home") + "/.ffxivdb");
        System.setProperty("TLDDEBUG", String.valueOf(false));
        File logFile = new File(System.getProperty("TLDCONF") + File.separator + "console.log");
        if (logFile.exists() && !logFile.delete()) {
            log.error("Failed to delete old console log file");
        }
        launch(args);
    }

    public void start(Stage stage) throws Exception {

        log.info("Starting Hello JavaFX and Maven demonstration application");

        String fxmlFile = "/fxml/main.fxml";
        log.debug("Loading FXML for main view from: {}", fxmlFile);
        FXMLLoader loader = new FXMLLoader();
        Parent rootNode = loader.load(getClass().getResourceAsStream(fxmlFile));

        log.debug("Showing JFX scene");
        Scene scene = new Scene(rootNode, 800, 600);
        scene.getStylesheets().add("/styles/styles.css");

        stage.setOnCloseRequest(event1-> System.exit(0));//To kill any threads that are running
        stage.setTitle("Hello JavaFX and Maven");
        stage.setScene(scene);
        controller = loader.<MainController>getController();
        controller.filtersPane.expandedProperty().addListener((ov, old, value) -> {
            if (value) {
                controller.resultsPane.setPrefHeight(400);
                controller.toolbar.setLayoutY(controller.toolbar.getLayoutY() - 178);
            } else {
                controller.resultsPane.setPrefHeight(600);
                controller.toolbar.setLayoutY(controller.toolbar.getLayoutY() + 178);
            }
        });

        controller.searchButton.setOnAction((event) -> {
            String search = controller.search.getText();
            search(search,0);
        });
        controller.getButton.setOnAction((event) -> {
            String id = controller.id.getText();
            get(id);
        });
        controller.resultsGrid.getChildren().clear();
        stage.show();
    }

    public void get(String id) {
        String query = "http://api.xivdb.com/item/" + id;
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(query);
        request.addHeader("accept", "application/json");
        try {
            HttpResponse response = httpClient.execute(request);
            if (response.getStatusLine().getStatusCode() != 200) {
                log.error("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode());
            }
            BufferedReader br = new BufferedReader(
                    new InputStreamReader((response.getEntity().getContent())));

            String output;
            log.info("Output from Server ....");
            while ((output = br.readLine()) != null) {
                log.info(output);
                ObjectMapper mapper = new ObjectMapper();
                Item item = mapper.readValue(output, Item.class);
                log.info(item);
                log.info("Name = " + item.getNameEn());
                log.info("Japanese Name = " + item.getNameJa());
                log.info("Defence = " + item.getAttributesBase().getDefense() + "/" + item.getAttributesBase().getDefenseHq());
                log.info("Magic Defence = " + item.getAttributesBase().getMagicDefense() + "/" + item.getAttributesBase().getMagicDefenseHq());
                item.getAttributesParams().forEach(a -> log.info(a.getName() + ":" + a.getValue() + "/" + a.getValueHq()));
                log.info(item.getPatch().getPatch());
                log.info(item.getPatch().getName());

            }
        } catch (IOException e) {
            log.error(e);
        }
    }

    public void search(String search_, int page) {
        new Thread(()-> {
            String query = "http://api.xivdb.com/search?string=";
            final String search = search_.replace(" ", "+");
            query += search;
            query += "&page=" + page;
            HttpClient httpClient = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet(query);
            request.addHeader("accept", "application/json");
            try {
                HttpResponse response = httpClient.execute(request);
                if (response.getStatusLine().getStatusCode() != 200) {
                    log.error("Failed : HTTP error code : "
                            + response.getStatusLine().getStatusCode());
                }
                BufferedReader br = new BufferedReader(
                        new InputStreamReader((response.getEntity().getContent())));

                String output;
                log.info("Output from Server ....");
                while ((output = br.readLine()) != null) {
                    log.info(output);
                    ObjectMapper mapper = new ObjectMapper();
                    SearchResults results = mapper.readValue(output, SearchResults.class);
                    int row = 0;
                    int col = 0;
                /*for (int i = 0; i < 5; i++) {
                    for (int j = 0; i < 10; i++) {

                        controller.resultsGrid.add(new Pane(),j,i);
                    }
                }*/
                    GuiUtils.runSafe(()->controller.resultsGrid.getChildren().clear());
                    GuiUtils.runSafe(()->controller.toolbar.getItems().retainAll(controller.page1));
                    GuiUtils.runSafe(()->controller.resultsPane.setText("Results - 50 results shown - " + results.getItems().getTotal() + " total"));
                    if (results.getItems().getTotal() > 50) {
                        for (int i = 2; i < (results.getItems().getTotal() / 50) + 1; i++) {
                            final int newPage = i;
                            Button button = new Button("Page " + i);
                            button.setOnAction(event -> search(search, newPage));
                            GuiUtils.runSafe(()->controller.toolbar.getItems().add(button));
                        }
                    }
                    for (Item item : results.getItems().getItems()) {
                        log.info(item.getName());
                        if (col == 5) {
                            row++;
//                        controller.resultsGrid.addRow(row);
                            col = 0;
                        }
                        String url = item.getIcon();
                        if (!url.startsWith("http")) {
                            url = "http://api.xivdb.com" + url;
                        }
                        Image image = new Image(url);
                        ImageView imageView = new ImageView(image);
                        imageView.setFitHeight(60);
                        imageView.setFitWidth(60);
                        TextArea label = new TextArea();
                        label.setText(item.getName());
                        label.setTranslateX(60);
                        label.setWrapText(true);
                        label.setMaxWidth(100);
                        label.setEditable(false);
                        imageView.setOnMouseClicked(event -> showItem(item));
                        final int _col = col;
                        final int _row = row;
                        GuiUtils.runSafe(()->controller.resultsGrid.add(imageView, _col, _row));
                        GuiUtils.runSafe(()->controller.resultsGrid.add(label, _col, _row));
                        col++;
                    }

                }
            } catch (IOException e) {
                log.error(e);
            }
        }).start();

    }

    public void showItem(Item item) {
        Alert alert = new Alert(Alert.AlertType.NONE);
        alert.setTitle(item.getName());
        GridPane gridPane = new GridPane();
        gridPane.addColumn(0);
        gridPane.addColumn(1);
        gridPane.addColumn(3);
        gridPane.addColumn(4);
        gridPane.addColumn(5);
        gridPane.addColumn(6);
        gridPane.addRow(0);
        String url = item.getIcon();
        if (!url.startsWith("http")) {
            url = "http://api.xivdb.com" + url;
        }
        Image image = new Image(url);
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(60);
        imageView.setFitWidth(60);
        gridPane.add(imageView, 0, 0);


        //TODO add content to gridPane
        ButtonType buttonTypeOk = new ButtonType("Close", ButtonBar.ButtonData.OK_DONE);
        alert.getDialogPane().getButtonTypes().add(buttonTypeOk);
        alert.getDialogPane().setContent(gridPane);
        alert.show();
    }
}
