package mypackage;
import static io.restassured.RestAssured.*;
public class Test10 
{
	public static void main(String[] args) 
	{
		urlEncodingEnabled = false;
		given()
			.baseUri("https://petstore.swagger.io")
			.basePath("v2/pet/findByStatus;matrixParm=test")
			.queryParam("offset","0")
			.queryParam("pageSize","20")
			.when()
				.get()
			.then()
				.log().all();
		
	}
}
