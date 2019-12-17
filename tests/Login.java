import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.sql.SQLOutput;


class Login extends BaseTest {
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		appInit("nativeAndroid");
	}
	@Test
	void test() throws Exception {

		CommonActions.OpenAppFlow();


		System.out.println("The App lunched ");

		TermsAndConditions.TermsAndConditionsDisplayed();
		//element(ObjectRepo.username).click();
	}

}
