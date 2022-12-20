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

Mobile.startApplication('C:\\Users\\DELL\\Katalon Studio\\APK\\Solodroid_E-CommerceApp Demo_3.2.0.apk', true)

Mobile.tap(findTestObject('Object Repository/Category/Add To Cart/android.widget.TextView - Category'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Category/Add To Cart/android.widget.TextView - Category (1)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Category/Add To Cart/android.widget.RelativeLayout'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Category/Add To Cart/android.widget.TextView - Electronics  Gadgets'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/Category/Add To Cart/androidx.recyclerview.widget.RecyclerView'), 
    0)

Mobile.tap(findTestObject('Object Repository/Category/Add To Cart/android.widget.TextView - U17 USB Portable M3 HUmidifier Air Purifier LED Night Light 200ML'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/Category/Add To Cart/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Category/Add To Cart/android.widget.Button - ADD TO CART'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Category/Add To Cart/android.widget.TextView - Number of order'), 
    0)

Mobile.tap(findTestObject('Object Repository/Category/Add To Cart/android.widget.EditText (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Category/Add To Cart/android.widget.EditText (2)'), '123', 0)

Mobile.tap(findTestObject('Object Repository/Category/Add To Cart/android.widget.Button - ADD'), 0)

Mobile.closeApplication()

