package testcases;

import base.TestBase;
import com.github.javafaker.Faker;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import screens.RegisterScreenIOS;

import java.io.IOException;

public class RegisterScreenTestIOS extends TestBase {

    RegisterScreenIOS registerScreenIOS;
    Faker faker;

    @BeforeTest
    public void init() throws IOException, InterruptedException {
        setUp();
        registerScreenIOS = new RegisterScreenIOS(driver);
        faker = new Faker();
    }

    @Test
    public static void signUp(){
        RegisterScreenIOS.signUpWithValidData();
    }

}
