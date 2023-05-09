package testcases;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import screens.WelcomeScreen;

import java.io.IOException;

public class WelcomeScreenTest extends TestBase {


    WelcomeScreen welcomeScreen;

       @BeforeTest
        public void init() throws IOException {
           setUp();
       welcomeScreen = new WelcomeScreen(driver);
    }


}