package screens;

import base.ScreenBase;
import com.github.javafaker.Faker;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterScreen extends ScreenBase {

    private static By settings = By.id("com.levi9internship.weatherapp:id/settingsFragment");
    private static By emailField = By.id("com.levi9internship.weatherapp:id/edit_text_email");
    private static By passField = By.id("com.levi9internship.weatherapp:id/edit_text_password");
    private static By confPassField = By.id("com.levi9internship.weatherapp:id/edit_text_confirm_password");
    private static By registerBtn = By.id("com.levi9internship.weatherapp:id/button_register");
    private static By errorMessage = By.id("com.levi9internship.weatherapp:id/text_view_error_message");

    public RegisterScreen(AppiumDriver driver) {
        super(driver);
    }

   public static String pass = "111222";

    public static WebElement getSettings(){
        return driver.findElement(settings);
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
    public static WebElement getRegisterBtn(){
        return driver.findElement(registerBtn);
    }
    public static WebElement getErrorMessage(){
        return driver.findElement(errorMessage);
    }

    public static void goToSettingsScreen(){
        getSettings().click();
    }

    public static void registerWithValidData() throws InterruptedException {
        getEmailField().sendKeys(faker.internet().emailAddress());
        String password = faker.internet().password(6,20);
        getPassField().sendKeys(password);
        getConfPassField().sendKeys(password);
       // Thread.sleep(10000);
        getRegisterBtn().click();
    }

    public static void registerWithEmptyFields(){
        getRegisterBtn().click();
    }

    public static void registerWithWrongEmailFormat(){
        getEmailField().sendKeys("sanja.com");
        getPassField().sendKeys(pass);
        getConfPassField().sendKeys(pass);
        getRegisterBtn().click();
    }

    public static void registerWithWrongPassFormat(){
        getEmailField().sendKeys(faker.internet().emailAddress());
        getPassField().sendKeys("123");
        getConfPassField().sendKeys("123");
        getRegisterBtn().click();
    }

    public static void registerWithWrongConfPass(){
        getEmailField().sendKeys(faker.internet().emailAddress());
        getPassField().sendKeys("123456");
        getConfPassField().sendKeys("123457");
        getRegisterBtn().click();
    }

    public static void registerWithExistingEmail(){
        getEmailField().sendKeys("example@gmail.com");
        getPassField().sendKeys("123456");
        getConfPassField().sendKeys("123456");
        getRegisterBtn().click();
    }




}
