package steps;

import categoryDetailsResponse.CategoryDetails;
import categoryDetailsResponse.Promotion;
import io.qameta.allure.Step;
import org.apache.http.HttpStatus;

import java.util.stream.Stream;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.core.Is.is;

public class CategoryStep extends CategoryBaseStep {

    private CategoryDetails categoryDetails;

    @Step
    public CategoryStep givenIGetCategoryDetails(int categoryId, boolean isCatalogue) {

        response = given()
                .spec(requestSpecification)
                .pathParam("categoryID", categoryId)
                .queryParam("catalogue", isCatalogue)
                .when()
                .get("/{categoryID}/Details.json");
        thenIVerifyGetCategoryDetailsResponse();
        categoryDetails = response.as(CategoryDetails.class);
        return this;
    }

    @Step
    private void thenIVerifyGetCategoryDetailsResponse() {

        assertThat("Error Occurred", response.getStatusCode(), is(HttpStatus.SC_OK));
    }

    @Step
    public CategoryStep thenIVerifyCategoryName(String categoryName) {

        assertThat("Category Name Not As Expected -> Carbon credits", categoryDetails.getName(), is(categoryName));
        return this;
    }

    @Step
    public CategoryStep thenIVerifyIsCanReList(Boolean isCanReList) {

        assertThat("CanReList Not as Expected-> true ", categoryDetails.getCanRelist(), is(isCanReList));
        return this;
    }

    @Step
    public CategoryStep thenIVerifyPromotionDescription(String promotionName, String promotionDescription) {

        Stream<Promotion> promotion = categoryDetails.getPromotions().stream().filter(x -> x.getName().equals(promotionName));
        assertThat("Gallery Promotion description is not as expected",
                promotion.findFirst().get().getDescription(), is(containsString(promotionDescription)));
        return this;
    }
}
