package common;

import org.openqa.selenium.By;
import tests.BaseTest;


public  class ObjectRepo extends BaseTest {
//	public static AndroidDriver<?> driver;
//	private static WebElement  element = null;
//	public static By element1 = null;
//	public static void setDriver(AndroidDriver driverInstance) {
//		driver = driverInstance;
//
//	}

	//Elements
	public static By TermsAndConditionsTitle;
	public static By TermsAndConditionsFooter;
	public static By TermsAndConditionsCancelBtn;
	public static By TermsAndConditionsOKBtn;

	
	public static void ObjectRepo(String platform)

	{
	
	switch (platform)
	{
	case "native-android":
		
	{
		nativeAndroid();
	}
	break;
	case  "nativeIOS":
	{
		nativeIOS();
	}
	break;
	default:
		System.out.println("Choose platform as per naming convention. ie nativeAndroid");
		
		break;
	}
	
	}



	private static void nativeIOS() {

		TermsAndConditionsTitle = By.id("pageTitle");
		TermsAndConditionsFooter = By.id("hu.vodafone.apps.myvodafone:id/footer");
		TermsAndConditionsCancelBtn = By.id("cancel_button");
		TermsAndConditionsOKBtn =By.id("hu.vodafone.apps.myvodafone:id/confirm_button");

	}

	private static void nativeAndroid() {
		TermsAndConditionsTitle = By.id("pageTitle");
		TermsAndConditionsFooter = By.id("hu.vodafone.apps.myvodafone:id/footer");
		TermsAndConditionsCancelBtn = By.id("cancel_button");
		TermsAndConditionsOKBtn =By.id("hu.vodafone.apps.myvodafone:id/confirm_button");



	}

}
