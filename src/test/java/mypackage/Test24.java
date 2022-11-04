package mypackage;

import org.json.JSONObject;

import io.restassured.response.Response;

public class Test24 {
	
	public static void main(String[] args) {
		// Declare global variables
		JSONObject j;
		String uid;
		String t;
		// J-son pay-load
		j=new JSONObject();
		j.put("username", "kashiviswanadh");
		j.put("password", "11KK1a0324@");
		AccountAPIUtility obj1 = new AccountAPIUtility();
		// 1.Create new user
		Response r1 = obj1.createUser(j);
		uid=r1.body().jsonPath().getString("userID");
		System.out.println(r1.statusCode());
		System.out.println(r1.body().asPrettyString());
		//2. verify the existence of given user 
		Response r2 = obj1.verifiUser(j);
		System.out.println(r2.statusCode());
		System.out.println(r2.body().asPrettyString());
		// 3.generate Token
		Response r3 = obj1.generateToken(j);
		t=r3.body().jsonPath().getString("token");
		System.out.println(r3.statusCode());
		System.out.println(r3.body().asPrettyString());
		// 4.get user info
		Response r4 = obj1.getUserInfo(uid, t);
		System.out.println(r4.statusCode());
		System.out.println(r4.asPrettyString());
		// 5.delete user
		Response r5 = obj1.deleteUser(uid, t);
		System.out.println(r5.statusCode());
		System.out.println(r5.body().asPrettyString());
		
	}

}
