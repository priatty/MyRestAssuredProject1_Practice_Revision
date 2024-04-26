package Com.Basic;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyBasicSD {

	@Given("login to HRMS with valid user")
	public void login_to_hrms_with_valid_user() {
	   System.out.println("Login");
	}
	@When("go to the PIM tab")
	public void go_to_the_pim_tab() {
		System.out.println("Go to PiM Tab");
	}
	@Then("check add button")
	public void check_add_button() {
		System.out.println("Validate Add button");
	}
	
	@When("go to admin tab")
	public void go_to_admin_tab() {
		System.out.println("Go to the admin tab");
	}
	@Then("check delete button")
	public void check_delete_button() {
		System.out.println("Validate delete button");
	}






}
