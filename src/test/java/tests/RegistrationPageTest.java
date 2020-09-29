package tests;

import framework.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationPageTest extends BaseTestClass {

    @Test(priority = 4)
    public void createNewRegistration() {
        getRegistrationPage().clickCreateNew();
        Assert.assertEquals(getRegistrationPage().getStartOPDvisitText(), "Start OPD visit");
    }
}
