package api_classes;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeSuite;
import static io.restassured.RestAssured.*;
import org.json.JSONObject;

public class BaseTest {
    public static String token;

    @BeforeSuite
    public void generateToken() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";

        Response res = given()
            .header("Content-Type", "application/json")
            .body(new JSONObject()
                .put("username", "admin")
                .put("password", "password123")
                .toString())
        .when()
            .post("/auth")
        .then()
            .statusCode(200)
            .extract().response();

        token = res.jsonPath().getString("token");
        System.out.println("Token generated: " + token);
    }
}
