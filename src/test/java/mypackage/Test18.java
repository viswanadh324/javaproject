package mypackage;
import static io.restassured.RestAssured.*;
public class Test18 
{
	public static void main(String[] args) 
	{
		//Create and submit HTTP request with form parameters via POST method 
		given()
			.baseUri("https://www.smatbot.com")
			.basePath("kya_backend/pagehub/chatbot_utils")
			.header("Content-Type", "application/x-www-form-urlencoded")// optional 
			.formParam("action", "init_chat")
			.formParam("device_print", "ed79cf898a7951b5f8858d2d7f4f106f")
			.formParam("chatbot_id", 4174)
			.formParam("name", "SmatBot")
			.formParam("language_code", "default")
		.when()
			.post()
		.then()
			.log().all();
	}
}
