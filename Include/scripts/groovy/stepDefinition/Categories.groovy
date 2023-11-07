package stepDefinition
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class Categories {

	@Given("user already login")
	public void user_already_login() {
		WebUI.callTestCase(findTestCase('Categories/Step Definition/User already login'), [('email') : 'qabinar11@gmail.com', ('password') : 'qabinar'],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("user input available product name")
	public void user_input_available_product_name() {
		WebUI.callTestCase(findTestCase('Categories/Step Definition/User input available product name'), [('product_1') : 'bunga'
			, ('product_2') : 'sepatu 123', ('product_3') : 'boneka'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user can find the available product")
	public void user_can_find_the_available_product() {
		WebUI.callTestCase(findTestCase('Categories/Step Definition/User can find the available product'), [:], FailureHandling.STOP_ON_FAILURE)
	}



	@Given("user has been login")
	public void user_has_been_login() {
		WebUI.callTestCase(findTestCase('Categories/Step Definition/User already login'), [('email') : 'qabinar11@gmail.com', ('password') : 'qabinar'],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("user input unavailable product name")
	public void user_input_unavailable_product_name() {
		WebUI.callTestCase(findTestCase('Categories/Step Definition/User input unavailable product name'), [('product_1') : 'unavailable1'
			, ('product_2') : 'unavailable2', ('product_3') : 'unavailable3'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user cannot find the unavailable product")
	public void user_cannot_find_the_available_product() {
		WebUI.callTestCase(findTestCase('Categories/Step Definition/User cannot find the unavailable product'), [:], FailureHandling.STOP_ON_FAILURE)
	}



	@Given("user successful login")
	public void user_successful_login() {
		WebUI.callTestCase(findTestCase('Categories/Step Definition/User already login'), [('email') : 'qabinar11@gmail.com', ('password') : 'qabinar'],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("user not input product name")
	public void user_not_input_product_name() {
		WebUI.callTestCase(findTestCase('Categories/Step Definition/User not input product name'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user find the aimless products")
	public void user_find_the_aimless_products() {
		WebUI.callTestCase(findTestCase('Categories/Step Definition/User find all product random'), [:], FailureHandling.STOP_ON_FAILURE)
	}



	@Given("users have been login")
	public void users_have_been_login() {
		WebUI.callTestCase(findTestCase('Categories/Step Definition/User already login'), [('email') : 'qabinar11@gmail.com', ('password') : 'qabinar'],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("user input product name contains space only")
	public void user_input_product_name_contains_space_only() {
		WebUI.callTestCase(findTestCase('Categories/Step Definition/User input product with space only'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user find the random product")
	public void user_find_the_random_product() {
		WebUI.callTestCase(findTestCase('Categories/Step Definition/User find all product random(space)'), [:], FailureHandling.STOP_ON_FAILURE)
	}



	@Given("user login")
	public void user_login() {
		WebUI.callTestCase(findTestCase('Categories/Step Definition/User already login'), [('email') : 'qabinar11@gmail.com', ('password') : 'qabinar'],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("user input product name contains mixed data types")
	public void user_input_product_name_contains_mixed_data_types() {
		WebUI.callTestCase(findTestCase('Categories/Step Definition/User input mix data types product name'), [('product_1') : '@baju23!'
			, ('product_2') : '_sepatu456@'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user can not find the product")
	public void user_can_not_find_the_product() {
		WebUI.callTestCase(findTestCase('Categories/Step Definition/User cannot find the unavailable product'), [:], FailureHandling.STOP_ON_FAILURE)
	}


	@Given("user login successfully")
	public void user_login_successfully() {
		WebUI.callTestCase(findTestCase('Categories/Step Definition/User already login'), [('email') : 'qabinar11@gmail.com', ('password') : 'qabinar'],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("user choose category")
	public void user_choose_category() {
		WebUI.callTestCase(findTestCase('Categories/Step Definition/User choose category'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user can find the product by category")
	public void user_can_find_the_product_by_category() {
		WebUI.callTestCase(findTestCase('Categories/Step Definition/User can find the product by category'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}