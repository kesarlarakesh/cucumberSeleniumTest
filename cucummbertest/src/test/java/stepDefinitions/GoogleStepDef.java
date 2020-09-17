package stepDefinitions;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.GooglePageObject;

public class GoogleStepDef {

	GooglePageObject googlePageObject = new GooglePageObject();

	@Given("^I navigate to google webpage$")
	public void i_navigate_to_webpage_using() throws Exception {
		googlePageObject.launchURL();
	}

	@Then("^I see google homepage using \"([^\"]*)\"$")
	public void i_see_homepage_using(String strWebsiteName) {
		String actualTitle = googlePageObject.verifyHomepage();
		Assert.assertTrue(actualTitle.contains(strWebsiteName));
	}

	@When("^I search for keyword using \"([^\"]*)\"$")
	public void i_search_for_keyword_using(String strKeyword) throws Exception {
		googlePageObject.provideSearchInput(strKeyword);
	}

	@And("^I select search result$")
	public void i_select_result() throws Exception {
		googlePageObject.clickOnLink();
	}

	@Then("^I verify JP Mogan logo on home page$")
	public void i_verify_the_logo_on_home_page() throws Exception {
		boolean isLogoDisplayed = googlePageObject.verifyLogo();
		Assert.assertTrue(isLogoDisplayed);
	}

}
