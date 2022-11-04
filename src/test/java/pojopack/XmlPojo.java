package pojopack;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@XmlRootElement(name="Request")
public class XmlPojo 
{
	@JacksonXmlProperty(localName="Login")
	private String uid;
	@JacksonXmlProperty(localName="Login")
	private String pwd;
	
	public void setLogin(String x)
	{
		this.uid=x;
	}
	public void setPassword(String x)
	{
		this.uid=x;
	}
	
}
