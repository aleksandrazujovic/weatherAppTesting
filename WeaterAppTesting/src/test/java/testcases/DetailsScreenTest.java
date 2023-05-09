package testcases;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import screens.DetailsScreen;
import screens.HomeScreen;
import screens.WelcomeScreen;

import java.io.IOException;

public class DetailsScreenTest extends TestBase {

WelcomeScreen welcomeScreen;

    @BeforeTest
    public void init() throws IOException {
        setUp();
        welcomeScreen = new WelcomeScreen(driver);

        WelcomeScreen.clickGetStartedBtn();
        WelcomeScreen.clickWhileUsingAppBtn();
    }

    @Test
    public static void isLocationAdded(){

        String expectedResult = "Novi Sad";

        DetailsScreen.goToDetails();
        DetailsScreen.addLocation();

        String actualResult = DetailsScreen.getFavLoc().getText();

        Assert.assertEquals(actualResult,expectedResult);

    }






}
