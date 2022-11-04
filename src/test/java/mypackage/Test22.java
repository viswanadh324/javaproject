package mypackage;
import static io.restassured.RestAssured.*;
public class Test22 
{
	public static void main(String[] args) {
		// digest authentication
		given()
			.baseUri("http://the-internet.herokapp.com")
			.basePath("basic_auth")
			.auth().digest("admin", "admin")
		.when()
			.get()
		.then()
			.log().all();
	}
}
