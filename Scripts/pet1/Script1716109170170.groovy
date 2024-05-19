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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://petstore.octoperf.com/actions/Catalog.action')

WebUI.click(findTestObject('Object Repository/pet1/Page_JPetStore Demo/img'))

WebUI.click(findTestObject('Object Repository/pet1/Page_JPetStore Demo/a_Return to Main Menu'))

WebUI.setText(findTestObject('Object Repository/pet1/Page_JPetStore Demo/input__keyword'), 'birds')

WebUI.sendKeys(findTestObject('Object Repository/pet1/Page_JPetStore Demo/input__keyword'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/pet1/Page_JPetStore Demo/input__searchProducts'))

WebUI.click(findTestObject('Object Repository/pet1/Page_JPetStore Demo/input__searchProducts'))

WebUI.click(findTestObject('Object Repository/pet1/Page_JPetStore Demo/a_Return to Main Menu'))

WebUI.click(findTestObject('Object Repository/pet1/Page_JPetStore Demo/img_1'))

WebUI.click(findTestObject('Object Repository/pet1/Page_JPetStore Demo/a_RP-SN-01'))

WebUI.click(findTestObject('Object Repository/pet1/Page_JPetStore Demo/a_Add to Cart'))

WebUI.click(findTestObject('Object Repository/pet1/Page_JPetStore Demo/a_Proceed to Checkout'))

WebUI.setText(findTestObject('Object Repository/pet1/Page_JPetStore Demo/input_Need a user name and password_username'), 
    'rosh1')

WebUI.setEncryptedText(findTestObject('Object Repository/pet1/Page_JPetStore Demo/input_Need a user name and password_password'), 
    'zXRQAqd5nmk=')

WebUI.click(findTestObject('Object Repository/pet1/Page_JPetStore Demo/input_Need a user name and password_signon'))

WebUI.closeBrowser()

