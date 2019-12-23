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
	public static By NativePermissionAllowBtn;
	public static By TermsAndConditionsErrorMsg;
	public static By ErrorMessageCTA;
	public static By CallNativePermissionMsg;
	public static By CallNativePermissionAllowBtn;
	public static By CallNativePermissionDenyBtn;
	public static By LocationNativePermissionMsg;
	public static By LocationNativePermissionAllaw;
	public static By LocationNativePermissionDeny;
	public static By CallLogsPermissionMsg;
	public static By PaginationOfNativePermission;
	public static By CallLogsNativePermissionAllowBtn;
	public static By CallLogsNativePermissionDenyBtn;

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
		TermsAndConditionsCancelBtn = By.id("hu.vodafone.apps.myvodafone:id/cancel_button");
		TermsAndConditionsOKBtn =By.id("hu.vodafone.apps.myvodafone:id/confirm_button");
		NativePermissionAllowBtn = By.id("com.android.packageinstaller:id/permission_allow_button");
		TermsAndConditionsErrorMsg = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout");
		ErrorMessageCTA = By.id("android:id/button1");
		CallNativePermissionMsg = By.id("com.android.packageinstaller:id/dialog_container");
		CallNativePermissionAllowBtn = By.id("com.android.packageinstaller:id/permission_allow_button");
		CallNativePermissionDenyBtn = By.id("com.android.packageinstaller:id/permission_deny_button");
		LocationNativePermissionMsg = By.id("com.android.packageinstaller:id/dialog_container");
		LocationNativePermissionAllaw = By.id("com.android.packageinstaller:id/permission_allow_button");
		LocationNativePermissionDeny = By.id("com.android.packageinstaller:id/permission_deny_button");
		CallLogsPermissionMsg = By.id("com.android.packageinstaller:id/dialog_container");
		PaginationOfNativePermission = By.id("com.android.packageinstaller:id/current_page_text");
		CallLogsNativePermissionAllowBtn = By.id("com.android.packageinstaller:id/permission_allow_button");
		CallLogsNativePermissionDenyBtn = By.id("com.android.packageinstaller:id/permission_deny_button");


	}

	private static void nativeAndroid() {
		TermsAndConditionsTitle = By.id("pageTitle");
		TermsAndConditionsFooter = By.id("hu.vodafone.apps.myvodafone:id/footer");
		TermsAndConditionsCancelBtn = By.id("hu.vodafone.apps.myvodafone:id/cancel_button");
		TermsAndConditionsOKBtn =By.id("hu.vodafone.apps.myvodafone:id/confirm_button");
		NativePermissionAllowBtn = By.id("com.android.packageinstaller:id/permission_allow_button");
		TermsAndConditionsErrorMsg = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout");
		ErrorMessageCTA = By.id("android:id/button1");
		CallNativePermissionMsg = By.id("com.android.packageinstaller:id/dialog_container");
		CallNativePermissionAllowBtn = By.id("com.android.packageinstaller:id/permission_allow_button");
		CallNativePermissionDenyBtn = By.id("com.android.packageinstaller:id/permission_deny_button");
		LocationNativePermissionMsg = By.id("com.android.packageinstaller:id/dialog_container");
		LocationNativePermissionAllaw = By.id("com.android.packageinstaller:id/permission_allow_button");
		LocationNativePermissionDeny = By.id("com.android.packageinstaller:id/permission_deny_button");
		CallLogsPermissionMsg = By.id("com.android.packageinstaller:id/dialog_container");
		PaginationOfNativePermission = By.id("com.android.packageinstaller:id/current_page_text");
		CallLogsNativePermissionAllowBtn = By.id("com.android.packageinstaller:id/permission_allow_button");
		CallLogsNativePermissionDenyBtn = By.id("com.android.packageinstaller:id/permission_deny_button");

	}

}
