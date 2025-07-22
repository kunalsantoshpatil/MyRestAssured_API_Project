package api_classes;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;  // ✅ Required for `not(empty())`

public class TC_02_GetAll_Bookings {

    @Test
    public void getAllBookings() throws InterruptedException {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";

        given()
            .header("Accept", "application/json")
        .when()
            .get("/booking")
        .then()
            .statusCode(200)
            .body("bookingid", not(empty()));
            Thread.sleep(3000); // ✅ Verifies booking list is not empty
    }
}
