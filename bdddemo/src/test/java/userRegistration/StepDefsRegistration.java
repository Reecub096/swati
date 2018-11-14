package userRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBean.UserRegistrationPageFactory;

public class StepDefsRegistration {
	WebDriver driver;
	UserRegistrationPageFactory urpf;
	
	@Given("^User is on Registration Page$")
	public void user_is_on_Registration_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver = new FirefoxDriver();
	    driver.get("file:///D:/Softwares/Lesson%205-HTML%20Pages/WorkingWithForms.html");
	}

	@Then("^Check the heading of the page$")
	public void check_the_heading_of_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String heading = driver.getTitle();
		if(heading.equals("Email Registration"))
			System.out.println("Heading Matched");
		else
			System.out.println("Heading Not Matched");
	}

	@When("^User enters all valid data$")
	public void user_enters_all_valid_data() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		urpf.setUsername("");Thread.sleep(2000);
		urpf.setSubmit();
	}

	@When("^Clicks on Submit Button$")
	public void clicks_on_Submit_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("^Show Success Page$")
	public void show_Success_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("^User leaves username empty$")
	public void user_leaves_username_empty() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("^Display Error Message$")
	public void display_Error_Message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("^User leaves Password empty$")
	public void user_leaves_Password_empty() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("^User leaves Confirm Password empty$")
	public void user_leaves_Confirm_Password_empty() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("^User leaves First Name empty$")
	public void user_leaves_First_Name_empty() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("^User leaves Last Name empty$")
	public void user_leaves_Last_Name_empty() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("^User does not select gender$")
	public void user_does_not_select_gender() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("^User leaves DOB empty$")
	public void user_leaves_DOB_empty() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("^User leaves Email empty$")
	public void user_leaves_Email_empty() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("^User leaves address empty$")
	public void user_leaves_address_empty() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("^User does not select city$")
	public void user_does_not_select_city() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("^User leaves phone empty$")
	public void user_leaves_phone_empty() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("^User does not select hobbies$")
	public void user_does_not_select_hobbies() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}
}
