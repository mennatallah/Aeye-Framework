package tests;

import org.testng.annotations.Test;
import screens.TermsAndConditions;

public class Login extends BaseTest {
	

	@Test
	public static void runTheLoginScreen() throws Exception {



		System.out.println("Given the App is open ");

	TermsAndConditions.clickOnOKiBtn();
//	boolean NativeCallPopupDescExpected =  element(ObjectRepo.PaginationOfNativePermission).getText().contains("Allow My Vodafone to make and manage phone calls?");
//	if ( element(ObjectRepo.PaginationOfNativePermission).getText().equals("1 of 3")){
//		Assert.assertTrue(NativeCallPopupDescExpected,"The Native Call permission displayed " );
//	}

//
		TermsAndConditions.AllowCallNativePermssion();
		TermsAndConditions.AllowLocationNativePermission();
//
TermsAndConditions.AllowTheCallLogNativePermission();


	}

}
