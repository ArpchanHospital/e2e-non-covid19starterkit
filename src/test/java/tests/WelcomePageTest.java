package tests;

import framework.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WelcomePageTest extends BaseTestClass {

    @Test(priority = 1)
    public void clickOnClinicalService() {
        getWelcomePage().clickClinicalService();
        Assert.assertEquals(getLoginPage().getLoginText().toLowerCase(),"login");
    }
}
