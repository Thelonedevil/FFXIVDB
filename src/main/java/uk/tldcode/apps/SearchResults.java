package uk.tldcode.apps;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchResults {

    @JsonProperty("items")
    private ItemResults items;

    @JsonProperty("items")
    public ItemResults getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(ItemResults items) {
        this.items = items;
    }

}
