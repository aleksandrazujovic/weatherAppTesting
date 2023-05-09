package screens;

import base.ScreenBase;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static base.TestBase.loadPropertyFile;

public class RegisterScreenIOS extends ScreenBase {



    public static WebElement getStartedd(){
        if (loadPropertyFile.startsWith("ios")) {
            return driver.findElement(new AppiumBy.ByAccessibilityId("button_getStarted"));
        }
        else  {
            return driver.findElement(By.id("com.levi9internship.weatherapp:id/button_getStarted"));
            }

    }
    public static By getStarted = new AppiumBy.ByAccessibilityId("button_getStarted");
    public static By allowOneBtn = new AppiumBy.ByAccessibilityId("Allow Once");
    public static By settingsBtn = new AppiumBy.ByAccessibilityId("gearshape");
    public static By createAnAccBtn = new AppiumBy.ByAccessibilityId("Create an account");
    public static By emailField = new AppiumBy.ByAccessibilityId("edit_text_email");
    public static By passField = new AppiumBy.ByAccessibilityId("edit_text_password");
    public static By confPassField = new AppiumBy.ByAccessibilityId("edit_text_confirm_password");
    public static By signUpBtn = new AppiumBy.ByAccessibilityId("button_register");

    public RegisterScreenIOS(AppiumDriver driver) {
        super(driver);
    }

    public static WebElement getGetStartedBtn(){
        return driver.findElement(getStarted);
    }
    public static WebElement getAllowOneBtn(){
        return driver.findElement(allowOneBtn);
    }

    public static WebElement getSettingsBtn(){
        return driver.findElement(settingsBtn);
    }

    public static WebElement getCreateAccBtn(){
        return driver.findElement(createAnAccBtn);
    }

    public static WebElement getEmailField(){
        return driver.findElement(emailField);
    }

    public static WebElement getPassField(){
        return driver.findElement(passField);
    }

    public static WebElement getConfPassField(){
        return driver.findElement(confPassField);
    }

    public static WebElement getSignUpBtn(){
        return driver.findElement(signUpBtn);
    }

    public static void signUpWithValidData(){
        getStartedd().click();
        getAllowOneBtn().click();
        getSettingsBtn().click();
        getCreateAccBtn().click();
        getEmailField().sendKeys(faker.internet().emailAddress());
        String pass = faker.internet().password(6,15);
        getPassField().sendKeys(pass);
        getConfPassField().sendKeys(pass);
        getSignUpBtn().click();
    }

}
