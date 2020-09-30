package tests;

import framework.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import static framework.ConfigureProperties.*;

public class RegistrationPageTest extends BaseTestClass {

    @Test(priority = 4)
    public void createNewRegistration() {
        getRegistrationPage().clickCreateNew();
        Assert.assertEquals(getRegistrationPage().getStartOPDvisitText(), "Start OPD visit");
        getRegistrationPage().fillForm(patientFirstName,patientLastName,patientGender,patientAgeInYears,patientVillage);
        getRegistrationPage().clickStartOPDvisit();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getRegistrationPage().fillRegistrationFee(registrationFee);
        getRegistrationPage().clickSave();
//        System.out.println(getRegistrationPage().getSuccessSaveMessage());
//        Assert.assertEquals();
        getRegistrationPage().clickHomeButton();
    }

    @Test(priority = 5)
    public void enrollOnHIVprogram() {
        getHomePage().clickPrograms();
        getProgramsPage().clickOnLastPatient();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getProgramsPage().clickNewProgramEnrollment();
        getProgramsPage().fillNewEnrollmentForm();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getProgramsPage().clickOnEnroll();
    }
}
