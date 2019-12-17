import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

abstract class BaseTest {

	public static AppiumDriver<?> driver;
	public static String platform;


	
	public static void appInit(String platform) {
		BaseTest.platform=platform;
		ObjectRepo objectRepo = new ObjectRepo(platform);
	}
	
	
	
	public static WebElement element(By element) {
		return driver.findElement(element);
	}
	
	
	@BeforeSuite
	static void setUpBeforeClass() throws Exception {
			
	}

	@AfterSuite
	static void tearDownAfterClass() throws Exception {
	}

	//@BeforeEach

	@BeforeClass
	@Parameters({"PLATFORM_NAME"})
	void setUp(String PLATFORM_NAME , String DEVICE_NAME, String APPIUM_VERSION, String PLATFORM_VERSION, String AUTOMATION_NAME) throws MalformedURLException  {


		DesiredCapabilities capabilities = new DesiredCapabilities();
		
			switch (platform)
			{
			case "nativeAndroid":
				
			{
				capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.10.0");
				capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
				capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,PLATFORM_NAME);
				capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
				capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "ce0417142ca460bf0d");
				capabilities.setCapability("newCommandTimeout", 2000);
				capabilities.setCapability("appActivity", "hu.vodafone.apps.myvodafone.splash.view.VFHUSplashActivity");
				capabilities.setCapability("appPackage", "hu.vodafone.apps.myvodafone");
				
				driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
				
				 
			}
			break;

			case  "nativeIOS":
			{
				capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.13");
				capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.4");
				capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"iOS");
				capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest");
				capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone");
				capabilities.setCapability("newCommandTimeout", 2000);
				capabilities.setCapability("udid", "");
				capabilities.setCapability("bundleId", "");
				capabilities.setCapability("autoDismissAlerts",true);

				driver = new AppiumDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
			}
			break;
			default:
				System.out.println("Choose platform as per naming convention. ie nativeAndroid");
				break;
			}

	}

	//@AfterEach

	void tearDown() throws Exception {
		//driver.quit();
		
		
	}



}
