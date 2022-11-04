package mypackage;
import static io.restassured.RestAssured.*;

import java.util.Scanner;
public class Test6 {
	public static void main(String[] args) {
		// take value from keyboard for path parameter
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter path parameter value");
		String x = sc.nextLine();
		sc.close();
		// parameterized path parameter value in URI
		given()
			.baseUri("https://jsonplaceholder.typicode.com")
			.basePath("posts/"+x)
		.when()
			.get()
		.then()
			.log().all();
	}

}
