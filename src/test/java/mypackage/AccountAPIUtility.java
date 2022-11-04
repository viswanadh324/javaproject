package mypackage;

import org.json.JSONObject;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class AccountAPIUtility {
	
	public Response verifiUser(JSONObject x) {
		Response r= given().baseUri("https://bookstore.toolsqa.com")
						   .basePath("Account/v1/Authorized")
						   .header("Content-Type","application/json")
						   .body(x.toString())
					.when()
						.post();
		return(r);
	}
	public Response createUser(JSONObject x) {
		Response r= given().baseUri("https://bookstore.toolsqa.com")
						   .basePath("Account/v1/User")
						   .header("Content-Type","application/json")
						   .body(x.toString())
					.when()
						.post();
		return(r);
	}
	public Response generateToken(JSONObject x) {
		Response r= given().baseUri("https://bookstore.toolsqa.com")
						   .basePath("Account/v1/GenerateToken")
						   .header("Content-Type","application/json")
						   .body(x.toString())
					.when()
						.post();
		return(r);
	}
	public Response getUserInfo(String x, String t) {
		Response r= given().baseUri("https://bookstore.toolsqa.com")
						   .basePath("Account/v1/User"+x)
						   .header("Authorization","Bearer "+t)
						  
					.when()
						.get();
		return(r);
	}
	public Response deleteUser(String x, String t) {
		Response r= given().baseUri("https://bookstore.toolsqa.com")
						   .basePath("Account/v1/User"+x)
						   .header("Authorization","Bearer "+t)
						  
					.when()
						.delete();
		return(r);
	}
	
}
