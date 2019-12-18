package common;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.BaseTest;


public class CommonActions extends BaseTest {
//    public static AppiumDriver<?> driver;



//    public static void setDriver(AppiumDriver driverInstance) {
//        driver = driverInstance;
//
//    }
    //Scroll

    public static void scrollUp() {
        int pressX = 0;
        int topY = 0;
        int bottomY = 0;
        pressX = BaseTest.driver.manage().window().getSize().width / 2;
        bottomY = BaseTest.driver.manage().window().getSize().height;
        topY = BaseTest.driver.manage().window().getSize().height;
        TouchAction touchAction = new TouchAction(BaseTest.driver);
        touchAction.press(PointOption.point(pressX, bottomY * 4 / 5)).waitAction()
                .moveTo(PointOption.point(pressX, topY * 40 / 100)).release().perform();

    }

   public static void wait(By element , int timeout ) {
       WebDriverWait wait = new WebDriverWait(BaseTest.driver, timeout);
       wait.until(ExpectedConditions.presenceOfElementLocated(element));
   }

//    }
//    Wait wait = new FluentWait(tests.BaseTest.driver)
//            .withTimeout(timeout, TimeUnit.SECONDS)
//            .pollingEvery(250, TimeUnit.MILLISECONDS)
//            .ignoring(NoSuchElementException.class)
//            .ignoring(TimeoutException.class);
//       wait.until(ExpectedConditions.visibilityOfElementLocated
//               (element));
//}
//@BeforeTest
//    public static void OpenAppFlow() throws InterruptedException {
//        tests.BaseTest.setDriver(tests.BaseTest.driver);
//
//    }
}




