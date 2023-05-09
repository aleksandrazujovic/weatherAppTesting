package testcases;

import base.TestBase;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import screens.HomeScreen;
import screens.RegisterScreen;
import screens.SettingsScreen;
import screens.WelcomeScreen;

import java.io.IOException;

public class HomeScreenTest extends TestBase {

    WelcomeScreen welcomeScreen;
    HomeScreen homeScreen;

    @BeforeTest
    public void init() throws IOException {
        setUp();
        welcomeScreen = new WelcomeScreen(driver);
        homeScreen = new HomeScreen(driver);

        WelcomeScreen.clickGetStartedBtn();
        WelcomeScreen.clickWhileUsingAppBtn();
        HomeScreen.goToHome();
    }

    @Test
    public static void isScrollable(){

        boolean expectedResult = true;

        HomeScreen.verticalScroll(driver);

        boolean actualResult = HomeScreen.getDetails().isDisplayed();

        Assert.assertEquals(expectedResult,actualResult);
    }


}
