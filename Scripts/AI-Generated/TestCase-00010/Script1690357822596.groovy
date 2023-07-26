import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page_thank-youfd96-111b-445c-b57c-51f9e7e09286'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/thank-you/2393fd96-111b-445c-b57c-51f9e7e09286')

'step 2: Add visual checkpoint at Page_thank-youfd96-111b-445c-b57c-51f9e7e09286'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00010_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
