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

class updateproduct {

	@Given("user success login")
	public void user_success_login() {
		WebUI.callTestCase(findTestCase('Product/Update Product/Step Definition/01 user success login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user click humburger icon")
	public void user_click_humburger_icon() {
		WebUI.callTestCase(findTestCase('Product/Update Product/Step Definition/02 user click humburger icon'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user select product")
	public void user_select_product() {
		WebUI.callTestCase(findTestCase('Product/Update Product/Step Definition/03 user choose product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user click button edit")
	public void user_click_button_edit() {
		WebUI.callTestCase(findTestCase('Product/Update Product/Step Definition/04 user click button edit'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user change product name")
	public void user_change_product_name() {
		WebUI.callTestCase(findTestCase('Product/Update Product/Step Definition/05 user update product name'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user change product price")
	public void user_change_product_price() {
		WebUI.callTestCase(findTestCase('Product/Update Product/Step Definition/06 user update product price'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user change product description")
	public void user_change_product_description() {
		WebUI.callTestCase(findTestCase('Product/Update Product/Step Definition/07 user update product description'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user click button terbitkan")
	public void user_click_button_terbitkan() {
		WebUI.callTestCase(findTestCase('Product/Update Product/Step Definition/08 user click button terbitkan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("product is updated")
	public void product_is_updated() {
		WebUI.callTestCase(findTestCase('Product/Update Product/Step Definition/09 user succes update product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("seller has login")
	public void seller_has_login() {
		WebUI.callTestCase(findTestCase('Product/Update Product/Step Definition/01 user success login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("seller click humburger icon")
	public void seller_click_humburger_icon() {
		WebUI.callTestCase(findTestCase('Product/Update Product/Step Definition/02 user click humburger icon'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("seler select product")
	public void seler_select_product() {
		WebUI.callTestCase(findTestCase('Product/Update Product/Step Definition/03 user choose product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("seller click edit")
	public void seller_click_edit() {
		WebUI.callTestCase(findTestCase('Product/Update Product/Step Definition/04 user click button edit'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user input product name blank")
	public void user_input_product_name_blank() {
		WebUI.callTestCase(findTestCase('Product/Update Product/Step Definition/10 user input product name blank'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user input product price blank")
	public void user_input_product_price_blank() {
		WebUI.callTestCase(findTestCase('Product/Update Product/Step Definition/11 user input product price blank'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("product is not update and gave popup failed message")
	public void product_is_not_updated_and_gave_popup_failed_message() {
		WebUI.callTestCase(findTestCase('Product/Update Product/Step Definition/popupfail'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}