package mypackage;
import static io.restassured.RestAssured.*;

import java.util.Scanner;
public class Test9 {
	public static void main(String[] args) {
		// Take value from keyboard for both path and query parameter
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter country name as a path parameter value");
		String country = sc.nextLine();
		System.out.println("Enter fullText as quary parameter value like true or false");
		String option = sc.nextLine();
		sc.close();
		// path parameter and query parameter parameterization
		
		given()
			.baseUri("https://restcountries.com")
			.basePath("v3/name/"+country)
			.queryParam("fullText", option)
		.when()
			.get()
		.then()
			.log().all();
		
		
	}

}
