import categoryDetailsResponse.CategoryDetails;
import categoryDetailsResponse.Promotion;
import org.testng.annotations.Test;

import java.util.stream.Stream;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class CategoryTest extends CategoryBaseTest {

    @Test
    public void CategoryDetailsTest() {

        getCategoryDetails(6327, Boolean.FALSE);
        thenIVerifyCategoryName("Carbon credits");
        thenIVerifyCanRelist(Boolean.TRUE);
        thenIVerifyPromotionsGallery("Gallery", "Good position in category");
    }

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

    private void thenIVerifyCategoryName(String expectedName) {

        assertThat(categoryDetails.getName(), is(expectedName));
    }

    private void thenIVerifyCanRelist(Boolean isCanRelist) {

        assertThat(categoryDetails.getCanRelist(), is(isCanRelist));
    }

    private void thenIVerifyPromotionsGallery(String promotionName, String expectedDescription) {

        Stream<Promotion> promotion = categoryDetails.getPromotions().stream().filter(x -> x.getName().equals(promotionName));
        assertThat(promotion.findFirst().get().getDescription(), containsString(expectedDescription));
    }
}