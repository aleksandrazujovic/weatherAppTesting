package testcases;

import base.TestBase;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import screens.*;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class FlowTest extends TestBase {
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

    }

    @Test
    public static void test() throws InterruptedException {

        String expectedResult1 = "Novi Sad";
        String expectedResult2 = "Subotica";
        String expectedResult3 = "Log out";
        String expectedResult4 = "Create an account";


        WelcomeScreen.clickGetStartedBtn();
        Thread.sleep(5000);
        WelcomeScreen.clickWhileUsingAppBtn();
        Thread.sleep(5000);
        String actualResult1 = HomeScreen.getNameOfCity().getText();
        Assert.assertEquals(actualResult1,expectedResult1);
        Thread.sleep(5000);


        RegisterScreen.goToSettingsScreen();
        SettingsScreen.goToRegisterScreen();
        RegisterScreen.registerWithValidData();
        RegisterScreen.goToSettingsScreen();
        String actualResult3 = SettingsScreen.getLogOutTxt().getText();
        Assert.assertEquals(actualResult3,expectedResult3);
        Thread.sleep(8000);

        DetailsScreen.goToDetails();
        DetailsScreen.addLocation();
        DetailsScreen.longPressFavLoc();
        HomeScreen.getHomeBtn().click();
        Thread.sleep(8000);

        String actualResult2 = HomeScreen.getNameOfCity().getText();
        Assert.assertEquals(actualResult2,expectedResult2);

        RegisterScreen.goToSettingsScreen();
        SettingsScreen.logOut();
        String actualResult4 = SettingsScreen.createAccTextBtn();
        Assert.assertEquals(actualResult4,expectedResult4);





    }
}
