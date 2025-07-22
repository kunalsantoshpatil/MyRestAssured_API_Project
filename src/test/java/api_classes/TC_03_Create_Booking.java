
package api_classes;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class TC_03_Create_Booking extends BaseTest {
    public static int bookingId;

    @Test
    public void createBookingTest() throws InterruptedException {
        Response response = given()
                .header("Content-Type", "application/json")
                .body(Payload_Manager.createBookingPayload().toString())
                .log().body()
            .when()
                .post(BookingEndpoints.CREATE_BOOKING)
            .then()
                .statusCode(200)
                .log().body()
                .extract().response();

        bookingId = response.jsonPath().getInt("bookingid");
        Assert.assertTrue(bookingId > 0);
        System.out.println("Create"+bookingId);
        Thread.sleep(3000);
    }
}
