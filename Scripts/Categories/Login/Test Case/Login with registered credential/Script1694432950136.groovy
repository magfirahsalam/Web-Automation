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

WebUI.callTestCase(findTestCase('Login/Step Definition/01 user landing on homepage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Login/Step Definition/02 user click button masuk in home page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Login/Step Definition/03 user click input email'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Login/Step Definition/04 user click input password'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Login/Step Definition/05 user click button masuk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Login/Step Definition/verifyElementPresentlogoSS'), [:], FailureHandling.STOP_ON_FAILURE)

