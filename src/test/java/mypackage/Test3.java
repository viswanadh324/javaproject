package mypackage;
import static io.restassured.RestAssured.*;
public class Test3 {
	public static void main(String[] args) {
		given().baseUri("https://petstore.swagger.io")
		.basePath("v2/pet/1")
		.when()
		.get()
		.then()
		.log().all();
	}

}
