package Test3;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

public class Cookies {
	
	//@Test(priority=1)
	void Cookies()
	{
		given()
			
		.when()
			.get("https://www.google.com/")
		
		.then()
			.cookie("AEC", "Ad49MVHXs4fwaRLDjKFC7X7lyl7af6XN6HKUAUPYNl9J06crcTg0uij5rw")
			.log().all();
		
	}
	
	@Test(priority = 2)
	void getCookies()
	
	{
		Response res=given()
			
		
		.when()
			.get("https://www.google.com/");
		
		//get single cookies
		//String cookie_value=res.getCookie("AEC");
		//System.out.println("Value of cookie is==>"+cookie_value);
			
		//get all cookies
		Map<String,String> cookies_values=res.getCookies();
		
		//System.out.println(cookies_values.keySet());
		
		for(String k:cookies_values.keySet())
		{
			String cookies_value=res.getCookie(k);
			System.out.println(k+"     "+cookies_value);
		}
		
	}


}
