package comm;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class PostFormDataTest {

    @Test
    public void testPostFormData() {
        RestAssured.baseURI = "https://postman-echo.com";

        Response response = given().
                contentType("application/x-www-form-urlencoded; charset=UTF-8").
                formParam("key1", "value1").
                formParam("key2", "value2").
                when().
                post("/post").
                then().
                log().all(). // Логирование запроса и ответа
                        assertThat().
                statusCode(200).
                body("form.key1", equalTo("value1")).
                body("form.key2", equalTo("value2")).
                body("headers", notNullValue()).
                body("url", equalTo("https://postman-echo.com/post")).
                extract().response();

        // Дополнительное логирование
        System.out.println("Response Body: " + response.getBody().asString());
    }
}
