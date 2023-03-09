import categoryDetailsResponse.CategoryDetails;
import categoryDetailsResponse.Promotion;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

import java.util.stream.Stream;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

@Feature("Verify Category Details")
public class CategoryTest extends CategoryBaseTest {

    @Test(description = "GET Category Details")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test verifies the category name, canRelist and description for the Promotion-Gallery")
    public void CategoryDetailsTest() {

        getCategoryDetails(6327, Boolean.FALSE);
        thenIVerifyCategoryName("Carbon credits");
        thenIVerifyCanRelist(Boolean.TRUE);
        thenIVerifyPromotionsGallery("Gallery", "Good position in category");
    }

    @Description("Validate the response")
    private void getCategoryDetails(int categoryID, Boolean isCatalogue) {

        response = given()
                .spec(requestSpecification)
                .pathParam("categoryID", categoryID)
                .pathParam("details", "Details.json")
                .queryParam("catalogue", isCatalogue)
                .when()
                .log()
                .all()
                .get("/{categoryID}/{details}");
        RestUtils.validateResponse(response, responseSpecification);
        categoryDetails = response.as(CategoryDetails.class);
    }

    @Step("verify the Category name")
    private void thenIVerifyCategoryName(String expectedName) {

        assertThat(categoryDetails.getName(), is(expectedName));
    }

    @Step("Verify the CanReList")
    private void thenIVerifyCanRelist(Boolean isCanRelist) {

        assertThat(categoryDetails.getCanRelist(), is(isCanRelist));
    }

    @Step("Verify the Description for the Promotion - Gallery")
    private void thenIVerifyPromotionsGallery(String promotionName, String expectedDescription) {

        Stream<Promotion> promotion = categoryDetails.getPromotions().stream().filter(x -> x.getName().equals(promotionName));
        assertThat(promotion.findFirst().get().getDescription(), containsString(expectedDescription));
    }
}