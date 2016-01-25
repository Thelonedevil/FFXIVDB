package uk.tldcode.apps;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class ItemResults {

    @JsonProperty("results")
    private List<Item> items;
    @JsonProperty("total")
    private int total;

    @JsonProperty("total")
    public int getTotal() {
        return total;
    }

    public ItemResults(){

    }
    public ItemResults(boolean noMatch){
        total = 0;
        items = new ArrayList<>();
    }

    @JsonProperty("total")
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * @return The items
     */
    @JsonProperty("results")
    public List<Item> getItems() {
        return items;
    }

    /**
     * @param items The items
     */
    @JsonProperty("results")
    public void setItems(List<Item> items) {
        this.items = items;
    }
}
