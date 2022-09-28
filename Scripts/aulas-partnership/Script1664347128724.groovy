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

Mobile.startApplication('D:\\Aulas.apk', true)

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.widget.TextView - UPDATE NOW'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.widget.TextView - RESTART AULAS'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.widget.FrameLayout'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.widget.TextView - (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/aulas-partnership/android.widget.EditText - Mobile Number'), '9399613815')

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.widget.TextView - CONTINUE'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.view.ViewGroup (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/aulas-partnership/android.widget.EditText'), '592726')

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.widget.TextView - VERIFY'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.widget.TextView - partnership'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.view.ViewGroup (3)'), 0)

Mobile.takeScreenshot('C:\\Users\\user\\AppData\\Local\\Temp\\screenshot1080789613267637651.png')

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.view.ViewGroup (4)'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.view.ViewGroup (5)'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.widget.TextView - Fee Payments'), 0)

Mobile.takeScreenshot('C:\\Users\\user\\AppData\\Local\\Temp\\screenshot9101707345409669639.png')

Mobile.hideKeyboard()

Mobile.pressBack()

Mobile.switchToLandscape()

Mobile.switchToNative()

Mobile.switchToPortrait()

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.widget.TextView - Announcements'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.widget.TextView - Test'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.view.ViewGroup (6)'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.widget.TextView - Chapter Test'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.widget.TextView - More'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.view.ViewGroup (7)'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.widget.TextView - partnership (1)'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.view.ViewGroup (8)'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-partnership/android.widget.TextView - LOG OUT'), 0)

Mobile.closeApplication()

