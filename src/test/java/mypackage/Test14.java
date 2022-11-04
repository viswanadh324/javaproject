package mypackage;
import static io.restassured.RestAssured.*;

import pojopack.Pojo;
public class Test14 
{
	public static void main(String[] args) 
	{
		//Way-4 Serialization or packing value into j-son pay load
		Pojo obj = new Pojo();
		obj.setUserId(1);
		obj.setTitle("wishes");
		obj.setBody("hai friends ");
		//Create and submit HTTP request with body parameters via POST method 
				given()
					.baseUri("https://jsonplaceholder.typicode.com")
					.basePath("posts")
					.header("Content-Type","application/json")
					.body(obj).log().all()
				.when()
					.post()
				.then()
					.log().all();
	}
}
