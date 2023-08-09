package Test4;

//import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class JSONArray 
{
	
	@Test
	void JSONArrayBody()
	{
	

	        Response res = given()
	        		.contentType(ContentType.JSON)
	       
	        .when()
	        	.get("http://localhost:3000/book");
	
//			JSONObject jo=new JSONObject(res.toString()); //converting response to json object type  
//			
//			for(int i=0; i<jo.getJSONArray("book").length(); i++)
//			{
//				String bookTitle=jo.getJSONArray("book").getJSONObject(i).get("title").toString();
//				System.out.println(bookTitle);
//			}
		
//		import io.restassured.http.ContentType;
//		import io.restassured.response.Response;
//		import org.json.JSONObject;
//
//		public class JSONArray {
//
////		    public static void main(String[] args) {
//		        Response res = given()
//		                .contentType(ContentType.JSON)
//		                .when()
//		                .get("http://localhost:3000/book");
//
//		        JSONObject jsonResponse = new JSONObject(res.asString()); // Convert response to JSONObject
//
//		        org.json.JSONArray booksArray = jsonResponse.getJSONArray("book"); // Get the "book" array
//
//		        for (int i = 0; i < booksArray.length(); i++) {
//		            JSONObject bookObject = booksArray.getJSONObject(i); // Get each book object
//		            String bookTitle = bookObject.getString("title"); // Extract book title
//		            System.out.println(bookTitle);
//		        }
//		    
//		Response res = given()
//                .contentType(ContentType.JSON)
//                .when()
//                    .get("http://localhost:3000/book");
        //using json object class
        JSONObject jo =new JSONObject(res.asString());                 // converting response to json object type
//        //print all title of books
//        for(int i=0; i<jo.getJSONArray("book").length(); i++)        // find all json length()
//
//        {
//            //capture title from every object by using index
//            String bookTitle=jo.getJSONArray("book").getJSONObject(i).get("title").toString();
//            System.out.println(bookTitle);
		        
		      boolean status=false;
		      
		      for(int i=0; i<jo.getJSONArray("book").length();i++)
		      {
		    	  String bookTitle=jo.getJSONArray("book").getJSONObject(i).get("title").toString();
		    	  
		    	  if(bookTitle.equals("The Lord Of the Rings"))
		    	  {
		    		  status=true;
		    		  break;
		    	  }
		      }
		        Assert.assertEquals(status, true);

        }

	}

