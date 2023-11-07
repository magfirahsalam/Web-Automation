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

public class logout {

	@Given("user already logged in")
	public void user_already_logged_in() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.callTestCase(findTestCase('Login/Step Definition/01 user landing on homepage'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Login/Step Definition/02 user click button masuk in home page'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Login/Step Definition/03 user click input email'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Login/Step Definition/04 user click input password'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Login/Step Definition/05 user click button masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user click profile btn")
	public void user_click_profile_btn() {
		WebUI.callTestCase(findTestCase('Logout/Step Definition/002 User click button profile'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user click keluar btn")
	public void user_click_keluar_btn() {
		WebUI.callTestCase(findTestCase('Logout/Step Definition/003 User click button logout'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user successfully logout account")
	public void user_successfully_logout_account() {
		WebUI.callTestCase(findTestCase('Logout/Step Definition/verify Logo Secondhand'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}
