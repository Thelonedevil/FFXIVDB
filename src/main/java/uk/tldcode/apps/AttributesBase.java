
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
    "damage",
    "damage_hq",
    "magic_damage",
    "magic_damage_hq",
    "defense",
    "defense_hq",
    "magic_defense",
    "magic_defense_hq",
    "block_strength",
    "block_strength_hq",
    "block_rate",
    "block_rate_hq",
    "delay",
    "delay_hq",
    "auto_attack",
    "auto_attack_hq",
    "dps",
    "dps_hq",
    "patch"
})
public class AttributesBase {

    @JsonProperty("id")
    private String id;
    @JsonProperty("damage")
    private String damage;
    @JsonProperty("damage_hq")
    private String damageHq;
    @JsonProperty("magic_damage")
    private String magicDamage;
    @JsonProperty("magic_damage_hq")
    private String magicDamageHq;
    @JsonProperty("defense")
    private String defense;
    @JsonProperty("defense_hq")
    private String defenseHq;
    @JsonProperty("magic_defense")
    private String magicDefense;
    @JsonProperty("magic_defense_hq")
    private String magicDefenseHq;
    @JsonProperty("block_strength")
    private String blockStrength;
    @JsonProperty("block_strength_hq")
    private String blockStrengthHq;
    @JsonProperty("block_rate")
    private String blockRate;
    @JsonProperty("block_rate_hq")
    private String blockRateHq;
    @JsonProperty("delay")
    private String delay;
    @JsonProperty("delay_hq")
    private String delayHq;
    @JsonProperty("auto_attack")
    private String autoAttack;
    @JsonProperty("auto_attack_hq")
    private String autoAttackHq;
    @JsonProperty("dps")
    private String dps;
    @JsonProperty("dps_hq")
    private String dpsHq;
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
     *     The damage
     */
    @JsonProperty("damage")
    public String getDamage() {
        return damage;
    }

    /**
     * 
     * @param damage
     *     The damage
     */
    @JsonProperty("damage")
    public void setDamage(String damage) {
        this.damage = damage;
    }

    /**
     * 
     * @return
     *     The damageHq
     */
    @JsonProperty("damage_hq")
    public String getDamageHq() {
        return damageHq;
    }

    /**
     * 
     * @param damageHq
     *     The damage_hq
     */
    @JsonProperty("damage_hq")
    public void setDamageHq(String damageHq) {
        this.damageHq = damageHq;
    }

    /**
     * 
     * @return
     *     The magicDamage
     */
    @JsonProperty("magic_damage")
    public String getMagicDamage() {
        return magicDamage;
    }

    /**
     * 
     * @param magicDamage
     *     The magic_damage
     */
    @JsonProperty("magic_damage")
    public void setMagicDamage(String magicDamage) {
        this.magicDamage = magicDamage;
    }

    /**
     * 
     * @return
     *     The magicDamageHq
     */
    @JsonProperty("magic_damage_hq")
    public String getMagicDamageHq() {
        return magicDamageHq;
    }

    /**
     * 
     * @param magicDamageHq
     *     The magic_damage_hq
     */
    @JsonProperty("magic_damage_hq")
    public void setMagicDamageHq(String magicDamageHq) {
        this.magicDamageHq = magicDamageHq;
    }

    /**
     * 
     * @return
     *     The defense
     */
    @JsonProperty("defense")
    public String getDefense() {
        return defense;
    }

    /**
     * 
     * @param defense
     *     The defense
     */
    @JsonProperty("defense")
    public void setDefense(String defense) {
        this.defense = defense;
    }

    /**
     * 
     * @return
     *     The defenseHq
     */
    @JsonProperty("defense_hq")
    public String getDefenseHq() {
        return defenseHq;
    }

    /**
     * 
     * @param defenseHq
     *     The defense_hq
     */
    @JsonProperty("defense_hq")
    public void setDefenseHq(String defenseHq) {
        this.defenseHq = defenseHq;
    }

    /**
     * 
     * @return
     *     The magicDefense
     */
    @JsonProperty("magic_defense")
    public String getMagicDefense() {
        return magicDefense;
    }

    /**
     * 
     * @param magicDefense
     *     The magic_defense
     */
    @JsonProperty("magic_defense")
    public void setMagicDefense(String magicDefense) {
        this.magicDefense = magicDefense;
    }

    /**
     * 
     * @return
     *     The magicDefenseHq
     */
    @JsonProperty("magic_defense_hq")
    public String getMagicDefenseHq() {
        return magicDefenseHq;
    }

    /**
     * 
     * @param magicDefenseHq
     *     The magic_defense_hq
     */
    @JsonProperty("magic_defense_hq")
    public void setMagicDefenseHq(String magicDefenseHq) {
        this.magicDefenseHq = magicDefenseHq;
    }

    /**
     * 
     * @return
     *     The blockStrength
     */
    @JsonProperty("block_strength")
    public String getBlockStrength() {
        return blockStrength;
    }

    /**
     * 
     * @param blockStrength
     *     The block_strength
     */
    @JsonProperty("block_strength")
    public void setBlockStrength(String blockStrength) {
        this.blockStrength = blockStrength;
    }

    /**
     * 
     * @return
     *     The blockStrengthHq
     */
    @JsonProperty("block_strength_hq")
    public String getBlockStrengthHq() {
        return blockStrengthHq;
    }

    /**
     * 
     * @param blockStrengthHq
     *     The block_strength_hq
     */
    @JsonProperty("block_strength_hq")
    public void setBlockStrengthHq(String blockStrengthHq) {
        this.blockStrengthHq = blockStrengthHq;
    }

    /**
     * 
     * @return
     *     The blockRate
     */
    @JsonProperty("block_rate")
    public String getBlockRate() {
        return blockRate;
    }

    /**
     * 
     * @param blockRate
     *     The block_rate
     */
    @JsonProperty("block_rate")
    public void setBlockRate(String blockRate) {
        this.blockRate = blockRate;
    }

    /**
     * 
     * @return
     *     The blockRateHq
     */
    @JsonProperty("block_rate_hq")
    public String getBlockRateHq() {
        return blockRateHq;
    }

    /**
     * 
     * @param blockRateHq
     *     The block_rate_hq
     */
    @JsonProperty("block_rate_hq")
    public void setBlockRateHq(String blockRateHq) {
        this.blockRateHq = blockRateHq;
    }

    /**
     * 
     * @return
     *     The delay
     */
    @JsonProperty("delay")
    public String getDelay() {
        return delay;
    }

    /**
     * 
     * @param delay
     *     The delay
     */
    @JsonProperty("delay")
    public void setDelay(String delay) {
        this.delay = delay;
    }

    /**
     * 
     * @return
     *     The delayHq
     */
    @JsonProperty("delay_hq")
    public String getDelayHq() {
        return delayHq;
    }

    /**
     * 
     * @param delayHq
     *     The delay_hq
     */
    @JsonProperty("delay_hq")
    public void setDelayHq(String delayHq) {
        this.delayHq = delayHq;
    }

    /**
     * 
     * @return
     *     The autoAttack
     */
    @JsonProperty("auto_attack")
    public String getAutoAttack() {
        return autoAttack;
    }

    /**
     * 
     * @param autoAttack
     *     The auto_attack
     */
    @JsonProperty("auto_attack")
    public void setAutoAttack(String autoAttack) {
        this.autoAttack = autoAttack;
    }

    /**
     * 
     * @return
     *     The autoAttackHq
     */
    @JsonProperty("auto_attack_hq")
    public String getAutoAttackHq() {
        return autoAttackHq;
    }

    /**
     * 
     * @param autoAttackHq
     *     The auto_attack_hq
     */
    @JsonProperty("auto_attack_hq")
    public void setAutoAttackHq(String autoAttackHq) {
        this.autoAttackHq = autoAttackHq;
    }

    /**
     * 
     * @return
     *     The dps
     */
    @JsonProperty("dps")
    public String getDps() {
        return dps;
    }

    /**
     * 
     * @param dps
     *     The dps
     */
    @JsonProperty("dps")
    public void setDps(String dps) {
        this.dps = dps;
    }

    /**
     * 
     * @return
     *     The dpsHq
     */
    @JsonProperty("dps_hq")
    public String getDpsHq() {
        return dpsHq;
    }

    /**
     * 
     * @param dpsHq
     *     The dps_hq
     */
    @JsonProperty("dps_hq")
    public void setDpsHq(String dpsHq) {
        this.dpsHq = dpsHq;
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
