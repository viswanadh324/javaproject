package mypackage;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;

import io.restassured.response.Response;

public class BookstoreAPIUtility {
	
	public Response getBookInfo(String t) {
		Response r= given().baseUri("https://bookstore.toolsqa.com")
						   .basePath("Bookstore/v1/Books")
						   .header("Authorization","Bearer "+t)
					.when()
						.get();
		return(r);
	}
	public Response addBook(JSONObject y,String t) {
		Response r= given().baseUri("https://bookstore.toolsqa.com")
						   .basePath("Bookstore/v1/Books")
						   .header("Content-Type","application/json")
						   .body(y.toString())
					.when()
						.post();
		return(r);
	}
	public Response getBookInfo(String x,String t) {
		Response r= given().baseUri("https://bookstore.toolsqa.com")
						   .basePath("Bookstore/v1/Book")
						   .queryParam("ISBN", x)
						   .header("Authorization","Bearer "+t)
						   
					.when()
						.get();
		return(r);
	}
	public Response updateBookInfo(String x,String t,JSONObject y) {
		Response r= given().baseUri("https://bookstore.toolsqa.com")
						   .basePath("Bookstore/v1/Books"+x)
						   .header("Content-Type","application/json")
						   .header("Authorization","Bearer "+t)
						   .body(y.toString())
						   
					.when()
						.put();
		return(r);
	}
	public Response deleteBook(String t,JSONObject y) {
		Response r= given().baseUri("https://bookstore.toolsqa.com")
						   .basePath("Bookstore/v1/Book")
						   .header("Content-Type","application/json")
						   .header("Authorization","Bearer "+t)
						   .body(y.toString()) 
					.when()
						.delete();
		return(r);
	}
	public Response deleteBooks(String x, String t) {
		Response r= given().baseUri("https://bookstore.toolsqa.com")
						   .basePath("Bookstore/v1/Books")
						   .queryParam("UserId", x)
						   .header("Authorization","Bearer "+t) 
					.when()
						.delete();
		return(r);
	}


}
