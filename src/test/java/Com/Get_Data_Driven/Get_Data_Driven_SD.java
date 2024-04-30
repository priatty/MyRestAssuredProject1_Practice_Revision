package Com.Get_Data_Driven;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_Data_Driven_SD {
	Response response = null;
	@Given("Hit the book store api")
	public void hit_the_book_store_api() {
		response = RestAssured.get("https://demoqa.com/BookStore/v1/Books");
	}
	@Then("Validate status code")
	public void validate_status_code() {
	    int statusCode = response.getStatusCode();
	    System.out.println(statusCode);
	    Assert.assertTrue("Status Code Not Matching", statusCode == 200);
	    
	}
	
	
	@Then("validate data {string} from {string} response")
	public void validate_data_from_response(String ExpValue, String jsonPath) {
	   String actualVal = response.getBody().jsonPath().getString(jsonPath);
	   Assert.assertTrue("Value not match", ExpValue.equals(actualVal));
	}



	//@Then("validate data {String} from {String} response")
	//public void validate_data_from_response(String ExpValue, String jsonPath) {
	  //  String actualVal = response.getBody().jsonPath().getString(jsonPath);
	    //Assert.assertTrue("Value not matching", ExpValue.equals(actualVal));
	}




