package api_classes;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class TC_05_Update_Booking {
	@Test
	public void updateBooking() throws InterruptedException {
	    String token = given()
	        .header("Content-Type", "application/json")
	        .body(Payload_Manager.authPayload())
	        .log().body()
	    .post("/auth")
	    .jsonPath().getString("token");

	    int bookingId = TC_03_Create_Booking.bookingId;

	    given()
	        .header("Content-Type", "application/json")
	        .header("Cookie", "token=" + token)
	        .body(Payload_Manager.updateBookingPayload())
	    .when()
	        .put("/booking/" + bookingId)
	    .then()
	        .statusCode(200)
	        .log().body();
        System.out.println("Update ID"+bookingId);
	    Thread.sleep(3000);
	}
}
