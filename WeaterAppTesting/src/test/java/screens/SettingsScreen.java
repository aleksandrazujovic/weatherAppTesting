package screens;

import base.ScreenBase;
import com.github.javafaker.Faker;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SettingsScreen extends ScreenBase {

    private static By createAccBtn = By.id("com.levi9internship.weatherapp:id/layout_create_an_account");

    private static By signInBtn = By.id("com.levi9internship.weatherapp:id/layout_signIn");
    private static By logOutBtn = By.id("com.levi9internship.weatherapp:id/layout_log_out");
    private static By logOutTxt = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView");
    private static By yesBtn = By.id("android:id/button1");
    private static By createAccText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView");
    public SettingsScreen(AppiumDriver driver) {
        super(driver);
    }

    public static WebElement getCreateAccBtn(){
        return driver.findElement(createAccBtn);
    }
    public static WebElement getSignInBtn(){
        return driver.findElement(signInBtn);
    }
    public static WebElement getLogOutBtn(){
        return driver.findElement(logOutBtn);
    }
    public static WebElement getYesBtn(){
        return driver.findElement(yesBtn);
    }
    public static WebElement getLogOutTxt(){
        return driver.findElement(logOutTxt);
    }
    public static WebElement getCreateAccTxt(){
        return driver.findElement(createAccText);
    }

    public static void goToRegisterScreen(){
        getCreateAccBtn().click();
    }
    public static void goToSignInScreen(){
        getSignInBtn().click();
    }

    public static void logOut(){
        getLogOutBtn().click();
        getYesBtn().click();
    }

    public static String createAccTextBtn(){
        return getCreateAccBtn().findElement(By.className("android.widget.TextView")).getText();
    }
}


