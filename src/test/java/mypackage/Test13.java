package mypackage;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;

public class Test13 
{

	public static void main(String[] args) 
	{
		//Way-3 Pack or serialize JSON data as an object
		JSONObject jo = new JSONObject();
		jo.put("userId", 1);
		jo.put("title", "hi");
		jo.put("body", "hai friends");
		//Create and submit HTTP request with body parameters via POST method 
		given()
			.baseUri("https://jsonplaceholder.typicode.com")
			.basePath("posts")
			.header("Content-Type","application/json")
			.body(jo.toString())
		.when()
			.post()
		.then()
			.log().all();
		

	}

}
