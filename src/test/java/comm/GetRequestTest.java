package comm;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;

public class GetRequestTest {

    @Test
    public void testGetRequest() {
        RestAssured.baseURI = "https://postman-echo.com";

        given().
                when().
                get("/get").
                then().
                assertThat().
                statusCode(200).
                body("args", notNullValue()).
                body("headers", notNullValue()).
                body("url", equalTo("https://postman-echo.com/get"));
    }
}
