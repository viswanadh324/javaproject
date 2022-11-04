package mypackage;
import static io.restassured.RestAssured.*; 
public class Test5 {
	public static void main(String[] args) {
		//Way-1 (part parameter value in URI)
		given()
			.baseUri("https://jsonplaceholder.typicode.com")
			.basePath("posts/100")
		.when()
			.get()
		.then()
			.log().all();
		// way-2 (path parameter value as a argument to HTTP method)
		given()
			.baseUri("https://jsonplaceholder.typicode.com")
			.basePath("posts")
		.when()
			.get("100")
		.then()
			.log().all();
		// way-3(we have correct name of the path parameter )
		
		given()
			.baseUri("https://jsonplaceholder.typicode.com")
			.basePath("posts")
			.pathParam("id", 100)
		.when()
			.get()
		.then()
			.log().all();
		
	}

}
