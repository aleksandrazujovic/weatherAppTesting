package screens;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeScreen extends ScreenBase {


    private static By homeBtn = By.id("com.levi9internship.weatherapp:id/homeFragment");

    private static By area = By.id("android:id/content");
    private static By details = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView/android.widget.LinearLayout");

    private static By nameOfCity = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");


    public HomeScreen(AppiumDriver driver) {
        super(driver);
    }
    public static WebElement getNameOfCity(){
        return driver.findElement(nameOfCity);
    }

    public static WebElement getHomeBtn(){
        return driver.findElement(homeBtn);
    }
    public static WebElement getDetails(){
        return driver.findElement(details);
    }

    public static void goToHome(){
        getHomeBtn().click();
    }

    public static void scrollScreen(){
        verticalScroll(driver);
    }



}
