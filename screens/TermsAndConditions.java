import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.SQLOutput;

public class TermsAndConditions  {


    public AndroidDriver<?> driver;
    String MSSDIN;

   @Parameters({"MSSDIN"})
    @BeforeTest
    public  void beforeTest(String MSSDIN) throws InterruptedException {
        CommonActions.setDriver(driver);
        ObjectRepo.setDriver(driver);
        CommonActions.wait(ObjectRepo.TermsAndConditionsTitle,5000);

    }

    @Test
    public static void TermsAndConditionsDisplayed() throws InterruptedException {

Thread.sleep(5000);

        System.out.println("start" );

        //CommonActions.scrollUpTo(ObjectRepo.TermsAndConditionsCancelBtn, 1000);
        CommonActions.scrollUp();
        CommonActions.wait(ObjectRepo.TermsAndConditionsOKBtn, 5);
        CommonActions.element(ObjectRepo.TermsAndConditionsOKBtn).click();
    }
//
//    @Parameters({ "PLATFORM_NAME", "DEVICE_NAME","PLATFORM_VERSION" })
//    @BeforeSuite
//    public void beforeSuite(String PLATFORM_NAME , String DEVICE_NAME , String PLATFORM_VERSION ) throws MalformedURLException {
//        System.out.println("PLATFORM_NAME"+PLATFORM_NAME);
//        driver = ReadCapabilities.ReadCap(PLATFORM_NAME, DEVICE_NAME, PLATFORM_VERSION);
//        System.out.println("DEVICE_NAME"+DEVICE_NAME);

  //  }

}
