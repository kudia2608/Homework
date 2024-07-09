package comm;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class PatchRequestTest {

    @Test
    public void testPatchRequest() {
        RestAssured.baseURI = "https://postman-echo.com";

        given().
                body("This is a patch request").
                when().
                patch("/patch").
                then().
                assertThat().
                statusCode(200).
                body("data", equalTo("This is a patch request")).
                body("headers", notNullValue()).
                body("url", equalTo("https://postman-echo.com/patch"));
    }
}
