package testcases;

import base.TestBase;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import screens.HomeScreen;
import screens.RegisterScreen;
import screens.SettingsScreen;
import screens.WelcomeScreen;

import java.io.IOException;

public class RegisterScreenTest extends TestBase {

    RegisterScreen registerScreen;
    WelcomeScreen welcomeScreen;
    SettingsScreen settingsScreen;
    HomeScreen homeScreen;
    Faker faker;

    @BeforeTest
    public void init() throws IOException, InterruptedException {
        setUp();
        registerScreen = new RegisterScreen(driver);
        welcomeScreen = new WelcomeScreen(driver);
        settingsScreen = new SettingsScreen(driver);
        homeScreen = new HomeScreen(driver);
        faker = new Faker();

        WelcomeScreen.clickGetStartedBtn();
        WelcomeScreen.clickWhileUsingAppBtn();
        RegisterScreen.goToSettingsScreen();
        SettingsScreen.goToRegisterScreen();

    }


    @Test (priority = 6)
    public static void regWithValidData() throws InterruptedException {

        RegisterScreen.registerWithValidData();

    }

    @Test (priority = 1)
    public static void regWithAllEmptyFields() throws InterruptedException {
        String expectedResult = "Please enter email address";

        Thread.sleep(5000);
        RegisterScreen.registerWithEmptyFields();
        String actualResult = RegisterScreen.getErrorMessage().getText();

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test (priority = 2)
    public static void regWithWrongMailFormat() throws InterruptedException {
        Thread.sleep(2000);
        String expectedResult = "Invalid email address format";

        RegisterScreen.registerWithWrongEmailFormat();
        String actualResult = RegisterScreen.getErrorMessage().getText();

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test (priority = 3)
    public static void regWithWrongPassFormat() throws InterruptedException {
        Thread.sleep(2000);
        String expectedResult = "Password must be at least 6 characters long";

        RegisterScreen.registerWithWrongPassFormat();
        String actualResult = RegisterScreen.getErrorMessage().getText();

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test (priority = 4)
    public static void regWithWrongConfPass() throws InterruptedException {
        Thread.sleep(2000);
        String expectedResult = "Passwords and confirm password do not match";

        RegisterScreen.registerWithWrongConfPass();
        String actualResult = RegisterScreen.getErrorMessage().getText();

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test (priority = 5)
    public static void regWithExistingEmail() throws InterruptedException {
        Thread.sleep(2000);
        String expectedResult = "The email address is already in use by another account.";

        RegisterScreen.registerWithExistingEmail();
        String actualResult = RegisterScreen.getErrorMessage().getText();

        Assert.assertEquals(actualResult,expectedResult);
    }






}
