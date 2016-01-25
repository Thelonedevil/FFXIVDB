
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
    "name",
    "abbr",
    "is_job",
    "icon",
    "patch",
    "icon1",
    "icon2",
    "icon3",
    "level"
})
public class ClassjobRepair {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("abbr")
    private String abbr;
    @JsonProperty("is_job")
    private String isJob;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("patch")
    private String patch;
    @JsonProperty("icon1")
    private String icon1;
    @JsonProperty("icon2")
    private String icon2;
    @JsonProperty("icon3")
    private String icon3;
    @JsonProperty("level")
    private int level;
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
     *     The abbr
     */
    @JsonProperty("abbr")
    public String getAbbr() {
        return abbr;
    }

    /**
     * 
     * @param abbr
     *     The abbr
     */
    @JsonProperty("abbr")
    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    /**
     * 
     * @return
     *     The isJob
     */
    @JsonProperty("is_job")
    public String getIsJob() {
        return isJob;
    }

    /**
     * 
     * @param isJob
     *     The is_job
     */
    @JsonProperty("is_job")
    public void setIsJob(String isJob) {
        this.isJob = isJob;
    }

    /**
     * 
     * @return
     *     The icon
     */
    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    /**
     * 
     * @param icon
     *     The icon
     */
    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
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
     *     The icon1
     */
    @JsonProperty("icon1")
    public String getIcon1() {
        return icon1;
    }

    /**
     * 
     * @param icon1
     *     The icon1
     */
    @JsonProperty("icon1")
    public void setIcon1(String icon1) {
        this.icon1 = icon1;
    }

    /**
     * 
     * @return
     *     The icon2
     */
    @JsonProperty("icon2")
    public String getIcon2() {
        return icon2;
    }

    /**
     * 
     * @param icon2
     *     The icon2
     */
    @JsonProperty("icon2")
    public void setIcon2(String icon2) {
        this.icon2 = icon2;
    }

    /**
     * 
     * @return
     *     The icon3
     */
    @JsonProperty("icon3")
    public String getIcon3() {
        return icon3;
    }

    /**
     * 
     * @param icon3
     *     The icon3
     */
    @JsonProperty("icon3")
    public void setIcon3(String icon3) {
        this.icon3 = icon3;
    }

    /**
     * 
     * @return
     *     The level
     */
    @JsonProperty("level")
    public int getLevel() {
        return level;
    }

    /**
     * 
     * @param level
     *     The level
     */
    @JsonProperty("level")
    public void setLevel(int level) {
        this.level = level;
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
