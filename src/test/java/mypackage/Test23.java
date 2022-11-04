package mypackage;
import static io.restassured.RestAssured.*;

import io.restassured.authentication.FormAuthConfig;
public class Test23 {
	public static void main(String[] args) {
		//form authentication
		FormAuthConfig fc = new FormAuthConfig("index.php","uid","password");
		given()
			.baseUri("https://demo.guru99.com/v1/index.php")
			.auth().form("mngr450173","EhatEde",fc)
		.when()
			.post()
		.then()
			.log().all();
	}
}
