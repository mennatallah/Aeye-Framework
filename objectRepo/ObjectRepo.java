import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public  class ObjectRepo {
	public static AppiumDriver driver;
	private static WebElement element = null;
	public static By element1 = null;

	public static void setDriver(AppiumDriver driverInstance) {
		driver = driverInstance;

	}
//	public static WebElement findElement (By WB , AndroidDriver driver){
//
//		element= driver.findElement(WB);
//
//		return element;
//
//	}

	//Elements
	public static By TermsAndConditionsTitle;
	public static By TermsAndConditionsFooter;
	public static By TermsAndConditionsCancelBtn;
	public static By TermsAndConditionsOKBtn;

	
	ObjectRepo(String platform)
	{
	
	switch (platform)
	{
	case "nativeAndroid":
		
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



	private void nativeIOS() {

		TermsAndConditionsTitle = By.id("pageTitle");
		TermsAndConditionsFooter = By.id("hu.vodafone.apps.myvodafone:id/footer");
		TermsAndConditionsCancelBtn = By.id("cancel_button");
		TermsAndConditionsOKBtn =By.id("hu.vodafone.apps.myvodafone:id/confirm_button");

	}

	private void nativeAndroid() {
		TermsAndConditionsTitle = By.id("pageTitle");
		TermsAndConditionsFooter = By.id("hu.vodafone.apps.myvodafone:id/footer");
		TermsAndConditionsCancelBtn = By.id("cancel_button");
		TermsAndConditionsOKBtn =By.id("hu.vodafone.apps.myvodafone:id/confirm_button");



	}

}
