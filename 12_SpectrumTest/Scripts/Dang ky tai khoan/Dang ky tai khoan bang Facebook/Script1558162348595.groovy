import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://spectrum.chat/')

WebUI.maximizeWindow()

WebUI.waitForElementClickable(findTestObject('Page_Spectrum/button_Log in or sign up'), 5)

WebUI.click(findTestObject('Page_Spectrum/button_Log in or sign up'))

WebUI.click(findTestObject('Page_Spectrum/span_Sign in with Facebook'))

WebUI.setText(findTestObject('Object Repository/Page_Log in to Facebook  Facebook/input_Log in to Facebook_email'), '0355766369')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to Facebook  Facebook/input_Log in to Facebook_pass'), 
    '12FH+2FF7HnqKYAbf+0XZg==')

WebUI.click(findTestObject('Object Repository/Page_Log in to Facebook  Facebook/button_Log In'))

WebUI.click(findTestObject('Page_Dang nhp bng Facebook/button_Tip tc di tn Chn'))

WebUI.click(findTestObject('Page_/button_Save and Continue'))

WebUI.closeBrowser()

