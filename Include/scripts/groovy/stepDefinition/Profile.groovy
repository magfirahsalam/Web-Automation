package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Profile {
	@Given("user succes login with valid credential")
public void user_succes_login_with_valid_credential() {
    WebUI.callTestCase(findTestCase('Login/Test Case/User Success login with valid credential'), [:], FailureHandling.STOP_ON_FAILURE)
}

@When("user click pencil icon")
public void user_click_pencil_icon() {
    WebUI.callTestCase(findTestCase('Profile/Step definition/User click pencil icon'), [:], FailureHandling.STOP_ON_FAILURE)
}

@When("user click profile name")
public void user_click_profile_name() {
    WebUI.callTestCase(findTestCase('Profile/Step definition/User click profile name'), [:], FailureHandling.STOP_ON_FAILURE)
}

@When("user go to profil page")
public void user_go_to_profil_page() {
    WebUI.callTestCase(findTestCase('Profile/Step definition/User go to profile page'), [:], FailureHandling.STOP_ON_FAILURE)
}

@When("user input nama")
public void user_input_nama() {
    WebUI.callTestCase(findTestCase('Profile/Step definition/User input name'), [:], FailureHandling.STOP_ON_FAILURE)
}

@When("user input city")
public void user_input_city() {
   WebUI.callTestCase(findTestCase('Profile/Step definition/User input city'), [:], FailureHandling.STOP_ON_FAILURE)
}

@When("user input address")
public void user_input_address() {
    WebUI.callTestCase(findTestCase('Profile/Step definition/User input address'), [:], FailureHandling.STOP_ON_FAILURE)
}

@When("user input phone number")
public void user_input_phone_number() {
    WebUI.callTestCase(findTestCase('Profile/Step definition/User input phone number'), [:], FailureHandling.STOP_ON_FAILURE)
}

@When("click button simpan")
public void click_button_simpan() {
    WebUI.callTestCase(findTestCase('Profile/Step definition/Click button Simpan'), [:], FailureHandling.STOP_ON_FAILURE)
}

@Then("user success edit profile")
public void user_success_edit_profile() {
    WebUI.callTestCase(findTestCase('Profile/Step definition/User success edit profile'), [:], FailureHandling.STOP_ON_FAILURE)
}
}


