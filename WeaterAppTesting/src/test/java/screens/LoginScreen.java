package screens;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginScreen extends ScreenBase {

    public static By emailField = By.id("com.levi9internship.weatherapp:id/edit_text_email");
    public static By passField = By.id("com.levi9internship.weatherapp:id/edit_text_password");
    public static By loginBtn = By.id("com.levi9internship.weatherapp:id/button_login");

    public LoginScreen(AppiumDriver driver) {
        super(driver);
    }

    public static WebElement getEmailField(){
        return driver.findElement(emailField);
    }

    public static WebElement getPassField(){
        return driver.findElement(passField);
    }

    public static WebElement getLoginBtn(){
        return driver.findElement(loginBtn);
    }

    public static void logInWithValidData(){
        getEmailField().sendKeys("example@gmail.com");
        getPassField().sendKeys("123456");
        getLoginBtn().click();
    }

    public static void logInWithValidEmailAndInvalidPass(){
        getEmailField().sendKeys("example@gmail.com");
        getPassField().sendKeys("123457");
        getLoginBtn().click();
    }

    public static void logInWithInvalidEmailAndValidPass(){
        getEmailField().sendKeys("example1@gmail.com");
        getPassField().sendKeys("123456");
        getLoginBtn().click();
    }

    public static void logInWithAllEmptyFields(){
        getLoginBtn().click();
    }

    public static void logInWithSpaceBeforeValidEmail(){
        getEmailField().sendKeys(" example@gmail.com");
        getPassField().sendKeys("123456");
        getLoginBtn().click();
    }

    public static void logInWithSpaceBeforeValidPass(){
        getEmailField().sendKeys("example@gmail.com");
        getPassField().sendKeys(" 123456");
        getLoginBtn().click();
    }

}
