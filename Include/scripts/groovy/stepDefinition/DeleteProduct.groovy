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

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class DeleteProduct {
	@Given("user success logged in")
	public void user_success_logged_in() {
		WebUI.callTestCase(findTestCase('Product/Delete Product/Step Definition/01 user success login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user clicked the humburger icon")
	public void user_clicked_the_humburger_icon() {
		WebUI.callTestCase(findTestCase('Product/Delete Product/Step Definition/02 user click humburger icon'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user selected the product")
	public void user_selected_the_product() {
		WebUI.callTestCase(findTestCase('Product/Delete Product/Step Definition/03 user choose product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user click button delete")
	public void user_click_button_delete() {
		WebUI.callTestCase(findTestCase('Product/Delete Product/Step Definition/user delete product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user success delete product")
	public void user_success_delete_product() {
		WebUI.callTestCase(findTestCase('Product/Delete Product/Step Definition/user success delete product'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}
