
package uk.tldcode.apps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "name_ja",
    "name_en",
    "name_fr",
    "name_de",
    "name_ch",
    "help",
    "noun",
    "plural",
    "classjob_category",
    "stack_size",
    "action",
    "level_equip",
    "level_item",
    "rarity",
    "can_be_hq",
    "item_special_bonus",
    "item_series",
    "slot_equip",
    "equip_slot_category",
    "price_low",
    "price_mid",
    "price_high",
    "price_sell",
    "price_sell_hq",
    "icon",
    "icon_lodestone",
    "icon_lodestone_hq",
    "salvage",
    "materia_slot_count",
    "materialize_type",
    "starts_with_vowel",
    "pvp_rank",
    "stain",
    "model_main",
    "model_sub",
    "classjob_use",
    "cooldown_seconds",
    "gc_turn_in",
    "grand_company",
    "base_param_modifier",
    "aetherial_reduce",
    "desynthesize",
    "item_ui_kind",
    "item_ui_category",
    "item_search_category",
    "item_action",
    "item_repair",
    "item_glamour",
    "reducible_classjob",
    "reducible_level",
    "equippable_by_race_hyur",
    "equippable_by_race_elezen",
    "equippable_by_race_lalafell",
    "equippable_by_race_miqote",
    "equippable_by_race_roegadyn",
    "equippable_by_race_aura",
    "equippable_by_gender_m",
    "equippable_by_gender_f",
    "classjob_repair",
    "lodestone_type",
    "lodestone_id",
    "sort_key",
    "is_pvp",
    "is_unique",
    "is_untradable",
    "is_legacy",
    "is_dated",
    "is_crest_worthy",
    "is_desynthesizable",
    "is_projectable",
    "is_dyeable",
    "is_convertible",
    "is_reducible",
    "is_indisposable",
    "is_collectable",
    "flag_params",
    "flag_classjob",
    "flag_instance",
    "flag_instance_chest",
    "flag_instance_reward",
    "flag_quest",
    "flag_enemy",
    "flag_recipe",
    "flag_craftable",
    "flag_shop",
    "flag_gathering",
    "flag_achievement",
    "parsed_lodestone",
    "parsed_lodestone_time",
    "patch",
    "updated",
    "series_name",
    "bonus",
    "bonus_name",
    "category",
    "category_name",
    "kind",
    "kind_name",
    "slot",
    "slot_name",
    "classjobs",
    "attributes_base",
    "attributes_params",
    "gathering",
    "recipes",
    "craftable",
    "instances",
    "enemies",
    "achievements",
    "quests",
    "shops",
    "url",
    "url_api",
    "url_xivdb",
    "url_xivdb_ja",
    "url_xivdb_fr",
    "url_xivdb_de",
    "url_lodestone",
    "url_type",
    "icon_hq",
    "color",
    "repair_cost",
    "_cid",
    "_type"
})
public class Item {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("name_ja")
    private String nameJa;
    @JsonProperty("name_en")
    private String nameEn;
    @JsonProperty("name_fr")
    private String nameFr;
    @JsonProperty("name_de")
    private String nameDe;
    @JsonProperty("name_ch")
    private Object nameCh;
    @JsonProperty("help")
    private Object help;
    @JsonProperty("noun")
    private Object noun;
    @JsonProperty("plural")
    private Object plural;
    @JsonProperty("classjob_category")
    private ClassjobCategory classjobCategory;
    @JsonProperty("stack_size")
    private String stackSize;
    @JsonProperty("action")
    private String action;
    @JsonProperty("level_equip")
    private String levelEquip;
    @JsonProperty("level_item")
    private String levelItem;
    @JsonProperty("rarity")
    private String rarity;
    @JsonProperty("can_be_hq")
    private String canBeHq;
    @JsonProperty("item_special_bonus")
    private String itemSpecialBonus;
    @JsonProperty("item_series")
    private Object itemSeries;
    @JsonProperty("slot_equip")
    private String slotEquip;
    @JsonProperty("equip_slot_category")
    private String equipSlotCategory;
    @JsonProperty("price_low")
    private String priceLow;
    @JsonProperty("price_mid")
    private String priceMid;
    @JsonProperty("price_high")
    private String priceHigh;
    @JsonProperty("price_sell")
    private String priceSell;
    @JsonProperty("price_sell_hq")
    private String priceSellHq;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("icon_lodestone")
    private String iconLodestone;
    @JsonProperty("icon_lodestone_hq")
    private String iconLodestoneHq;
    @JsonProperty("salvage")
    private String salvage;
    @JsonProperty("materia_slot_count")
    private String materiaSlotCount;
    @JsonProperty("materialize_type")
    private String materializeType;
    @JsonProperty("starts_with_vowel")
    private String startsWithVowel;
    @JsonProperty("pvp_rank")
    private String pvpRank;
    @JsonProperty("stain")
    private String stain;
    @JsonProperty("model_main")
    private String modelMain;
    @JsonProperty("model_sub")
    private String modelSub;
    @JsonProperty("classjob_use")
    private String classjobUse;
    @JsonProperty("cooldown_seconds")
    private String cooldownSeconds;
    @JsonProperty("gc_turn_in")
    private String gcTurnIn;
    @JsonProperty("grand_company")
    private String grandCompany;
    @JsonProperty("base_param_modifier")
    private String baseParamModifier;
    @JsonProperty("aetherial_reduce")
    private String aetherialReduce;
    @JsonProperty("desynthesize")
    private String desynthesize;
    @JsonProperty("item_ui_kind")
    private String itemUiKind;
    @JsonProperty("item_ui_category")
    private String itemUiCategory;
    @JsonProperty("item_search_category")
    private String itemSearchCategory;
    @JsonProperty("item_action")
    private String itemAction;
    @JsonProperty("item_repair")
    private ItemRepair itemRepair;
    @JsonProperty("item_glamour")
    private ItemGlamour itemGlamour;
    @JsonProperty("reducible_classjob")
    private Object reducibleClassjob;
    @JsonProperty("reducible_level")
    private String reducibleLevel;
    @JsonProperty("equippable_by_race_hyur")
    private String equippableByRaceHyur;
    @JsonProperty("equippable_by_race_elezen")
    private String equippableByRaceElezen;
    @JsonProperty("equippable_by_race_lalafell")
    private String equippableByRaceLalafell;
    @JsonProperty("equippable_by_race_miqote")
    private String equippableByRaceMiqote;
    @JsonProperty("equippable_by_race_roegadyn")
    private String equippableByRaceRoegadyn;
    @JsonProperty("equippable_by_race_aura")
    private String equippableByRaceAura;
    @JsonProperty("equippable_by_gender_m")
    private String equippableByGenderM;
    @JsonProperty("equippable_by_gender_f")
    private String equippableByGenderF;
    @JsonProperty("classjob_repair")
    private ClassjobRepair classjobRepair;
    @JsonProperty("lodestone_type")
    private String lodestoneType;
    @JsonProperty("lodestone_id")
    private String lodestoneId;
    @JsonProperty("sort_key")
    private String sortKey;
    @JsonProperty("is_pvp")
    private String isPvp;
    @JsonProperty("is_unique")
    private String isUnique;
    @JsonProperty("is_untradable")
    private String isUntradable;
    @JsonProperty("is_legacy")
    private String isLegacy;
    @JsonProperty("is_dated")
    private String isDated;
    @JsonProperty("is_crest_worthy")
    private String isCrestWorthy;
    @JsonProperty("is_desynthesizable")
    private String isDesynthesizable;
    @JsonProperty("is_projectable")
    private String isProjectable;
    @JsonProperty("is_dyeable")
    private String isDyeable;
    @JsonProperty("is_convertible")
    private String isConvertible;
    @JsonProperty("is_reducible")
    private String isReducible;
    @JsonProperty("is_indisposable")
    private String isIndisposable;
    @JsonProperty("is_collectable")
    private String isCollectable;
    @JsonProperty("flag_params")
    private String flagParams;
    @JsonProperty("flag_classjob")
    private String flagClassjob;
    @JsonProperty("flag_instance")
    private String flagInstance;
    @JsonProperty("flag_instance_chest")
    private String flagInstanceChest;
    @JsonProperty("flag_instance_reward")
    private String flagInstanceReward;
    @JsonProperty("flag_quest")
    private String flagQuest;
    @JsonProperty("flag_enemy")
    private String flagEnemy;
    @JsonProperty("flag_recipe")
    private String flagRecipe;
    @JsonProperty("flag_craftable")
    private String flagCraftable;
    @JsonProperty("flag_shop")
    private String flagShop;
    @JsonProperty("flag_gathering")
    private String flagGathering;
    @JsonProperty("flag_achievement")
    private String flagAchievement;
    @JsonProperty("parsed_lodestone")
    private String parsedLodestone;
    @JsonProperty("parsed_lodestone_time")
    private String parsedLodestoneTime;
    @JsonProperty("patch")
    private Patch patch;
    @JsonProperty("updated")
    private String updated;
    @JsonProperty("series_name")
    private Object seriesName;
    @JsonProperty("bonus")
    private Object bonus;
    @JsonProperty("bonus_name")
    private Object bonusName;
    @JsonProperty("category")
    private String category;
    @JsonProperty("category_name")
    private String categoryName;
    @JsonProperty("kind")
    private String kind;
    @JsonProperty("kind_name")
    private String kindName;
    @JsonProperty("slot")
    private String slot;
    @JsonProperty("slot_name")
    private String slotName;
    @JsonProperty("classjobs")
    private List<Classjob> classjobs = new ArrayList<Classjob>();
    @JsonProperty("attributes_base")
    private AttributesBase attributesBase;
    @JsonProperty("attributes_params")
    private List<AttributesParam> attributesParams = new ArrayList<AttributesParam>();
    @JsonProperty("gathering")
    private List<Object> gathering = new ArrayList<Object>();
    @JsonProperty("recipes")
    private List<Object> recipes = new ArrayList<Object>();
    @JsonProperty("craftable")
    private List<Object> craftable = new ArrayList<Object>();
    @JsonProperty("instances")
    private List<Object> instances = new ArrayList<Object>();
    @JsonProperty("enemies")
    private List<Object> enemies = new ArrayList<Object>();
    @JsonProperty("achievements")
    private List<Object> achievements = new ArrayList<Object>();
    @JsonProperty("quests")
    private List<Object> quests = new ArrayList<Object>();
    @JsonProperty("shops")
    private List<Object> shops = new ArrayList<Object>();
    @JsonProperty("url")
    private String url;
    @JsonProperty("url_api")
    private String urlApi;
    @JsonProperty("url_xivdb")
    private String urlXivdb;
    @JsonProperty("url_xivdb_ja")
    private String urlXivdbJa;
    @JsonProperty("url_xivdb_fr")
    private String urlXivdbFr;
    @JsonProperty("url_xivdb_de")
    private String urlXivdbDe;
    @JsonProperty("url_lodestone")
    private String urlLodestone;
    @JsonProperty("url_type")
    private String urlType;
    @JsonProperty("icon_hq")
    private String iconHq;
    @JsonProperty("color")
    private String color;
    @JsonProperty("repair_cost")
    private int repairCost;
    @JsonProperty("_cid")
    private int Cid;
    @JsonProperty("_type")
    private String Type;
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
     *     The nameJa
     */
    @JsonProperty("name_ja")
    public String getNameJa() {
        return nameJa;
    }

    /**
     * 
     * @param nameJa
     *     The name_ja
     */
    @JsonProperty("name_ja")
    public void setNameJa(String nameJa) {
        this.nameJa = nameJa;
    }

    /**
     * 
     * @return
     *     The nameEn
     */
    @JsonProperty("name_en")
    public String getNameEn() {
        return nameEn;
    }

    /**
     * 
     * @param nameEn
     *     The name_en
     */
    @JsonProperty("name_en")
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    /**
     * 
     * @return
     *     The nameFr
     */
    @JsonProperty("name_fr")
    public String getNameFr() {
        return nameFr;
    }

    /**
     * 
     * @param nameFr
     *     The name_fr
     */
    @JsonProperty("name_fr")
    public void setNameFr(String nameFr) {
        this.nameFr = nameFr;
    }

    /**
     * 
     * @return
     *     The nameDe
     */
    @JsonProperty("name_de")
    public String getNameDe() {
        return nameDe;
    }

    /**
     * 
     * @param nameDe
     *     The name_de
     */
    @JsonProperty("name_de")
    public void setNameDe(String nameDe) {
        this.nameDe = nameDe;
    }

    /**
     * 
     * @return
     *     The nameCh
     */
    @JsonProperty("name_ch")
    public Object getNameCh() {
        return nameCh;
    }

    /**
     * 
     * @param nameCh
     *     The name_ch
     */
    @JsonProperty("name_ch")
    public void setNameCh(Object nameCh) {
        this.nameCh = nameCh;
    }

    /**
     * 
     * @return
     *     The help
     */
    @JsonProperty("help")
    public Object getHelp() {
        return help;
    }

    /**
     * 
     * @param help
     *     The help
     */
    @JsonProperty("help")
    public void setHelp(Object help) {
        this.help = help;
    }

    /**
     * 
     * @return
     *     The noun
     */
    @JsonProperty("noun")
    public Object getNoun() {
        return noun;
    }

    /**
     * 
     * @param noun
     *     The noun
     */
    @JsonProperty("noun")
    public void setNoun(Object noun) {
        this.noun = noun;
    }

    /**
     * 
     * @return
     *     The plural
     */
    @JsonProperty("plural")
    public Object getPlural() {
        return plural;
    }

    /**
     * 
     * @param plural
     *     The plural
     */
    @JsonProperty("plural")
    public void setPlural(Object plural) {
        this.plural = plural;
    }

    /**
     * 
     * @return
     *     The classjobCategory
     */
    @JsonProperty("classjob_category")
    public ClassjobCategory getClassjobCategory() {
        return classjobCategory;
    }

    /**
     * 
     * @param classjobCategory
     *     The classjob_category
     */
    @JsonProperty("classjob_category")
    public void setClassjobCategory(ClassjobCategory classjobCategory) {
        this.classjobCategory = classjobCategory;
    }

    /**
     * 
     * @return
     *     The stackSize
     */
    @JsonProperty("stack_size")
    public String getStackSize() {
        return stackSize;
    }

    /**
     * 
     * @param stackSize
     *     The stack_size
     */
    @JsonProperty("stack_size")
    public void setStackSize(String stackSize) {
        this.stackSize = stackSize;
    }

    /**
     * 
     * @return
     *     The action
     */
    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    /**
     * 
     * @param action
     *     The action
     */
    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * 
     * @return
     *     The levelEquip
     */
    @JsonProperty("level_equip")
    public String getLevelEquip() {
        return levelEquip;
    }

    /**
     * 
     * @param levelEquip
     *     The level_equip
     */
    @JsonProperty("level_equip")
    public void setLevelEquip(String levelEquip) {
        this.levelEquip = levelEquip;
    }

    /**
     * 
     * @return
     *     The levelItem
     */
    @JsonProperty("level_item")
    public String getLevelItem() {
        return levelItem;
    }

    /**
     * 
     * @param levelItem
     *     The level_item
     */
    @JsonProperty("level_item")
    public void setLevelItem(String levelItem) {
        this.levelItem = levelItem;
    }

    /**
     * 
     * @return
     *     The rarity
     */
    @JsonProperty("rarity")
    public String getRarity() {
        return rarity;
    }

    /**
     * 
     * @param rarity
     *     The rarity
     */
    @JsonProperty("rarity")
    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    /**
     * 
     * @return
     *     The canBeHq
     */
    @JsonProperty("can_be_hq")
    public String getCanBeHq() {
        return canBeHq;
    }

    /**
     * 
     * @param canBeHq
     *     The can_be_hq
     */
    @JsonProperty("can_be_hq")
    public void setCanBeHq(String canBeHq) {
        this.canBeHq = canBeHq;
    }

    /**
     * 
     * @return
     *     The itemSpecialBonus
     */
    @JsonProperty("item_special_bonus")
    public String getItemSpecialBonus() {
        return itemSpecialBonus;
    }

    /**
     * 
     * @param itemSpecialBonus
     *     The item_special_bonus
     */
    @JsonProperty("item_special_bonus")
    public void setItemSpecialBonus(String itemSpecialBonus) {
        this.itemSpecialBonus = itemSpecialBonus;
    }

    /**
     * 
     * @return
     *     The itemSeries
     */
    @JsonProperty("item_series")
    public Object getItemSeries() {
        return itemSeries;
    }

    /**
     * 
     * @param itemSeries
     *     The item_series
     */
    @JsonProperty("item_series")
    public void setItemSeries(Object itemSeries) {
        this.itemSeries = itemSeries;
    }

    /**
     * 
     * @return
     *     The slotEquip
     */
    @JsonProperty("slot_equip")
    public String getSlotEquip() {
        return slotEquip;
    }

    /**
     * 
     * @param slotEquip
     *     The slot_equip
     */
    @JsonProperty("slot_equip")
    public void setSlotEquip(String slotEquip) {
        this.slotEquip = slotEquip;
    }

    /**
     * 
     * @return
     *     The equipSlotCategory
     */
    @JsonProperty("equip_slot_category")
    public String getEquipSlotCategory() {
        return equipSlotCategory;
    }

    /**
     * 
     * @param equipSlotCategory
     *     The equip_slot_category
     */
    @JsonProperty("equip_slot_category")
    public void setEquipSlotCategory(String equipSlotCategory) {
        this.equipSlotCategory = equipSlotCategory;
    }

    /**
     * 
     * @return
     *     The priceLow
     */
    @JsonProperty("price_low")
    public String getPriceLow() {
        return priceLow;
    }

    /**
     * 
     * @param priceLow
     *     The price_low
     */
    @JsonProperty("price_low")
    public void setPriceLow(String priceLow) {
        this.priceLow = priceLow;
    }

    /**
     * 
     * @return
     *     The priceMid
     */
    @JsonProperty("price_mid")
    public String getPriceMid() {
        return priceMid;
    }

    /**
     * 
     * @param priceMid
     *     The price_mid
     */
    @JsonProperty("price_mid")
    public void setPriceMid(String priceMid) {
        this.priceMid = priceMid;
    }

    /**
     * 
     * @return
     *     The priceHigh
     */
    @JsonProperty("price_high")
    public String getPriceHigh() {
        return priceHigh;
    }

    /**
     * 
     * @param priceHigh
     *     The price_high
     */
    @JsonProperty("price_high")
    public void setPriceHigh(String priceHigh) {
        this.priceHigh = priceHigh;
    }

    /**
     * 
     * @return
     *     The priceSell
     */
    @JsonProperty("price_sell")
    public String getPriceSell() {
        return priceSell;
    }

    /**
     * 
     * @param priceSell
     *     The price_sell
     */
    @JsonProperty("price_sell")
    public void setPriceSell(String priceSell) {
        this.priceSell = priceSell;
    }

    /**
     * 
     * @return
     *     The priceSellHq
     */
    @JsonProperty("price_sell_hq")
    public String getPriceSellHq() {
        return priceSellHq;
    }

    /**
     * 
     * @param priceSellHq
     *     The price_sell_hq
     */
    @JsonProperty("price_sell_hq")
    public void setPriceSellHq(String priceSellHq) {
        this.priceSellHq = priceSellHq;
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
     *     The iconLodestone
     */
    @JsonProperty("icon_lodestone")
    public String getIconLodestone() {
        return iconLodestone;
    }

    /**
     * 
     * @param iconLodestone
     *     The icon_lodestone
     */
    @JsonProperty("icon_lodestone")
    public void setIconLodestone(String iconLodestone) {
        this.iconLodestone = iconLodestone;
    }

    /**
     * 
     * @return
     *     The iconLodestoneHq
     */
    @JsonProperty("icon_lodestone_hq")
    public String getIconLodestoneHq() {
        return iconLodestoneHq;
    }

    /**
     * 
     * @param iconLodestoneHq
     *     The icon_lodestone_hq
     */
    @JsonProperty("icon_lodestone_hq")
    public void setIconLodestoneHq(String iconLodestoneHq) {
        this.iconLodestoneHq = iconLodestoneHq;
    }

    /**
     * 
     * @return
     *     The salvage
     */
    @JsonProperty("salvage")
    public String getSalvage() {
        return salvage;
    }

    /**
     * 
     * @param salvage
     *     The salvage
     */
    @JsonProperty("salvage")
    public void setSalvage(String salvage) {
        this.salvage = salvage;
    }

    /**
     * 
     * @return
     *     The materiaSlotCount
     */
    @JsonProperty("materia_slot_count")
    public String getMateriaSlotCount() {
        return materiaSlotCount;
    }

    /**
     * 
     * @param materiaSlotCount
     *     The materia_slot_count
     */
    @JsonProperty("materia_slot_count")
    public void setMateriaSlotCount(String materiaSlotCount) {
        this.materiaSlotCount = materiaSlotCount;
    }

    /**
     * 
     * @return
     *     The materializeType
     */
    @JsonProperty("materialize_type")
    public String getMaterializeType() {
        return materializeType;
    }

    /**
     * 
     * @param materializeType
     *     The materialize_type
     */
    @JsonProperty("materialize_type")
    public void setMaterializeType(String materializeType) {
        this.materializeType = materializeType;
    }

    /**
     * 
     * @return
     *     The startsWithVowel
     */
    @JsonProperty("starts_with_vowel")
    public String getStartsWithVowel() {
        return startsWithVowel;
    }

    /**
     * 
     * @param startsWithVowel
     *     The starts_with_vowel
     */
    @JsonProperty("starts_with_vowel")
    public void setStartsWithVowel(String startsWithVowel) {
        this.startsWithVowel = startsWithVowel;
    }

    /**
     * 
     * @return
     *     The pvpRank
     */
    @JsonProperty("pvp_rank")
    public String getPvpRank() {
        return pvpRank;
    }

    /**
     * 
     * @param pvpRank
     *     The pvp_rank
     */
    @JsonProperty("pvp_rank")
    public void setPvpRank(String pvpRank) {
        this.pvpRank = pvpRank;
    }

    /**
     * 
     * @return
     *     The stain
     */
    @JsonProperty("stain")
    public String getStain() {
        return stain;
    }

    /**
     * 
     * @param stain
     *     The stain
     */
    @JsonProperty("stain")
    public void setStain(String stain) {
        this.stain = stain;
    }

    /**
     * 
     * @return
     *     The modelMain
     */
    @JsonProperty("model_main")
    public String getModelMain() {
        return modelMain;
    }

    /**
     * 
     * @param modelMain
     *     The model_main
     */
    @JsonProperty("model_main")
    public void setModelMain(String modelMain) {
        this.modelMain = modelMain;
    }

    /**
     * 
     * @return
     *     The modelSub
     */
    @JsonProperty("model_sub")
    public String getModelSub() {
        return modelSub;
    }

    /**
     * 
     * @param modelSub
     *     The model_sub
     */
    @JsonProperty("model_sub")
    public void setModelSub(String modelSub) {
        this.modelSub = modelSub;
    }

    /**
     * 
     * @return
     *     The classjobUse
     */
    @JsonProperty("classjob_use")
    public String getClassjobUse() {
        return classjobUse;
    }

    /**
     * 
     * @param classjobUse
     *     The classjob_use
     */
    @JsonProperty("classjob_use")
    public void setClassjobUse(String classjobUse) {
        this.classjobUse = classjobUse;
    }

    /**
     * 
     * @return
     *     The cooldownSeconds
     */
    @JsonProperty("cooldown_seconds")
    public String getCooldownSeconds() {
        return cooldownSeconds;
    }

    /**
     * 
     * @param cooldownSeconds
     *     The cooldown_seconds
     */
    @JsonProperty("cooldown_seconds")
    public void setCooldownSeconds(String cooldownSeconds) {
        this.cooldownSeconds = cooldownSeconds;
    }

    /**
     * 
     * @return
     *     The gcTurnIn
     */
    @JsonProperty("gc_turn_in")
    public String getGcTurnIn() {
        return gcTurnIn;
    }

    /**
     * 
     * @param gcTurnIn
     *     The gc_turn_in
     */
    @JsonProperty("gc_turn_in")
    public void setGcTurnIn(String gcTurnIn) {
        this.gcTurnIn = gcTurnIn;
    }

    /**
     * 
     * @return
     *     The grandCompany
     */
    @JsonProperty("grand_company")
    public String getGrandCompany() {
        return grandCompany;
    }

    /**
     * 
     * @param grandCompany
     *     The grand_company
     */
    @JsonProperty("grand_company")
    public void setGrandCompany(String grandCompany) {
        this.grandCompany = grandCompany;
    }

    /**
     * 
     * @return
     *     The baseParamModifier
     */
    @JsonProperty("base_param_modifier")
    public String getBaseParamModifier() {
        return baseParamModifier;
    }

    /**
     * 
     * @param baseParamModifier
     *     The base_param_modifier
     */
    @JsonProperty("base_param_modifier")
    public void setBaseParamModifier(String baseParamModifier) {
        this.baseParamModifier = baseParamModifier;
    }

    /**
     * 
     * @return
     *     The aetherialReduce
     */
    @JsonProperty("aetherial_reduce")
    public String getAetherialReduce() {
        return aetherialReduce;
    }

    /**
     * 
     * @param aetherialReduce
     *     The aetherial_reduce
     */
    @JsonProperty("aetherial_reduce")
    public void setAetherialReduce(String aetherialReduce) {
        this.aetherialReduce = aetherialReduce;
    }

    /**
     * 
     * @return
     *     The desynthesize
     */
    @JsonProperty("desynthesize")
    public String getDesynthesize() {
        return desynthesize;
    }

    /**
     * 
     * @param desynthesize
     *     The desynthesize
     */
    @JsonProperty("desynthesize")
    public void setDesynthesize(String desynthesize) {
        this.desynthesize = desynthesize;
    }

    /**
     * 
     * @return
     *     The itemUiKind
     */
    @JsonProperty("item_ui_kind")
    public String getItemUiKind() {
        return itemUiKind;
    }

    /**
     * 
     * @param itemUiKind
     *     The item_ui_kind
     */
    @JsonProperty("item_ui_kind")
    public void setItemUiKind(String itemUiKind) {
        this.itemUiKind = itemUiKind;
    }

    /**
     * 
     * @return
     *     The itemUiCategory
     */
    @JsonProperty("item_ui_category")
    public String getItemUiCategory() {
        return itemUiCategory;
    }

    /**
     * 
     * @param itemUiCategory
     *     The item_ui_category
     */
    @JsonProperty("item_ui_category")
    public void setItemUiCategory(String itemUiCategory) {
        this.itemUiCategory = itemUiCategory;
    }

    /**
     * 
     * @return
     *     The itemSearchCategory
     */
    @JsonProperty("item_search_category")
    public String getItemSearchCategory() {
        return itemSearchCategory;
    }

    /**
     * 
     * @param itemSearchCategory
     *     The item_search_category
     */
    @JsonProperty("item_search_category")
    public void setItemSearchCategory(String itemSearchCategory) {
        this.itemSearchCategory = itemSearchCategory;
    }

    /**
     * 
     * @return
     *     The itemAction
     */
    @JsonProperty("item_action")
    public String getItemAction() {
        return itemAction;
    }

    /**
     * 
     * @param itemAction
     *     The item_action
     */
    @JsonProperty("item_action")
    public void setItemAction(String itemAction) {
        this.itemAction = itemAction;
    }

    /**
     * 
     * @return
     *     The itemRepair
     */
    @JsonProperty("item_repair")
    public ItemRepair getItemRepair() {
        return itemRepair;
    }

    /**
     * 
     * @param itemRepair
     *     The item_repair
     */
    @JsonProperty("item_repair")
    public void setItemRepair(ItemRepair itemRepair) {
        this.itemRepair = itemRepair;
    }

    /**
     * 
     * @return
     *     The itemGlamour
     */
    @JsonProperty("item_glamour")
    public ItemGlamour getItemGlamour() {
        return itemGlamour;
    }

    /**
     * 
     * @param itemGlamour
     *     The item_glamour
     */
    @JsonProperty("item_glamour")
    public void setItemGlamour(ItemGlamour itemGlamour) {
        this.itemGlamour = itemGlamour;
    }

    /**
     * 
     * @return
     *     The reducibleClassjob
     */
    @JsonProperty("reducible_classjob")
    public Object getReducibleClassjob() {
        return reducibleClassjob;
    }

    /**
     * 
     * @param reducibleClassjob
     *     The reducible_classjob
     */
    @JsonProperty("reducible_classjob")
    public void setReducibleClassjob(Object reducibleClassjob) {
        this.reducibleClassjob = reducibleClassjob;
    }

    /**
     * 
     * @return
     *     The reducibleLevel
     */
    @JsonProperty("reducible_level")
    public String getReducibleLevel() {
        return reducibleLevel;
    }

    /**
     * 
     * @param reducibleLevel
     *     The reducible_level
     */
    @JsonProperty("reducible_level")
    public void setReducibleLevel(String reducibleLevel) {
        this.reducibleLevel = reducibleLevel;
    }

    /**
     * 
     * @return
     *     The equippableByRaceHyur
     */
    @JsonProperty("equippable_by_race_hyur")
    public String getEquippableByRaceHyur() {
        return equippableByRaceHyur;
    }

    /**
     * 
     * @param equippableByRaceHyur
     *     The equippable_by_race_hyur
     */
    @JsonProperty("equippable_by_race_hyur")
    public void setEquippableByRaceHyur(String equippableByRaceHyur) {
        this.equippableByRaceHyur = equippableByRaceHyur;
    }

    /**
     * 
     * @return
     *     The equippableByRaceElezen
     */
    @JsonProperty("equippable_by_race_elezen")
    public String getEquippableByRaceElezen() {
        return equippableByRaceElezen;
    }

    /**
     * 
     * @param equippableByRaceElezen
     *     The equippable_by_race_elezen
     */
    @JsonProperty("equippable_by_race_elezen")
    public void setEquippableByRaceElezen(String equippableByRaceElezen) {
        this.equippableByRaceElezen = equippableByRaceElezen;
    }

    /**
     * 
     * @return
     *     The equippableByRaceLalafell
     */
    @JsonProperty("equippable_by_race_lalafell")
    public String getEquippableByRaceLalafell() {
        return equippableByRaceLalafell;
    }

    /**
     * 
     * @param equippableByRaceLalafell
     *     The equippable_by_race_lalafell
     */
    @JsonProperty("equippable_by_race_lalafell")
    public void setEquippableByRaceLalafell(String equippableByRaceLalafell) {
        this.equippableByRaceLalafell = equippableByRaceLalafell;
    }

    /**
     * 
     * @return
     *     The equippableByRaceMiqote
     */
    @JsonProperty("equippable_by_race_miqote")
    public String getEquippableByRaceMiqote() {
        return equippableByRaceMiqote;
    }

    /**
     * 
     * @param equippableByRaceMiqote
     *     The equippable_by_race_miqote
     */
    @JsonProperty("equippable_by_race_miqote")
    public void setEquippableByRaceMiqote(String equippableByRaceMiqote) {
        this.equippableByRaceMiqote = equippableByRaceMiqote;
    }

    /**
     * 
     * @return
     *     The equippableByRaceRoegadyn
     */
    @JsonProperty("equippable_by_race_roegadyn")
    public String getEquippableByRaceRoegadyn() {
        return equippableByRaceRoegadyn;
    }

    /**
     * 
     * @param equippableByRaceRoegadyn
     *     The equippable_by_race_roegadyn
     */
    @JsonProperty("equippable_by_race_roegadyn")
    public void setEquippableByRaceRoegadyn(String equippableByRaceRoegadyn) {
        this.equippableByRaceRoegadyn = equippableByRaceRoegadyn;
    }

    /**
     * 
     * @return
     *     The equippableByRaceAura
     */
    @JsonProperty("equippable_by_race_aura")
    public String getEquippableByRaceAura() {
        return equippableByRaceAura;
    }

    /**
     * 
     * @param equippableByRaceAura
     *     The equippable_by_race_aura
     */
    @JsonProperty("equippable_by_race_aura")
    public void setEquippableByRaceAura(String equippableByRaceAura) {
        this.equippableByRaceAura = equippableByRaceAura;
    }

    /**
     * 
     * @return
     *     The equippableByGenderM
     */
    @JsonProperty("equippable_by_gender_m")
    public String getEquippableByGenderM() {
        return equippableByGenderM;
    }

    /**
     * 
     * @param equippableByGenderM
     *     The equippable_by_gender_m
     */
    @JsonProperty("equippable_by_gender_m")
    public void setEquippableByGenderM(String equippableByGenderM) {
        this.equippableByGenderM = equippableByGenderM;
    }

    /**
     * 
     * @return
     *     The equippableByGenderF
     */
    @JsonProperty("equippable_by_gender_f")
    public String getEquippableByGenderF() {
        return equippableByGenderF;
    }

    /**
     * 
     * @param equippableByGenderF
     *     The equippable_by_gender_f
     */
    @JsonProperty("equippable_by_gender_f")
    public void setEquippableByGenderF(String equippableByGenderF) {
        this.equippableByGenderF = equippableByGenderF;
    }

    /**
     * 
     * @return
     *     The classjobRepair
     */
    @JsonProperty("classjob_repair")
    public ClassjobRepair getClassjobRepair() {
        return classjobRepair;
    }

    /**
     * 
     * @param classjobRepair
     *     The classjob_repair
     */
    @JsonProperty("classjob_repair")
    public void setClassjobRepair(ClassjobRepair classjobRepair) {
        this.classjobRepair = classjobRepair;
    }

    /**
     * 
     * @return
     *     The lodestoneType
     */
    @JsonProperty("lodestone_type")
    public String getLodestoneType() {
        return lodestoneType;
    }

    /**
     * 
     * @param lodestoneType
     *     The lodestone_type
     */
    @JsonProperty("lodestone_type")
    public void setLodestoneType(String lodestoneType) {
        this.lodestoneType = lodestoneType;
    }

    /**
     * 
     * @return
     *     The lodestoneId
     */
    @JsonProperty("lodestone_id")
    public String getLodestoneId() {
        return lodestoneId;
    }

    /**
     * 
     * @param lodestoneId
     *     The lodestone_id
     */
    @JsonProperty("lodestone_id")
    public void setLodestoneId(String lodestoneId) {
        this.lodestoneId = lodestoneId;
    }

    /**
     * 
     * @return
     *     The sortKey
     */
    @JsonProperty("sort_key")
    public String getSortKey() {
        return sortKey;
    }

    /**
     * 
     * @param sortKey
     *     The sort_key
     */
    @JsonProperty("sort_key")
    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    /**
     * 
     * @return
     *     The isPvp
     */
    @JsonProperty("is_pvp")
    public String getIsPvp() {
        return isPvp;
    }

    /**
     * 
     * @param isPvp
     *     The is_pvp
     */
    @JsonProperty("is_pvp")
    public void setIsPvp(String isPvp) {
        this.isPvp = isPvp;
    }

    /**
     * 
     * @return
     *     The isUnique
     */
    @JsonProperty("is_unique")
    public String getIsUnique() {
        return isUnique;
    }

    /**
     * 
     * @param isUnique
     *     The is_unique
     */
    @JsonProperty("is_unique")
    public void setIsUnique(String isUnique) {
        this.isUnique = isUnique;
    }

    /**
     * 
     * @return
     *     The isUntradable
     */
    @JsonProperty("is_untradable")
    public String getIsUntradable() {
        return isUntradable;
    }

    /**
     * 
     * @param isUntradable
     *     The is_untradable
     */
    @JsonProperty("is_untradable")
    public void setIsUntradable(String isUntradable) {
        this.isUntradable = isUntradable;
    }

    /**
     * 
     * @return
     *     The isLegacy
     */
    @JsonProperty("is_legacy")
    public String getIsLegacy() {
        return isLegacy;
    }

    /**
     * 
     * @param isLegacy
     *     The is_legacy
     */
    @JsonProperty("is_legacy")
    public void setIsLegacy(String isLegacy) {
        this.isLegacy = isLegacy;
    }

    /**
     * 
     * @return
     *     The isDated
     */
    @JsonProperty("is_dated")
    public String getIsDated() {
        return isDated;
    }

    /**
     * 
     * @param isDated
     *     The is_dated
     */
    @JsonProperty("is_dated")
    public void setIsDated(String isDated) {
        this.isDated = isDated;
    }

    /**
     * 
     * @return
     *     The isCrestWorthy
     */
    @JsonProperty("is_crest_worthy")
    public String getIsCrestWorthy() {
        return isCrestWorthy;
    }

    /**
     * 
     * @param isCrestWorthy
     *     The is_crest_worthy
     */
    @JsonProperty("is_crest_worthy")
    public void setIsCrestWorthy(String isCrestWorthy) {
        this.isCrestWorthy = isCrestWorthy;
    }

    /**
     * 
     * @return
     *     The isDesynthesizable
     */
    @JsonProperty("is_desynthesizable")
    public String getIsDesynthesizable() {
        return isDesynthesizable;
    }

    /**
     * 
     * @param isDesynthesizable
     *     The is_desynthesizable
     */
    @JsonProperty("is_desynthesizable")
    public void setIsDesynthesizable(String isDesynthesizable) {
        this.isDesynthesizable = isDesynthesizable;
    }

    /**
     * 
     * @return
     *     The isProjectable
     */
    @JsonProperty("is_projectable")
    public String getIsProjectable() {
        return isProjectable;
    }

    /**
     * 
     * @param isProjectable
     *     The is_projectable
     */
    @JsonProperty("is_projectable")
    public void setIsProjectable(String isProjectable) {
        this.isProjectable = isProjectable;
    }

    /**
     * 
     * @return
     *     The isDyeable
     */
    @JsonProperty("is_dyeable")
    public String getIsDyeable() {
        return isDyeable;
    }

    /**
     * 
     * @param isDyeable
     *     The is_dyeable
     */
    @JsonProperty("is_dyeable")
    public void setIsDyeable(String isDyeable) {
        this.isDyeable = isDyeable;
    }

    /**
     * 
     * @return
     *     The isConvertible
     */
    @JsonProperty("is_convertible")
    public String getIsConvertible() {
        return isConvertible;
    }

    /**
     * 
     * @param isConvertible
     *     The is_convertible
     */
    @JsonProperty("is_convertible")
    public void setIsConvertible(String isConvertible) {
        this.isConvertible = isConvertible;
    }

    /**
     * 
     * @return
     *     The isReducible
     */
    @JsonProperty("is_reducible")
    public String getIsReducible() {
        return isReducible;
    }

    /**
     * 
     * @param isReducible
     *     The is_reducible
     */
    @JsonProperty("is_reducible")
    public void setIsReducible(String isReducible) {
        this.isReducible = isReducible;
    }

    /**
     * 
     * @return
     *     The isIndisposable
     */
    @JsonProperty("is_indisposable")
    public String getIsIndisposable() {
        return isIndisposable;
    }

    /**
     * 
     * @param isIndisposable
     *     The is_indisposable
     */
    @JsonProperty("is_indisposable")
    public void setIsIndisposable(String isIndisposable) {
        this.isIndisposable = isIndisposable;
    }

    /**
     * 
     * @return
     *     The isCollectable
     */
    @JsonProperty("is_collectable")
    public String getIsCollectable() {
        return isCollectable;
    }

    /**
     * 
     * @param isCollectable
     *     The is_collectable
     */
    @JsonProperty("is_collectable")
    public void setIsCollectable(String isCollectable) {
        this.isCollectable = isCollectable;
    }

    /**
     * 
     * @return
     *     The flagParams
     */
    @JsonProperty("flag_params")
    public String getFlagParams() {
        return flagParams;
    }

    /**
     * 
     * @param flagParams
     *     The flag_params
     */
    @JsonProperty("flag_params")
    public void setFlagParams(String flagParams) {
        this.flagParams = flagParams;
    }

    /**
     * 
     * @return
     *     The flagClassjob
     */
    @JsonProperty("flag_classjob")
    public String getFlagClassjob() {
        return flagClassjob;
    }

    /**
     * 
     * @param flagClassjob
     *     The flag_classjob
     */
    @JsonProperty("flag_classjob")
    public void setFlagClassjob(String flagClassjob) {
        this.flagClassjob = flagClassjob;
    }

    /**
     * 
     * @return
     *     The flagInstance
     */
    @JsonProperty("flag_instance")
    public String getFlagInstance() {
        return flagInstance;
    }

    /**
     * 
     * @param flagInstance
     *     The flag_instance
     */
    @JsonProperty("flag_instance")
    public void setFlagInstance(String flagInstance) {
        this.flagInstance = flagInstance;
    }

    /**
     * 
     * @return
     *     The flagInstanceChest
     */
    @JsonProperty("flag_instance_chest")
    public String getFlagInstanceChest() {
        return flagInstanceChest;
    }

    /**
     * 
     * @param flagInstanceChest
     *     The flag_instance_chest
     */
    @JsonProperty("flag_instance_chest")
    public void setFlagInstanceChest(String flagInstanceChest) {
        this.flagInstanceChest = flagInstanceChest;
    }

    /**
     * 
     * @return
     *     The flagInstanceReward
     */
    @JsonProperty("flag_instance_reward")
    public String getFlagInstanceReward() {
        return flagInstanceReward;
    }

    /**
     * 
     * @param flagInstanceReward
     *     The flag_instance_reward
     */
    @JsonProperty("flag_instance_reward")
    public void setFlagInstanceReward(String flagInstanceReward) {
        this.flagInstanceReward = flagInstanceReward;
    }

    /**
     * 
     * @return
     *     The flagQuest
     */
    @JsonProperty("flag_quest")
    public String getFlagQuest() {
        return flagQuest;
    }

    /**
     * 
     * @param flagQuest
     *     The flag_quest
     */
    @JsonProperty("flag_quest")
    public void setFlagQuest(String flagQuest) {
        this.flagQuest = flagQuest;
    }

    /**
     * 
     * @return
     *     The flagEnemy
     */
    @JsonProperty("flag_enemy")
    public String getFlagEnemy() {
        return flagEnemy;
    }

    /**
     * 
     * @param flagEnemy
     *     The flag_enemy
     */
    @JsonProperty("flag_enemy")
    public void setFlagEnemy(String flagEnemy) {
        this.flagEnemy = flagEnemy;
    }

    /**
     * 
     * @return
     *     The flagRecipe
     */
    @JsonProperty("flag_recipe")
    public String getFlagRecipe() {
        return flagRecipe;
    }

    /**
     * 
     * @param flagRecipe
     *     The flag_recipe
     */
    @JsonProperty("flag_recipe")
    public void setFlagRecipe(String flagRecipe) {
        this.flagRecipe = flagRecipe;
    }

    /**
     * 
     * @return
     *     The flagCraftable
     */
    @JsonProperty("flag_craftable")
    public String getFlagCraftable() {
        return flagCraftable;
    }

    /**
     * 
     * @param flagCraftable
     *     The flag_craftable
     */
    @JsonProperty("flag_craftable")
    public void setFlagCraftable(String flagCraftable) {
        this.flagCraftable = flagCraftable;
    }

    /**
     * 
     * @return
     *     The flagShop
     */
    @JsonProperty("flag_shop")
    public String getFlagShop() {
        return flagShop;
    }

    /**
     * 
     * @param flagShop
     *     The flag_shop
     */
    @JsonProperty("flag_shop")
    public void setFlagShop(String flagShop) {
        this.flagShop = flagShop;
    }

    /**
     * 
     * @return
     *     The flagGathering
     */
    @JsonProperty("flag_gathering")
    public String getFlagGathering() {
        return flagGathering;
    }

    /**
     * 
     * @param flagGathering
     *     The flag_gathering
     */
    @JsonProperty("flag_gathering")
    public void setFlagGathering(String flagGathering) {
        this.flagGathering = flagGathering;
    }

    /**
     * 
     * @return
     *     The flagAchievement
     */
    @JsonProperty("flag_achievement")
    public String getFlagAchievement() {
        return flagAchievement;
    }

    /**
     * 
     * @param flagAchievement
     *     The flag_achievement
     */
    @JsonProperty("flag_achievement")
    public void setFlagAchievement(String flagAchievement) {
        this.flagAchievement = flagAchievement;
    }

    /**
     * 
     * @return
     *     The parsedLodestone
     */
    @JsonProperty("parsed_lodestone")
    public String getParsedLodestone() {
        return parsedLodestone;
    }

    /**
     * 
     * @param parsedLodestone
     *     The parsed_lodestone
     */
    @JsonProperty("parsed_lodestone")
    public void setParsedLodestone(String parsedLodestone) {
        this.parsedLodestone = parsedLodestone;
    }

    /**
     * 
     * @return
     *     The parsedLodestoneTime
     */
    @JsonProperty("parsed_lodestone_time")
    public String getParsedLodestoneTime() {
        return parsedLodestoneTime;
    }

    /**
     * 
     * @param parsedLodestoneTime
     *     The parsed_lodestone_time
     */
    @JsonProperty("parsed_lodestone_time")
    public void setParsedLodestoneTime(String parsedLodestoneTime) {
        this.parsedLodestoneTime = parsedLodestoneTime;
    }

    /**
     * 
     * @return
     *     The patch
     */
    @JsonProperty("patch")
    public Patch getPatch() {
        return patch;
    }

    /**
     * 
     * @param patch
     *     The patch
     */
    @JsonProperty("patch")
    public void setPatch(Patch patch) {
        this.patch = patch;
    }

    /**
     * 
     * @return
     *     The updated
     */
    @JsonProperty("updated")
    public String getUpdated() {
        return updated;
    }

    /**
     * 
     * @param updated
     *     The updated
     */
    @JsonProperty("updated")
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    /**
     * 
     * @return
     *     The seriesName
     */
    @JsonProperty("series_name")
    public Object getSeriesName() {
        return seriesName;
    }

    /**
     * 
     * @param seriesName
     *     The series_name
     */
    @JsonProperty("series_name")
    public void setSeriesName(Object seriesName) {
        this.seriesName = seriesName;
    }

    /**
     * 
     * @return
     *     The bonus
     */
    @JsonProperty("bonus")
    public Object getBonus() {
        return bonus;
    }

    /**
     * 
     * @param bonus
     *     The bonus
     */
    @JsonProperty("bonus")
    public void setBonus(Object bonus) {
        this.bonus = bonus;
    }

    /**
     * 
     * @return
     *     The bonusName
     */
    @JsonProperty("bonus_name")
    public Object getBonusName() {
        return bonusName;
    }

    /**
     * 
     * @param bonusName
     *     The bonus_name
     */
    @JsonProperty("bonus_name")
    public void setBonusName(Object bonusName) {
        this.bonusName = bonusName;
    }

    /**
     * 
     * @return
     *     The category
     */
    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    /**
     * 
     * @param category
     *     The category
     */
    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 
     * @return
     *     The categoryName
     */
    @JsonProperty("category_name")
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 
     * @param categoryName
     *     The category_name
     */
    @JsonProperty("category_name")
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * 
     * @return
     *     The kind
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * 
     * @param kind
     *     The kind
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * 
     * @return
     *     The kindName
     */
    @JsonProperty("kind_name")
    public String getKindName() {
        return kindName;
    }

    /**
     * 
     * @param kindName
     *     The kind_name
     */
    @JsonProperty("kind_name")
    public void setKindName(String kindName) {
        this.kindName = kindName;
    }

    /**
     * 
     * @return
     *     The slot
     */
    @JsonProperty("slot")
    public String getSlot() {
        return slot;
    }

    /**
     * 
     * @param slot
     *     The slot
     */
    @JsonProperty("slot")
    public void setSlot(String slot) {
        this.slot = slot;
    }

    /**
     * 
     * @return
     *     The slotName
     */
    @JsonProperty("slot_name")
    public String getSlotName() {
        return slotName;
    }

    /**
     * 
     * @param slotName
     *     The slot_name
     */
    @JsonProperty("slot_name")
    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }

    /**
     * 
     * @return
     *     The classjobs
     */
    @JsonProperty("classjobs")
    public List<Classjob> getClassjobs() {
        return classjobs;
    }

    /**
     * 
     * @param classjobs
     *     The classjobs
     */
    @JsonProperty("classjobs")
    public void setClassjobs(List<Classjob> classjobs) {
        this.classjobs = classjobs;
    }

    /**
     * 
     * @return
     *     The attributesBase
     */
    @JsonProperty("attributes_base")
    public AttributesBase getAttributesBase() {
        return attributesBase;
    }

    /**
     * 
     * @param attributesBase
     *     The attributes_base
     */
    @JsonProperty("attributes_base")
    public void setAttributesBase(AttributesBase attributesBase) {
        this.attributesBase = attributesBase;
    }

    /**
     * 
     * @return
     *     The attributesParams
     */
    @JsonProperty("attributes_params")
    public List<AttributesParam> getAttributesParams() {
        return attributesParams;
    }

    /**
     * 
     * @param attributesParams
     *     The attributes_params
     */
    @JsonProperty("attributes_params")
    public void setAttributesParams(List<AttributesParam> attributesParams) {
        this.attributesParams = attributesParams;
    }

    /**
     * 
     * @return
     *     The gathering
     */
    @JsonProperty("gathering")
    public List<Object> getGathering() {
        return gathering;
    }

    /**
     * 
     * @param gathering
     *     The gathering
     */
    @JsonProperty("gathering")
    public void setGathering(List<Object> gathering) {
        this.gathering = gathering;
    }

    /**
     * 
     * @return
     *     The recipes
     */
    @JsonProperty("recipes")
    public List<Object> getRecipes() {
        return recipes;
    }

    /**
     * 
     * @param recipes
     *     The recipes
     */
    @JsonProperty("recipes")
    public void setRecipes(List<Object> recipes) {
        this.recipes = recipes;
    }

    /**
     * 
     * @return
     *     The craftable
     */
    @JsonProperty("craftable")
    public List<Object> getCraftable() {
        return craftable;
    }

    /**
     * 
     * @param craftable
     *     The craftable
     */
    @JsonProperty("craftable")
    public void setCraftable(List<Object> craftable) {
        this.craftable = craftable;
    }

    /**
     * 
     * @return
     *     The instances
     */
    @JsonProperty("instances")
    public List<Object> getInstances() {
        return instances;
    }

    /**
     * 
     * @param instances
     *     The instances
     */
    @JsonProperty("instances")
    public void setInstances(List<Object> instances) {
        this.instances = instances;
    }

    /**
     * 
     * @return
     *     The enemies
     */
    @JsonProperty("enemies")
    public List<Object> getEnemies() {
        return enemies;
    }

    /**
     * 
     * @param enemies
     *     The enemies
     */
    @JsonProperty("enemies")
    public void setEnemies(List<Object> enemies) {
        this.enemies = enemies;
    }

    /**
     * 
     * @return
     *     The achievements
     */
    @JsonProperty("achievements")
    public List<Object> getAchievements() {
        return achievements;
    }

    /**
     * 
     * @param achievements
     *     The achievements
     */
    @JsonProperty("achievements")
    public void setAchievements(List<Object> achievements) {
        this.achievements = achievements;
    }

    /**
     * 
     * @return
     *     The quests
     */
    @JsonProperty("quests")
    public List<Object> getQuests() {
        return quests;
    }

    /**
     * 
     * @param quests
     *     The quests
     */
    @JsonProperty("quests")
    public void setQuests(List<Object> quests) {
        this.quests = quests;
    }

    /**
     * 
     * @return
     *     The shops
     */
    @JsonProperty("shops")
    public List<Object> getShops() {
        return shops;
    }

    /**
     * 
     * @param shops
     *     The shops
     */
    @JsonProperty("shops")
    public void setShops(List<Object> shops) {
        this.shops = shops;
    }

    /**
     * 
     * @return
     *     The url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The urlApi
     */
    @JsonProperty("url_api")
    public String getUrlApi() {
        return urlApi;
    }

    /**
     * 
     * @param urlApi
     *     The url_api
     */
    @JsonProperty("url_api")
    public void setUrlApi(String urlApi) {
        this.urlApi = urlApi;
    }

    /**
     * 
     * @return
     *     The urlXivdb
     */
    @JsonProperty("url_xivdb")
    public String getUrlXivdb() {
        return urlXivdb;
    }

    /**
     * 
     * @param urlXivdb
     *     The url_xivdb
     */
    @JsonProperty("url_xivdb")
    public void setUrlXivdb(String urlXivdb) {
        this.urlXivdb = urlXivdb;
    }

    /**
     * 
     * @return
     *     The urlXivdbJa
     */
    @JsonProperty("url_xivdb_ja")
    public String getUrlXivdbJa() {
        return urlXivdbJa;
    }

    /**
     * 
     * @param urlXivdbJa
     *     The url_xivdb_ja
     */
    @JsonProperty("url_xivdb_ja")
    public void setUrlXivdbJa(String urlXivdbJa) {
        this.urlXivdbJa = urlXivdbJa;
    }

    /**
     * 
     * @return
     *     The urlXivdbFr
     */
    @JsonProperty("url_xivdb_fr")
    public String getUrlXivdbFr() {
        return urlXivdbFr;
    }

    /**
     * 
     * @param urlXivdbFr
     *     The url_xivdb_fr
     */
    @JsonProperty("url_xivdb_fr")
    public void setUrlXivdbFr(String urlXivdbFr) {
        this.urlXivdbFr = urlXivdbFr;
    }

    /**
     * 
     * @return
     *     The urlXivdbDe
     */
    @JsonProperty("url_xivdb_de")
    public String getUrlXivdbDe() {
        return urlXivdbDe;
    }

    /**
     * 
     * @param urlXivdbDe
     *     The url_xivdb_de
     */
    @JsonProperty("url_xivdb_de")
    public void setUrlXivdbDe(String urlXivdbDe) {
        this.urlXivdbDe = urlXivdbDe;
    }

    /**
     * 
     * @return
     *     The urlLodestone
     */
    @JsonProperty("url_lodestone")
    public String getUrlLodestone() {
        return urlLodestone;
    }

    /**
     * 
     * @param urlLodestone
     *     The url_lodestone
     */
    @JsonProperty("url_lodestone")
    public void setUrlLodestone(String urlLodestone) {
        this.urlLodestone = urlLodestone;
    }

    /**
     * 
     * @return
     *     The urlType
     */
    @JsonProperty("url_type")
    public String getUrlType() {
        return urlType;
    }

    /**
     * 
     * @param urlType
     *     The url_type
     */
    @JsonProperty("url_type")
    public void setUrlType(String urlType) {
        this.urlType = urlType;
    }

    /**
     * 
     * @return
     *     The iconHq
     */
    @JsonProperty("icon_hq")
    public String getIconHq() {
        return iconHq;
    }

    /**
     * 
     * @param iconHq
     *     The icon_hq
     */
    @JsonProperty("icon_hq")
    public void setIconHq(String iconHq) {
        this.iconHq = iconHq;
    }

    /**
     * 
     * @return
     *     The color
     */
    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    /**
     * 
     * @param color
     *     The color
     */
    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 
     * @return
     *     The repairCost
     */
    @JsonProperty("repair_cost")
    public int getRepairCost() {
        return repairCost;
    }

    /**
     * 
     * @param repairCost
     *     The repair_cost
     */
    @JsonProperty("repair_cost")
    public void setRepairCost(int repairCost) {
        this.repairCost = repairCost;
    }

    /**
     * 
     * @return
     *     The Cid
     */
    @JsonProperty("_cid")
    public int getCid() {
        return Cid;
    }

    /**
     * 
     * @param Cid
     *     The _cid
     */
    @JsonProperty("_cid")
    public void setCid(int Cid) {
        this.Cid = Cid;
    }

    /**
     * 
     * @return
     *     The Type
     */
    @JsonProperty("_type")
    public String getType() {
        return Type;
    }

    /**
     * 
     * @param Type
     *     The _type
     */
    @JsonProperty("_type")
    public void setType(String Type) {
        this.Type = Type;
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
