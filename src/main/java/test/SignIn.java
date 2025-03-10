package test;

import org.testng.annotations.Test;
import pages.SignInPage;

import static pages.HomePage.clickOnSignIn;

public class SignIn extends SignInPage {
//Puma Mens Dazzler Sneaker
    @Test
    private static void signInTest() throws InterruptedException {
        clickOnSignIn();
        login();
    }
}
