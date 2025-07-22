package api_classes;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class TC_04_Get_Perticular_booking {
	@Test
	public void getBookingById() throws InterruptedException {
	    int bookingId = TC_03_Create_Booking.bookingId; // Use dynamic ID if needed
	    given()
	        .header("Accept", "application/json")
	        .log().body()
	    .when()
	        .get("/booking/" + bookingId)
	    .then()
	        .statusCode(200)
	        .log().body();
        System.out.println("GetID"+bookingId);
	    Thread.sleep(3000);
	}

}
