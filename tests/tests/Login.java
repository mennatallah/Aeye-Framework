package tests;

import org.testng.annotations.Test;
import screens.TermsAndConditions;

public class Login extends BaseTest {
	

	@Test
	public static void run() throws Exception {
//
//CommonActions.OpenAppFlow();


		System.out.println("The App lunched ");

		TermsAndConditions.TermsAndConditionsDisplayed();
		//element(common.ObjectRepo.username).click();
	}

}
