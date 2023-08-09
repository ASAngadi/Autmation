package Test3;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class PathQueryParameter {
	
	//https://reqres.in/api/usres?page=2&id=5
	
	@Test(priority = 1)
	void testQueryAndPathParameters()
	{
		
		given()
			.pathParam("mypath", "user")
			.queryParam("page",2)
			.queryParam("id",5)
		
		.when()
			.get("https://reqres.in/api/{mypath}")
		
		.then()
			.statusCode(200)
			.log().all();
		
	}
	
	
}
