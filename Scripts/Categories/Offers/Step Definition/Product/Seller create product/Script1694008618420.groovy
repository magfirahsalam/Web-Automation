import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.verifyElementPresent(findTestObject('Offers/Product/btnJualHome'), 3)

WebUI.click(findTestObject('Offers/Product/btnJualHome'))

WebUI.verifyElementPresent(findTestObject('Offers/Product/fieldNamaJual'), 3)

WebUI.setText(findTestObject('Offers/Product/fieldNamaJual'), 'FunkoPOP! Deadpool')

WebUI.setText(findTestObject('Offers/Product/fieldHargaJual'), '275000')

WebUI.click(findTestObject('Offers/Product/fieldKategoriJual'))

WebUI.click(findTestObject('Offers/Product/selectCategory'))

WebUI.setText(findTestObject('Offers/Product/fieldDeskripsiJual'), 'Funko POP! MARVEL DEADPOOL')

WebUI.uploadFile(findTestObject('Offers/Product/fieldGambarJual'), 'D:\\deadpool-funko.png')

WebUI.click(findTestObject('Offers/Product/btnTerbitkanJual'))

