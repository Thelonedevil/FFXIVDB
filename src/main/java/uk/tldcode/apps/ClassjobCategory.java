
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
    "classjob_list",
    "patch"
})
public class ClassjobCategory {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("classjob_list")
    private String classjobList;
    @JsonProperty("patch")
    private String patch;
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
     *     The classjobList
     */
    @JsonProperty("classjob_list")
    public String getClassjobList() {
        return classjobList;
    }

    /**
     * 
     * @param classjobList
     *     The classjob_list
     */
    @JsonProperty("classjob_list")
    public void setClassjobList(String classjobList) {
        this.classjobList = classjobList;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
