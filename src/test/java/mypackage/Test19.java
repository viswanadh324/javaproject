package mypackage;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
public class Test19 
{
	public static void main(String[] args) 
	{
		//Create and submit HTTP request with form parameters via POST method to API-1
		Response res = given()
				.baseUri("https://www.smatbot.com")
				.basePath("kya_backend/pagehub/chatbot_utils")
				.header("Content-Type", "application/x-www-form-urlencoded")// optional 
				.formParam("action", "init_chat")
				.formParam("device_print", "ed79cf898a7951b5f8858d2d7f4f106f")
				.formParam("chatbot_id", 4174)
				.formParam("name", "SmatBot")
				.formParam("language_code", "default")
			.when()
				.post();
		String value = res.jsonPath().getString("cd_session");
		System.out.println(value);
		// Create and submit HTTP request with form parameters via POST method to API-2
		                given()
		                	.log().all()
		                  .baseUri("https://www.smatbot.com")
		                  .basePath("kya_backend/pagehub/chatbot_utils")
		                  .header("Content-Type","application/x-www-form-urlencoded")
		                  .formParam("action", "answer")
		                  .formParam("answer_text", "test")
		                  .formParam("cd_session", value)
		                  .formParam("question_id",4017)
		                  .formParam("is_logical", 0)
		                  .formParam("sequence", 2)
		                  .formParam("chatbot_id",4174)
		                  .formParam("option","undefined")
		                  .formParam("visitor_link_traversal","")
		                  .formParam("language_code", "default")
		               .when()
		               		.post()
		               	.then()
		               		.log().all();
		                  
	}
}
