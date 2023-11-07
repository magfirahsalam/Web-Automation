package stepDefinition

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When




public class listProducts {
	@Given("User Already Login")
	public void user_Already_Login() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User Click hamburger icon")
	public void user_Click_hamburger_icon() {
		WebUI.callTestCase(findTestCase('Product/List Product/Step Definition/User Click Hamburger Icon'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User find products")
	public void user_find_products() {
		WebUI.callTestCase(findTestCase('Product/List Product/Step Definition/User Find Products'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User Already Login Selected")
	public void user_already_login_selected() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User Click hamburger icon Selected")
	public void user_Click_hamburger_icon_selected() {
		WebUI.callTestCase(findTestCase('Product/List Product/Step Definition/User Click Hamburger Icon'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Click Product")
	public void user_click_product() {
		WebUI.callTestCase(findTestCase('Product/List Product/Step Definition/User Click Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User find selected products")
	public void user_find_selected_products() {
		WebUI.callTestCase(findTestCase('Product/List Product/Step Definition/User Success Get Detail Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User Already Login Interested")
	public void user_already_login_interested() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User Click hamburger icon Interested")
	public void user_Click_hamburger_icon_interested() {
		WebUI.callTestCase(findTestCase('Product/List Product/Step Definition/User Click Hamburger Icon'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Click Diminati")
	public void user_click_diminati() {
		WebUI.callTestCase(findTestCase('Product/List Product/Step Definition/User Click Diminati'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User find interested products")
	public void user_find_interested_products() {
		WebUI.callTestCase(findTestCase('Product/List Product/Step Definition/User Success Get Diminati Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User Already Login Sold")
	public void user_already_login_sold() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User Click hamburger icon sold")
	public void user_Click_hamburger_icon_sold() {
		WebUI.callTestCase(findTestCase('Product/List Product/Step Definition/User Click Hamburger Icon'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Click Terjual")
	public void user_click_terjual() {
		WebUI.callTestCase(findTestCase('Product/List Product/Step Definition/User Click Terjual'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User find sold product")
	public void user_find_sold_product() {
		WebUI.callTestCase(findTestCase('Product/List Product/Step Definition/User Success Get Sold Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}
