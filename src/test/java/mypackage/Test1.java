package mypackage;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class Test1 
{
	public static void main(String[] args) 
	{
		// non BDD
		//1.Generate HTTP request
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/posts";
		//2.submit that Request via HTTP method to get response
		Response res=RestAssured.get();
		//3.Analyze response
		System.out.println("Status-line is:");
		String x=res.getStatusLine();
		System.out.println(x);
		Headers y=res.headers();
		System.out.println("Headers are:");
		for(Header h:y)
		{
			System.out.println(h.getName()+":"+h.getValue());
		}
		System.out.println("body is:");
		String z=res.getBody().asString();
		System.out.println(z);
	}
}
