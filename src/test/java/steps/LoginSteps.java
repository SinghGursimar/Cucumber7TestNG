package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("user navigates to application url")
	public void user_navigates_to_application_url() 
	{
		System.out.println("Step1");
	  
	}

	@When("user validates the homepage title")
	public void user_validates_the_homepage_title() 
	{
		System.out.println("Step2");
	}

	@Then("user enters {string} username")
	public void user_enters_username(String Username) 
	{
		System.out.println(Username);
	}

	@Then("user enters {string} password")
	public void user_enters_password(String password) 
	{
		System.out.println(password);
	}

	@Then("user clicks on the sign in button")
	public void user_clicks_on_the_sign_in_button() 
	{
		System.out.println("Step5");
	}
	@Then("user enters valid captcha code")
	public void user_enters_valid_captcha_code() 
	{
	   System.out.println("@and - captcha code validated");
	}

}
