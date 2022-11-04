package mypackage;
import static io.restassured.RestAssured.*;
public class Test20 
{
	public static void main (String[] args)
	{
		//Basic authentication 
		given()
			.baseUri("http://the-internet.herokuapp.com")
			.basePath("basic_auth")
			.auth().basic("admin", "admin")
		.when()
			.get()
		.then()
			.log().all();
		
	}
	
}
