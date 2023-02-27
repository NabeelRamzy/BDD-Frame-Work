package stepdef;

import base.RootClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomeQuoteSteps extends RootClass{

	@Given("validate landing page title")
	public void validate_landing_page_title() {
	  landingPage.validatelandingpagetitle("get a quote in the blink of an eye");
	}

	@Given("click the auto button")
	public void click_the_auto_button() {
	    landingPage.unclicktheautobutton();
	}

	@Given("click the home button")
	public void click_the_home_button() {
	   landingPage.clickonhomebutton();
	}

	@Then("click the get a quote")
	public void click_the_get_a_quote() {
	   landingPage.clickongetAqouteButton();
	}
}
