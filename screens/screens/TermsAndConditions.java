package screens;

import common.CommonActions;
import common.ObjectRepo;
import tests.BaseTest;

public class TermsAndConditions  extends BaseTest {


    public static void clickOnOKiBtn() throws InterruptedException {

        Thread.sleep(5000);

        System.out.println("Given the Setup method is Passed the App should be Lunched ");


        CommonActions.scrollUp();
        System.out.println("Given the scroll Method is Run The T&S should be scroll up to bottom screen");
        CommonActions.wait(ObjectRepo.TermsAndConditionsOKBtn, 5);
        System.out.println("Given the Oki button the Native permission of the call should be displayed");
        element(ObjectRepo.TermsAndConditionsOKBtn).click();
//        element(ObjectRepo.NativePermissionAllowBtn).click();
    }

    public static void clickOnCancelBtn() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Given the setup screen is passed and the Terms and Condition Displayed successfully ");
        CommonActions.scrollUp();
        System.out.println("Given the app scroll method is Run the T&S should be scroll up to the bottom screen ");
        CommonActions.wait(ObjectRepo.TermsAndConditionsCancelBtn, 5);
        element(ObjectRepo.TermsAndConditionsCancelBtn).click();
        if (element(ObjectRepo.TermsAndConditionsErrorMsg).isDisplayed()) {

            element(ObjectRepo.ErrorMessageCTA).click();

        }


    }

    public static void AllowCallNativePermssion() throws InterruptedException {

        if (element(ObjectRepo.CallNativePermissionMsg).isDisplayed()) {

            element(ObjectRepo.CallNativePermissionAllowBtn).click();

        }


    }
    public static void DenyCallNativePermssion() throws InterruptedException {

        if (element(ObjectRepo.CallNativePermissionMsg).isDisplayed()) {

            element(ObjectRepo.CallNativePermissionDenyBtn).click();


        }


    }
    public static void AllowLocationNativePermission() throws InterruptedException {

        if (element(ObjectRepo.LocationNativePermissionMsg).isDisplayed()) {

            element(ObjectRepo.LocationNativePermissionAllaw).click();


        }
    }
    public static void DenyLocationNativePermission() throws InterruptedException {

        if (element(ObjectRepo.LocationNativePermissionMsg).isDisplayed()) {

            element(ObjectRepo.LocationNativePermissionDeny).click();


        }
    }
    public static void AllowTheCallLogNativePermission() throws InterruptedException {

        if (element(ObjectRepo.CallNativePermissionMsg).isDisplayed()) {

            element(ObjectRepo.CallNativePermissionAllowBtn).click();


        }
    } public static void DenyCallLogNativePermission() throws InterruptedException {

        if (element(ObjectRepo.CallNativePermissionMsg).isDisplayed()) {

            element(ObjectRepo.CallNativePermissionDenyBtn).click();


        }
    }


}