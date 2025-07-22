package api_classes;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


	public class TC_07_Delete_Booking extends BaseTest {
	    @Test
	    public void deleteBookingTest() throws InterruptedException {
	        int bookingId = TC_03_Create_Booking.bookingId;

	        given()
	            .header("Cookie", "token=" + token)
	        .when()
	            .delete("/booking/"+bookingId)
	        .then()
	            .statusCode(201);
	        Thread.sleep(3000);
	    }
	}


