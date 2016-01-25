
package uk.tldcode.apps;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "patch",
    "patch_url",
    "name",
    "banner",
    "is_expansion",
    "date"
})
public class Patch {

    @JsonProperty("id")
    private String id;
    @JsonProperty("patch")
    private String patch;
    @JsonProperty("patch_url")
    private String patchUrl;
    @JsonProperty("name")
    private String name;
    @JsonProperty("banner")
    private String banner;
    @JsonProperty("is_expansion")
    private String isExpansion;
    @JsonProperty("date")
    private String date;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The patch
     */
    @JsonProperty("patch")
    public String getPatch() {
        return patch;
    }

    /**
     * 
     * @param patch
     *     The patch
     */
    @JsonProperty("patch")
    public void setPatch(String patch) {
        this.patch = patch;
    }

    /**
     * 
     * @return
     *     The patchUrl
     */
    @JsonProperty("patch_url")
    public String getPatchUrl() {
        return patchUrl;
    }

    /**
     * 
     * @param patchUrl
     *     The patch_url
     */
    @JsonProperty("patch_url")
    public void setPatchUrl(String patchUrl) {
        this.patchUrl = patchUrl;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The banner
     */
    @JsonProperty("banner")
    public String getBanner() {
        return banner;
    }

    /**
     * 
     * @param banner
     *     The banner
     */
    @JsonProperty("banner")
    public void setBanner(String banner) {
        this.banner = banner;
    }

    /**
     * 
     * @return
     *     The isExpansion
     */
    @JsonProperty("is_expansion")
    public String getIsExpansion() {
        return isExpansion;
    }

    /**
     * 
     * @param isExpansion
     *     The is_expansion
     */
    @JsonProperty("is_expansion")
    public void setIsExpansion(String isExpansion) {
        this.isExpansion = isExpansion;
    }

    /**
     * 
     * @return
     *     The date
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
