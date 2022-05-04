package com.orangehrmlive.opensource_demo.testsuite;

import com.orangehrmlive.opensource_demo.pages.LogIn;
import com.orangehrmlive.opensource_demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends TestBase {

    LogIn login = new LogIn();
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        //  Enter “Admin” username
        login.enterUserName("Admin");
        //   Enter “admin123 password
        login.enterPassword("admin123");
        //Click on ‘LOGIN’ button
        login.clickOnLogin();
        //Verify the ‘Welcome’ text is display
        String actualWelcomeText = login.VerifyWelcomeText();
        String FinalText =  actualWelcomeText.substring(0,7);
        String expectedWelcomeText = "Welcome";
        Assert.assertEquals(FinalText,expectedWelcomeText);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        login.clickOnForgotPassword();
        String actualForgotPasswordText = login.verifyForgotPasswordText();
        String expectedForgotPasswordText = "Forgot Your Password?";
        Assert.assertEquals(actualForgotPasswordText,expectedForgotPasswordText);
    }
}
