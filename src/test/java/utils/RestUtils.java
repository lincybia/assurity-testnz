package utils;

import data.EnvironmentData;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RestUtils {

    public static RequestSpecification createRequestSpecification() {

        return new RequestSpecBuilder()
                .setBaseUri(EnvironmentData.BASEURI.getEnvironmentData())
                .setBasePath(EnvironmentData.BASEPATH.getEnvironmentData())
                .build();
    }
}
