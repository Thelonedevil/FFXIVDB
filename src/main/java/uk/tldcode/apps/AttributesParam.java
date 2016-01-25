
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
    "value",
    "value_hq",
    "percent",
    "percent_hq",
    "is_relative",
    "is_food",
    "stat_patch",
    "id",
    "name",
    "param_patch"
})
public class AttributesParam {

    @JsonProperty("value")
    private String value;
    @JsonProperty("value_hq")
    private String valueHq;
    @JsonProperty("percent")
    private String percent;
    @JsonProperty("percent_hq")
    private String percentHq;
    @JsonProperty("is_relative")
    private String isRelative;
    @JsonProperty("is_food")
    private String isFood;
    @JsonProperty("stat_patch")
    private String statPatch;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("param_patch")
    private String paramPatch;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The value
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 
     * @return
     *     The valueHq
     */
    @JsonProperty("value_hq")
    public String getValueHq() {
        return valueHq;
    }

    /**
     * 
     * @param valueHq
     *     The value_hq
     */
    @JsonProperty("value_hq")
    public void setValueHq(String valueHq) {
        this.valueHq = valueHq;
    }

    /**
     * 
     * @return
     *     The percent
     */
    @JsonProperty("percent")
    public String getPercent() {
        return percent;
    }

    /**
     * 
     * @param percent
     *     The percent
     */
    @JsonProperty("percent")
    public void setPercent(String percent) {
        this.percent = percent;
    }

    /**
     * 
     * @return
     *     The percentHq
     */
    @JsonProperty("percent_hq")
    public String getPercentHq() {
        return percentHq;
    }

    /**
     * 
     * @param percentHq
     *     The percent_hq
     */
    @JsonProperty("percent_hq")
    public void setPercentHq(String percentHq) {
        this.percentHq = percentHq;
    }

    /**
     * 
     * @return
     *     The isRelative
     */
    @JsonProperty("is_relative")
    public String getIsRelative() {
        return isRelative;
    }

    /**
     * 
     * @param isRelative
     *     The is_relative
     */
    @JsonProperty("is_relative")
    public void setIsRelative(String isRelative) {
        this.isRelative = isRelative;
    }

    /**
     * 
     * @return
     *     The isFood
     */
    @JsonProperty("is_food")
    public String getIsFood() {
        return isFood;
    }

    /**
     * 
     * @param isFood
     *     The is_food
     */
    @JsonProperty("is_food")
    public void setIsFood(String isFood) {
        this.isFood = isFood;
    }

    /**
     * 
     * @return
     *     The statPatch
     */
    @JsonProperty("stat_patch")
    public String getStatPatch() {
        return statPatch;
    }

    /**
     * 
     * @param statPatch
     *     The stat_patch
     */
    @JsonProperty("stat_patch")
    public void setStatPatch(String statPatch) {
        this.statPatch = statPatch;
    }

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
     *     The paramPatch
     */
    @JsonProperty("param_patch")
    public String getParamPatch() {
        return paramPatch;
    }

    /**
     * 
     * @param paramPatch
     *     The param_patch
     */
    @JsonProperty("param_patch")
    public void setParamPatch(String paramPatch) {
        this.paramPatch = paramPatch;
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
