package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class register {
	@Given("user already on homePage")
	public void user_already_on_homepage() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.callTestCase(findTestCase('Login/Step Definition/01 user landing on homepage'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	//Sign Up with email already taken
	@Given("user already on home page")
	public void user_already_on_home_page() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.callTestCase(findTestCase('Login/Step Definition/01 user landing on homepage'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user click button masuk in HomePage")
	public void user_click_button_masuk_in_HomePage() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.callTestCase(findTestCase('Login/Step Definition/02 user click button masuk in home page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	////Sign Up with email already taken
	@When("user click button masuk in home page")
	public void user_click_button_masuk_in_home_page() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.callTestCase(findTestCase('Login/Step Definition/02 user click button masuk in home page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user click text daftar")
	public void user_click_text_daftar() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.callTestCase(findTestCase('Register/Step Definition/00 User click text daftar'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	////Sign Up with email already taken
	@And("user click text Daftar")
	public void user_click_text_Daftar() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.callTestCase(findTestCase('Register/Step Definition/00 User click text daftar'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user input name")
	public void user_input_name() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.callTestCase(findTestCase('Register/Step Definition/01 user click input name'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	////Sign Up with email already taken
	@And("user input Name")
	public void user_input_Name() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.callTestCase(findTestCase('Register/Step Definition/01 user click input name'), [:], FailureHandling.STOP_ON_FAILURE)
	}


	@And("user input Gmail")
	public void  user_input_Gmail() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.callTestCase(findTestCase('Register/Step Definition/02 user click input email Random'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	////Sign Up with email already taken
	@And("user input Email")
	public void user_input_Email() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.callTestCase(findTestCase('Register/Step Definition/02 user click input email'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user input password")
	public void user_input_password() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.callTestCase(findTestCase('Register/Step Definition/03 user click input password'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	////Sign Up with email already taken
	@And("user input Password")
	public void user_input_Password() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.callTestCase(findTestCase('Register/Step Definition/03 user click input password'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user click daftar")
	public void user_click_daftar() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.callTestCase(findTestCase('Register/Step Definition/04 user click daftar'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	////Sign Up with email already taken
	@And("user click Daftar")
	public void user_click_Daftar() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.callTestCase(findTestCase('Register/Step Definition/04 user click daftar'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user succesful signup and directed to homepage")
	public void user_succesful_signup_and_directed_to_homepage() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.callTestCase(findTestCase('Register/Step Definition/verifyElementPresentLogoSS'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user can not sign up account and pop up warning text email already taken")
	public void user_can_not_sign_up_account_and_pop_up_warning_text_email_already_taken() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.callTestCase(findTestCase('Register/Step Definition/05 warning text email already taken'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}
