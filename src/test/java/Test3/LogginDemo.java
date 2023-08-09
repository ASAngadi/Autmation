package Test3;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import org.json.JSONObject;


public class LogginDemo {

	
	@Test(priority=1)
	void testLogs()
	{
		given()
		
		
		.when()
			.get("https://www.google.com/")
		
		.then()
			//.log().body()
			//.log().cookies()
			  .log().all();
	}

}
