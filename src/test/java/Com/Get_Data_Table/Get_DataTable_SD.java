package Com.Get_Data_Table;

import java.util.List;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_DataTable_SD {
	
	Response response = null;
	@Given("Hit the book store API")
	public void hit_the_book_store_api() {
	response = RestAssured.get("https://demoqa.com/BookStore/v1/Books");
	    
	}
	@Then("Validate status code")
	public void validate_status_code() {
		int statusCode = response.getStatusCode();
		System.out.println("Status Code for book store API is  " +statusCode);
		Assert.assertTrue("Status Code Not Matching", statusCode ==200);
	   
	}
	
	
	//Very Important Code 
	@Then("Validate data from response")
	public void validate_data_from_response(DataTable allData) {     // dataTable Class is available in cucumber
	    List<List<String>>  allItemsList = allData.asLists();
	    
	    for(int i= 0; i<allItemsList.size();i++) {
	    String  actualValue = allItemsList.get(i).get(0);     // this is actual value from feature file at firstcolumn i.e zero th column 
	    String ExpValue = response.getBody().jsonPath().getString(allItemsList.get(i).get(1));
	    Assert.assertTrue("Value Not Matching",ExpValue.equals(actualValue) );
	}

	}


}
