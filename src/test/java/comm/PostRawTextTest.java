package comm;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class PostRawTextTest {

    @Test
    public void testPostRawText() {
        RestAssured.baseURI = "https://postman-echo.com";

        given().
                body("This is a raw text").
                when().
                post("/post").
                then().
                assertThat().
                statusCode(200).
                body("data", equalTo("This is a raw text")).
                body("headers", notNullValue()).
                body("url", equalTo("https://postman-echo.com/post"));
    }
}
