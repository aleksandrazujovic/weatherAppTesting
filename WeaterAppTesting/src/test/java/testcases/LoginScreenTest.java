package testcases;

import base.TestBase;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import screens.*;

import java.io.IOException;

public class LoginScreenTest extends TestBase {


    RegisterScreen registerScreen;
    WelcomeScreen welcomeScreen;
    SettingsScreen settingsScreen;
    HomeScreen homeScreen;
    Faker faker;

    @BeforeTest
    public void init() throws IOException {
        setUp();
        registerScreen = new RegisterScreen(driver);
        welcomeScreen = new WelcomeScreen(driver);
        settingsScreen = new SettingsScreen(driver);
        homeScreen = new HomeScreen(driver);
        faker = new Faker();

        WelcomeScreen.clickGetStartedBtn();
        WelcomeScreen.clickWhileUsingAppBtn();
        RegisterScreen.goToSettingsScreen();
        SettingsScreen.goToSignInScreen();
    }

    @Test
    public static void logInWithValidData(){
        String expectedResult = "Log out";

        LoginScreen.logInWithValidData();
        RegisterScreen.goToSettingsScreen();

        String actualResult = SettingsScreen.getLogOutBtn().getText();

        Assert.assertEquals(actualResult,expectedResult);
    }



}
