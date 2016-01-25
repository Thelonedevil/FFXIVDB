package uk.tldcode.apps;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.GridPane;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainController {
    private static final Logger log = LogManager.getLogger(MainApp.class);

    @FXML
    public TitledPane filtersPane;

    @FXML
    public TitledPane resultsPane;

    @FXML
    public ToolBar toolbar;

    @FXML
    public TextField search;

    @FXML
    public Button searchButton;

    @FXML
    public TextField id;

    @FXML
    public Button getButton;

    @FXML
    public GridPane resultsGrid;

    @FXML
    public Button page1;
}
