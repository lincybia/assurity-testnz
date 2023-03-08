
package categoryDetailsResponse;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CategoryId",
    "Name",
    "Path",
    "CanListAuctions",
    "CanListClassifieds",
    "CanRelist",
    "LegalNotice",
    "DefaultDuration",
    "AllowedDurations",
    "Fees",
    "FreePhotoCount",
    "MaximumPhotoCount",
    "IsFreeToRelist",
    "Promotions",
    "EmbeddedContentOptions",
    "MaximumTitleLength",
    "AreaOfBusiness",
    "DefaultRelistDuration",
    "CanUseCounterOffers"
})
@Generated("jsonschema2pojo")
public class CategoryDetails {

    @JsonProperty("CategoryId")
    private Integer categoryId;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Path")
    private String path;
    @JsonProperty("CanListAuctions")
    private Boolean canListAuctions;
    @JsonProperty("CanListClassifieds")
    private Boolean canListClassifieds;
    @JsonProperty("CanRelist")
    private Boolean canRelist;
    @JsonProperty("LegalNotice")
    private String legalNotice;
    @JsonProperty("DefaultDuration")
    private Integer defaultDuration;
    @JsonProperty("AllowedDurations")
    private List<Integer> allowedDurations;
    @JsonProperty("Fees")
    private Fees fees;
    @JsonProperty("FreePhotoCount")
    private Integer freePhotoCount;
    @JsonProperty("MaximumPhotoCount")
    private Integer maximumPhotoCount;
    @JsonProperty("IsFreeToRelist")
    private Boolean isFreeToRelist;
    @JsonProperty("Promotions")
    private List<Promotion> promotions;
    @JsonProperty("EmbeddedContentOptions")
    private List<Object> embeddedContentOptions;
    @JsonProperty("MaximumTitleLength")
    private Integer maximumTitleLength;
    @JsonProperty("AreaOfBusiness")
    private Integer areaOfBusiness;
    @JsonProperty("DefaultRelistDuration")
    private Integer defaultRelistDuration;
    @JsonProperty("CanUseCounterOffers")
    private Boolean canUseCounterOffers;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("CategoryId")
    public Integer getCategoryId() {
        return categoryId;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Path")
    public String getPath() {
        return path;
    }

    @JsonProperty("CanListAuctions")
    public Boolean getCanListAuctions() {
        return canListAuctions;
    }

    @JsonProperty("CanListClassifieds")
    public Boolean getCanListClassifieds() {
        return canListClassifieds;
    }

    @JsonProperty("CanRelist")
    public Boolean getCanRelist() {
        return canRelist;
    }

    @JsonProperty("LegalNotice")
    public String getLegalNotice() {
        return legalNotice;
    }

    @JsonProperty("DefaultDuration")
    public Integer getDefaultDuration() {
        return defaultDuration;
    }

    @JsonProperty("AllowedDurations")
    public List<Integer> getAllowedDurations() {
        return allowedDurations;
    }

    @JsonProperty("Fees")
    public Fees getFees() {
        return fees;
    }

    @JsonProperty("FreePhotoCount")
    public Integer getFreePhotoCount() {
        return freePhotoCount;
    }

    @JsonProperty("MaximumPhotoCount")
    public Integer getMaximumPhotoCount() {
        return maximumPhotoCount;
    }

    @JsonProperty("IsFreeToRelist")
    public Boolean getIsFreeToRelist() {
        return isFreeToRelist;
    }

    @JsonProperty("Promotions")
    public List<Promotion> getPromotions() {
        return promotions;
    }

    @JsonProperty("EmbeddedContentOptions")
    public List<Object> getEmbeddedContentOptions() {
        return embeddedContentOptions;
    }

    @JsonProperty("MaximumTitleLength")
    public Integer getMaximumTitleLength() {
        return maximumTitleLength;
    }

    @JsonProperty("AreaOfBusiness")
    public Integer getAreaOfBusiness() {
        return areaOfBusiness;
    }

    @JsonProperty("DefaultRelistDuration")
    public Integer getDefaultRelistDuration() {
        return defaultRelistDuration;
    }

    @JsonProperty("CanUseCounterOffers")
    public Boolean getCanUseCounterOffers() {
        return canUseCounterOffers;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }
}
