package screens;

import common.CommonActions;
import common.ObjectRepo;
import org.testng.annotations.Test;
import tests.BaseTest;

public class TermsAndConditions  extends BaseTest {




    @Test
    public static void TermsAndConditionsDisplayed() throws InterruptedException {

Thread.sleep(5000);

        System.out.println("Given the Test " );


        CommonActions.scrollUp();

        CommonActions.wait(ObjectRepo.TermsAndConditionsOKBtn,5);
        element(ObjectRepo.TermsAndConditionsOKBtn).click();
    }


}
