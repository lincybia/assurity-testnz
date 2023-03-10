package steps;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.RestUtils;

public class CategoryBaseStep {

    protected static RequestSpecification requestSpecification = null;
    protected Response response = null;

    public static void setRequestSpec() {

        requestSpecification = RestUtils.createRequestSpecification();
    }
}
