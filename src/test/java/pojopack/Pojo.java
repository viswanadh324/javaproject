package pojopack;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pojo 
{
	//private properties
	@JsonProperty("userId")
	private int uid;
	@JsonProperty("title")
	private String t;
	@JsonProperty("body")
	private String b;
	
	public void  setUserId(int x)
	{
		this.uid=x;
	}
	public void  setTitle(String x)
	{
		this.t=x;
	}
	public void  setBody(String y)
	{
		this.b=y;
	}
	
	
}
