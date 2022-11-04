package mypackage;

import static io.restassured.RestAssured.given;

public class Test12 
{

	public static void main(String[] args) 
	{
		// Way-2 JSON String value as a request body 
		String x = "\"userId\": 1,\r\n" + 
				"	\"title\": \"wishes\",\r\n" + 
				"	\"body\": \"how are you\",";
		//Create and submit HTTP request with body parameters via POST method 
				given()
					.baseUri("https://jsonplaceholder.typicode.com")
					.basePath("posts")
					.header("Content-Type","application/json")
					.body(x)
				.when()
					.post()
				.then()
					.log().all();
				

	}

}
