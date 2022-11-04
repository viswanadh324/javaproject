package mypackage;
import static io.restassured.RestAssured.*;
public class Test7 {
	public static void main(String[] args) {
		given()
			.baseUri("https://www.google.co.in")
			.basePath("search")
			.queryParam("q", "today weather update in swarna ")
		.when()
			.get()
		.then()
			.log().all();
	}

}
