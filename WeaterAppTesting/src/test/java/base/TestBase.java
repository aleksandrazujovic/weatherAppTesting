package base;

import com.github.javafaker.Faker;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import screens.WelcomeScreen;
import utils.CommonUtils;

import java.io.IOException;

public class TestBase {


    public static AppiumDriver driver;
    public static String loadPropertyFile = "android_app.properties";

    public void setUp() throws IOException {

            if (loadPropertyFile.startsWith("android")) {
                CommonUtils.loadAndroidConfigProp();
                CommonUtils.setAndroidCapabilities();
                driver = CommonUtils.getAndroidDriver();

            } if (loadPropertyFile.startsWith("ios")){
                CommonUtils.loadIOSConfigProp();
                CommonUtils.setIOSCapabilities();
                driver = CommonUtils.getIOSDriver();
            }
        }

    @AfterClass
    public void afterSuite(){

        //driver.quit();

    }

}
