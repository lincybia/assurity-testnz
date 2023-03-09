import categoryDetailsResponse.CategoryDetails;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class CategoryBaseTest {

    protected RequestSpecification requestSpecification = null;
    protected ResponseSpecification responseSpecification = null;
    protected Response response = null;
    protected CategoryDetails categoryDetails = null;

    @BeforeClass
    public void setup() {

        requestSpecification = RestUtils.createRequestSpecification();
        responseSpecification = RestUtils.createResponseSpecificationWithStatus200();
    }

    @AfterClass
    public void afterTest() {

        RestUtils.resetBasePath();
        RestUtils.resetBaseURI();
    }
}
