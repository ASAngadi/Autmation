package Test3;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import org.json.JSONObject;

 

import io.restassured.http.Header.*;
import io.restassured.http.Headers;


import io.restassured.response.Response;


public class Header
{
	
	@Test(priority=1)
	void Header()

	{
			given()
			
			.when()
				.get("https://www.google.com/")
			
			.then()
				.header("Content-Type","text/html; charset=ISO-8859-1")
				.and()
				.header("Content-Encoding", "gzip")
				.and()
				.header("Server", "gws")
				.log().headers();
	}
	
	@Test(priority=2)
	void getHeader()
	{
		Response res= given()
				
				   .when()
						.get("https://www.google.com/");
		
		//get single Header info
		//String headervalue=res.getHeader("Content-type");
		//System.out.println("The value of content-type header is"+headervalue);
		
		//get all headers info
		//Headers myheaders=res.getHeaders();
		//for( Header hd:myheaders)
		//{
		//	System.out.println(hd.getName()+"   "+hd.getValue());
		//}
	
		
		Headers myheaders=res.getHeaders(); //using res capture we capture all info into myheaders variable

        for(io.restassured.http.Header hd:myheaders) // we can read each and every variable using hd

        {

            System.out.println(hd.getName()+"   "+hd.getValue());  //extract name & value of the header

        }	
	
	
	}

}
