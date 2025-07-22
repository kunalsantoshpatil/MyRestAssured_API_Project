package api_classes;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.annotations.Test;


	public class TC_06_Partial_Update_Booking extends BaseTest {
	    @Test
	    public void partialUpdateBookingTest() throws InterruptedException {
	        int bookingId = TC_03_Create_Booking.bookingId;

	        JSONObject patchPayload = new JSONObject();
	        patchPayload.put("firstname", "PatchName");

	        given()
	            .header("Content-Type", "application/json")
	            .header("Cookie", "token=" + token)
	            .body(patchPayload.toString())
	        .when()
	            .patch(BookingEndpoints.UPDATE_BOOKING.replace("{id}", String.valueOf(bookingId)))
	        .then()
	            .statusCode(200);
	        System.out.println("Partial update"+bookingId);
	        Thread.sleep(3000);
	    }
	}

            
    

