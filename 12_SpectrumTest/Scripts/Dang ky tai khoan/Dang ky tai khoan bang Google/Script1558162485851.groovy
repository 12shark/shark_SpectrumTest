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

WebUI.maximizeWindow()

WebUI.navigateToUrl(url)

WebUI.click(findTestObject('Object Repository/Page_Spectrum/button_Log in or sign up'))

WebUI.click(findTestObject('Object Repository/Page_Spectrum/button_Log in or sign up'))

WebUI.click(findTestObject('Object Repository/Page_Spectrum/span_Sign in with Google'))

WebUI.setText(findTestObject('Object Repository/Page_ng nhp - Ti khon Google/input_Spectrum_identifier'), username)

WebUI.click(findTestObject('Object Repository/Page_ng nhp - Ti khon Google/span_Tip theo'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ng nhp - Ti khon Google/input_Qu nhiu ln th khng thnh cng_password'), 
    password)

WebUI.click(findTestObject('Object Repository/Page_ng nhp - Ti khon Google/span_Tip theo'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Create a username_style__StyledInput-npkcpv-2 eJtFFl'), name)

WebUI.click(findTestObject('Object Repository/Page_/button_Save and Continue'))

WebUI.closeBrowser()

