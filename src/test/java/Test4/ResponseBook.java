package Test4;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class ResponseBook

{
    @Test
    void testJsonResponse()

    {

        // Approach 1: directly add validation in the then section

//       given()
//        
//            .contentType("ContentType.JSON")
//            
//        .when()
//
//            .get("http://localhost:3000/book")
//
//        .then()
//
//        .statusCode(200)
//
//        .header("Content-Type", "application/json; charset=utf-8")
//
//        .body("[2].title", equalTo("Moby Dick"));
       
       
    	
    	//Approach2
    	
    	Response res = given()
    			.contentType("ContentType.JSON")
    			
    	.when()
    		.get("http://localhost:3000/book");
    		
//    	Assert.assertEquals(res.getStatusCode(),200);
//    	Assert.assertEquals(res.header("Content-Type"),"application/json; charset=utf-8");
    	
    	String bookname=res.jsonPath().get("[3].title").toString();
    	Assert.assertEquals(bookname,"The Lord Of the Rings");
    	
    	
    	
//    	Response res = given()
//             .contentType(ContentType.JSON)
//
//           .when()
//              .get("http://localhost:3000/book");
//
//              
//
//       Assert.assertEquals(res.getStatusCode(),(200));    
//
//        Assert.assertEquals(res.header("Content-Type"), "application/json; charset=utf-8");
//
//
//       String bookname=res.jsonPath().get("[3].title").toString();
//       Assert.assertEquals(bookname, "The Lord Of the Rings");

    }

}	