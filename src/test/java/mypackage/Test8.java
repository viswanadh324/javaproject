package mypackage;
import static io.restassured.RestAssured.*;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		
		//Take value from keyboard for query parameter
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a city name");
		String city = sc.nextLine();
		 sc.close();
		 // 
		given()
			.baseUri("https://api.weatherapi.com")
			.basePath("v1/current.json")
			.queryParam("key", "e9c3b0195be341c795281747202311")
			.queryParam("q", city)
		.when()
			.get()
		.then()
			.log().all();
	}

}
