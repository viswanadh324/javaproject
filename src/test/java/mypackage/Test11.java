package mypackage;
import static io.restassured.RestAssured.*;

import java.io.File;
public class Test11
{
	public static void main(String[] args)
	{
		// Way-1: j-son file content as request body 
		// creating a file instance 
		File f = new File("src/test/resources/mydata.json");
		//Create and submit HTTP request with body parameters via POST method 
		given()
			.baseUri("https://jsonplaceholder.typicode.com")
			.basePath("posts")
			.header("Content-Type","application/json")
			.body(f)
		.when()
			.post()
		.then()
			.log().all();
		
			
	}
}
