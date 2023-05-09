package screens;
import com.github.javafaker.Faker;
import io.appium.java_client.AppiumBy;
import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;

import java.util.NoSuchElementException;

public class WelcomeScreen  extends ScreenBase{



    public WelcomeScreen(AppiumDriver driver) {
        super(driver);
    }

    private static By photo = By.id("com.levi9internship.weatherapp:id/image_weatherIcon");
    private static By title = By.id("com.levi9internship.weatherapp:id/text_title");
    private static By text = By.id("com.levi9internship.weatherapp:id/text_subtitle");
    private static By button = By.id("com.levi9internship.weatherapp:id/button_getStarted");
    private static By whileUsingAppBtn = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    public static By searchBtn = By.id("com.levi9internship.weatherapp:id/searchFragment");


    public static WebElement getPhoto(){
        return driver.findElement(photo);
    }

    public static WebElement getTitle(){
        return driver.findElement(title);
    }
    public static WebElement getText(){
        return driver.findElement(text);
    }
    public static WebElement getButton(){
        return driver.findElement(button);
    }
    public static WebElement getWhileUsingAppBtn (){
        return driver.findElement(whileUsingAppBtn);
    }

    public static void clickGetStartedBtn(){
        getButton().click();
    }


    public static void clickWhileUsingAppBtn(){
        getWhileUsingAppBtn().click();
    }


}
