package screens;

import base.ScreenBase;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DetailsScreen extends ScreenBase {

    public static By searchBtn = By.id("com.levi9internship.weatherapp:id/searchFragment");
    public static By searchField = By.id("com.levi9internship.weatherapp:id/edit_text_search");
    public static By seeMoreDetailsBtn = By.xpath(
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.LinearLayout[2]");

    public static By addBtn = By.id("com.levi9internship.weatherapp:id/add_button");
    public static By backBtn = By.id("com.levi9internship.weatherapp:id/button_back");
    public static By favBtn = By.id("com.levi9internship.weatherapp:id/favoriteFragment");
    public static By favLoc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup");

    public DetailsScreen(AppiumDriver driver) {
        super(driver);
    }

    public static WebElement getSearchBtn(){
        return driver.findElement(searchBtn);
    }

    public static WebElement getSearchField(){
        return driver.findElement(searchField);
    }

    public static WebElement getSeeMoreDetailsBtn(){
        return driver.findElement(seeMoreDetailsBtn);
    }

    public static WebElement getAddBtn(){
        return driver.findElement(addBtn);
    }
    public static WebElement getBackBtn(){
        return driver.findElement(backBtn);
    }
    public static WebElement getFavBtn(){
        return driver.findElement(favBtn);
    }
    public static WebElement getFavLoc(){
        return driver.findElement(favLoc);
    }

    public static void goToDetails(){
        getSearchBtn().click();
        getSearchField().click();
        getSearchField().sendKeys("Subotica");
        getSeeMoreDetailsBtn().click();
    }


    public static void addLocation(){

        getAddBtn().click();
        getBackBtn().click();
        getFavBtn().click();

    }

    public static void longPressFavLoc(){
        longPress(driver);
    }


}
