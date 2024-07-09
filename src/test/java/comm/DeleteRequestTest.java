package comm;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;

public class DeleteRequestTest {

    @Test
    public void testDeleteRequest() {
        RestAssured.baseURI = "https://postman-echo.com";

        given().
                when().
                delete("/delete").
                then().
                assertThat().
                statusCode(200).
                body("headers", notNullValue()).
                body("url", equalTo("https://postman-echo.com/delete"));
    }
}
