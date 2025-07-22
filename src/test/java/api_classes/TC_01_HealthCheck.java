package api_classes;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

@Test
public class TC_01_HealthCheck {
	public void HealthCheck()
	{
		given()
		.when()
		.get("/ping")
		.then()
		.statusCode(201)
		.log().all();
	}
	
	

}
