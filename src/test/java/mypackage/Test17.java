package mypackage;
import static io.restassured.RestAssured.*;

import pojopack.XmlPojo;
public class Test17 
{
	public static void main(String[] args) 
	{
		//Create an object to pojo class
		XmlPojo obj = new XmlPojo();
		obj.setLogin("login");
		obj.setPassword("password");
		//Create and submit Http request with body parameter POST method
		given()
			.baseUri("https://rebin.com")
			.basePath("echo/post/xml")
			.header("Content-Type", "application/xml")
			.body(obj)
			.log().all()
		.when()
			.post()
		.then()
			.log().all();
		
	}
}
