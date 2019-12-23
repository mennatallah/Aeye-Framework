package tests;

import common.ObjectRepo;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

abstract public class BaseTest {

	public static AppiumDriver <?> driver;
	public static String platform;
	public static String DEVICE_NAME;
//	public static AppiumDriver driver;
	private static WebElement element = null;
	public static By element1 = null;
//
//	public static void setDriver(AppiumDriver driverInstance) {
//		driver = driverInstance;
//
//	}



	
	public static void appInit(String platform, String DEVICE_NAME ) {
		BaseTest.platform=platform;
		BaseTest.DEVICE_NAME = DEVICE_NAME;
		ObjectRepo.ObjectRepo(BaseTest.platform);
	}
	
	


	@BeforeSuite
	@Parameters({"platform", "DEVICE_NAME"})
	static void setUpBeforeClass(String platform, String DEVICE_NAME) throws Exception {

		appInit(platform, DEVICE_NAME);

	}

	@AfterClass
	static void tearDownAfterClass() throws Exception{


	}


	public static WebElement element(By element) {
		return driver.findElement(element);
	}




	@BeforeTest
	@Parameters({"APPIUM_VERSION", "PLATFORM_VERSION", "PLATFORM_NAME", "AUTOMATION_NAME", "DEVICE_NAME", "udid", "appActivity", "appPackage", "bundleId", "host"})
	void setUp(String APPIUM_VERSION,
			   String PLATFORM_VERSION,
			   String PLATFORM_NAME,
			   String AUTOMATION_NAME,
			   String DEVICE_NAME,
			   String udid,
			   String appActivity,
			   String appPackage,
			   String bundleId,
			   String host) throws MalformedURLException{


		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, APPIUM_VERSION);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, PLATFORM_VERSION);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,PLATFORM_NAME);
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,AUTOMATION_NAME);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
		capabilities.setCapability("newCommandTimeout", 6000);
		capabilities.setCapability("adbExecTimeout",10000);
		capabilities.setCapability("udid", udid);
		capabilities.setCapability("bundleId", bundleId);
		capabilities.setCapability("appActivity", appActivity);
		capabilities.setCapability("appPackage", appPackage);

		driver = new AppiumDriver<>(new URL(host), capabilities);
	}


	@AfterTest
	void tearDown() throws Exception {
	//driver.quit();


	}



}
