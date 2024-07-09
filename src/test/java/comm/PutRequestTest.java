package comm;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class PutRequestTest {

    @Test
    public void testPutRequest() {
        RestAssured.baseURI = "https://postman-echo.com";

        given().
                body("This is a put request").
                when().
                put("/put").
                then().
                assertThat().
                statusCode(200).
                body("data", equalTo("This is a put request")).
                body("headers", notNullValue()).
                body("url", equalTo("https://postman-echo.com/put"));
    }
}
