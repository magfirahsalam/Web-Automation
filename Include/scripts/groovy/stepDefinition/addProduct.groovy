package stepDefinition
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


public class addProduct {

	@Given("User Login Satu")
	public void user_login_satu() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click button Jual Satu")
	public void user_click_button_jual_satu() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Click Button Jual'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Input Nama Produk Satu")
	public void user_input_nama_produk_satu() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Input Nama Produk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Input Harga Produk Satu")
	public void user_input_harga_produk_satu() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Input Harga Produk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Set Categories Satu")
	public void user_set_categories_satu() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Set Categories'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Set Deskripsi Satu")
	public void user_set_deskripsi_satu() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Set Deskripsi'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Add Image Satu")
	public void user_add_image_satu() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Add Image'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Klik Terbitkan Satu")
	public void user_klik_terbitkan_satu() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Click Terbitkan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Product successfully published")
	public void user_success_add_product1() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Successfull Add Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User Login Dua")
	public void user_login_dua() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click button Jual Dua")
	public void user_click_button_jual_dua() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Click Button Jual'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Input Harga Produk Dua")
	public void user_input_harga_produk_dua() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Input Harga Produk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Set Categories Dua")
	public void user_set_categories_dua() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Set Categories'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Set Deskripsi Dua")
	public void user_set_deskripsi_dua() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Set Deskripsi'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Add Image Dua")
	public void user_add_image_dua() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Add Image'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Klik Terbitkan Dua")
	public void user_klik_terbitkan_dua() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Click Terbitkan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Name Cannot Blank")
	public void user_failed_add_product_name_blank() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Failed Add Product Because Name Blank'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User Login Tiga")
	public void user_login_tiga() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click button Jual Tiga")
	public void user_click_button_jual_tiga() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Click Button Jual'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Input Nama Produk Tiga")
	public void user_input_nama_produk_tiga() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Input Nama Produk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Input Harga Produk Salah")
	public void user_input_harga_produk_salah() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Input Harga Produk Salah'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Set Categories Tiga")
	public void user_set_categories_tiga() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Set Categories'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Set Deskripsi Tiga")
	public void user_set_deskripsi_tiga() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Set Deskripsi'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Add Image Tiga")
	public void user_add_image_tiga() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Add Image'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Klik Terbitkan Tiga")
	public void user_klik_terbitkan_tiga() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Click Terbitkan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Price Only Number")
	public void user_failed_add_product_price_wrong() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Failed Add Product Because Price Blank'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User Login Empat")
	public void user_login_empat() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click button Jual Empat")
	public void user_click_button_jual_empat() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Click Button Jual'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Klik Terbitkan Empat")
	public void user_klik_terbitkan_empat() {
		WebUI.scrollToElement(findTestObject('Object Repository/Product/Add Product/btnTerbitkan'), 5)
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Click Terbitkan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Product Failed published")
	public void user_failed_add_product() {
		WebUI.callTestCase(findTestCase('Product/Add Product/Step Definition/User Failed Add Product Because All Field Blank'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}
