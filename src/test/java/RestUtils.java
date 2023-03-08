import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class RestUtils {

    public static RequestSpecification createRequestSpecification() {

        return new RequestSpecBuilder()
                .setBaseUri(EnvironmentData.BASEURI.getEnvironmentData())
                .setBasePath(EnvironmentData.BASEPATH.getEnvironmentData())
                .build();
    }

    public static ResponseSpecification createResponseSpecificationWithStatus200() {

        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectContentType(ContentType.JSON)
                .build();
    }

    public static void resetBaseURI() {

        RestAssured.baseURI = null;
    }

    public static void resetBasePath() {

        RestAssured.basePath = null;
    }

    public static void validateResponse(Response response, ResponseSpecification responseSpecification) {

        response.then().spec(responseSpecification);
    }
}
