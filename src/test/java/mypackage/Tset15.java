package mypackage;
import static io.restassured.RestAssured.*;

import java.io.File;
public class Tset15 
{
	public static void main(String[] args) 
	{
		// Create a file instance/object
		File f = new File("src/test/resources/mydata.xml");
		// Create and submit HTTP request with body parameters via POST method
		given()
			.baseUri("https://reqbin.com")
			.basePath("echo/post/xml")
			.header("Content-Type","application/xml")
			.body(f)
			.log().all()
		.when()
			.post()
		.then()
			.log().all();
		
	}
}
