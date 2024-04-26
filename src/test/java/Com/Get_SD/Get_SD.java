package Com.Get_SD;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_SD {
	
	Response response = null;
	@Given("Hit the book store API")
	public void hit_the_book_store_api() {
		response =  RestAssured.get("https://demoqa.com/BookStore/v1/Books");
	 
	}
	
	@Then("Validate status code")
	public void validate_status_code() {
		int statusCode = response.getStatusCode();
	      System.out.println("Status Code = " +statusCode);
		   Assert.assertTrue("Status Code Not Matching", statusCode==200);
		
		
	}
	
	@Then("check Git Pocket Guide title is present")
	public void check_git_pocket_guide_title_is_present() {
		
		String jsonData = response.getBody().asString();
		System.out.println("All json data = " +jsonData);
		String bookTitle = response.getBody().jsonPath().getString("books[0].title");
		System.out.println("Book title = "+bookTitle);
		Assert.assertTrue("title not matching", bookTitle.equals("Git Pocket Guide"));
		
	    
	}
	
	@Then("Learning JavaScript Design Patterns title is present")
	public void learning_java_script_design_patterns_title_is_present() {
		String bookTitle = response.getBody().jsonPath().getString("books[1].title");
		Assert.assertTrue("Title not matching", bookTitle.equals("Learning JavaScript Design Patterns") );
	    
	}
	
	
	//this is the correct way or replacement for above code in short
	//2nd scenario 
	
	@Then("Validate {string} is present at json path {string}")
	public void validate_is_present_at_json_path(String title, String jsonpath) {
		
		String actualTitle = response.getBody().jsonPath().getString(jsonpath);
		Assert.assertTrue("Title not matchinng", actualTitle.equals(title));
	   
	}
	
	
	@Then("validate page number {string} is prensent at json response {string}")
	public void validate_page_number_is_prensent_at_json_response(String pageNum, String jsonpath) {
	    
		int actualpageNum = response.getBody().jsonPath().getInt(jsonpath);
		int axpectedPageNum = Integer.parseInt(pageNum);   //page number converted string to int 
		Assert.assertTrue("page Number Not Matching", actualpageNum == axpectedPageNum);
	}












}
