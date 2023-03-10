package test;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Feature("Verify Category Details")
public class CategoryTest extends CategoryBaseTest {

    @Test(description = "Verify Category Details", dataProvider = "category-data-provider")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test verifies the category name, canRelist and description for the Promotion-Gallery")
    public void CategoryDetailsTest(int categoryIdPathParam, Boolean isCatalogueQueryParam, String categoryNameExpected, Boolean isCanRelistExpected,
                                    String promotionNameExpected, String galleryPromotionDescExpected) {

        categoryStep
                .givenIGetCategoryDetails(categoryIdPathParam, isCatalogueQueryParam)
                .thenIVerifyCategoryName(categoryNameExpected)
                .thenIVerifyIsCanReList(isCanRelistExpected)
                .thenIVerifyPromotionDescription(promotionNameExpected, galleryPromotionDescExpected);
    }

    @DataProvider(name = "category-data-provider")
    public static Object[][] categoryTestData() {

        return new Object[][]{
                {6327, Boolean.FALSE, "Carbon credits", Boolean.TRUE, "Gallery", "Good position in category"}
        };
    }
}