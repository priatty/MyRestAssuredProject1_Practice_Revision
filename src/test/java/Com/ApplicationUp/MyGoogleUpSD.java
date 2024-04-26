package Com.ApplicationUp;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MyGoogleUpSD {
	
	Response respobj = null;
	@Given("Open google")
	public void open_google() {
		 respobj = RestAssured.get("https://www.google.com/");
		
	}
	@Then("check google application is running")
	public void check_google_application_is_running() {
		
	 int statusCode = respobj.getStatusCode();
	 System.out.println("Status Code = " + statusCode);
	 Assert.assertTrue(statusCode==200);
	}




}
