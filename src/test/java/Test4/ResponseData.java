package Test4;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.Assert;

import org.testng.annotations.Test;

 

import io.restassured.http.ContentType;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class ResponseData {
	String student;

	@Test(priority=1)
	void responsedata()
	{
		given()
			.contentType("ContentType.JSON")
		.when()
			.get("http://localhost:3000/student")
		
		.then()
			.statusCode(200)
			.header("Content-Type","application/json; charset=utf-8")
			.body("[1].location",equalTo("France"));
	}

	
}
