package mypackage;
import static io.restassured.RestAssured.*;
public class Test16
{

	public static void main(String[] args)
	{
		// Create a String variable 
		String x = "<Request>\r\n"+
				"  <Login>login</Login>\r\n"+
				"  <Password>password</Password>\r\n"+
				"   </Request>";
		//Create and submit HTTP request with body parameter with POST method
		given()
			.baseUri("https://rebin.com")
			.basePath("echo/post/xml")
			.header("Content-Type","application/xml")
			.body(x)
			.log().all()
		.when()
			.post()
		.then()
			.log().all();

	}

}
