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

public class login {
	@Given("user already on homepage")
	public void user_already_on_homepage() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.callTestCase(findTestCase('Login/Step Definition/01 user landing on homepage'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user click button masuk in homepage")
	public void user_click_button_masuk_in_homepage() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.callTestCase(findTestCase('Login/Step Definition/02 user click button masuk in home page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user input email")
	public void user_input_email() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.callTestCase(findTestCase('Login/Step Definition/03 user click input email'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input password")
	public void user_input_password() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.callTestCase(findTestCase('Login/Step Definition/04 user click input password'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user click button masuk")
	public void user_click_button_masuk() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.callTestCase(findTestCase('Login/Step Definition/05 user click button masuk'), [:], FailureHandling.STOP_ON_FAILURE)

	}

	@Then("user succesful login and directed to home page")
	public void user_succesful_login_and_directed_to_home_page() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.callTestCase(findTestCase('Login/Step Definition/verifyElementPresentlogoSS'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user input unregistered e-mail")
	public void user_input_unregistered_e_mail() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.callTestCase(findTestCase('Login/Step Definition/03 user click input unregistered e-mail'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user can not login and warning pop up data not registered display")
	public void user_can_not_login_and_warning_pop_up_data_not_registered_display() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.callTestCase(findTestCase('Login/Step Definition/popUpfailedLogin'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}
