package tests;

import framework.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;

import static framework.ConfigureProperties.*;

public class LoginPageTest extends BaseTestClass {

    @Test(priority = 2)
    public void login() {
        getLoginPage().setUserName(adminUsername);
        getLoginPage().setPassword(adminPassword);
        getLoginPage().setLocation("General Ward");
        getLoginPage().clickLoginButton();

        Assert.assertEquals(getHomePage().getRegistrationText(), "Registration");
    }

    @Test(priority = 3)
    public void clickRegistration(){
        getHomePage().clickRegistration();
        Assert.assertTrue(getRegistrationPage().getCreateNewText().contains("Create"));
    }
}
