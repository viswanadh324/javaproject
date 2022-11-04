package mypackage;
import static io.restassured.RestAssured.*;
public class Test21 
{
	public static void main(String[] args) {
		// preemptive authentication
		given()
			.baseUri("http://the-internet.herokuapp.com")
			.basePath("basic_auth")
			.auth().preemptive().basic("admin", "admin")
		.when()
			.get()
		.then()
			.log().all();
	}
}
