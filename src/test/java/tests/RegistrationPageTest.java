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
        getProgramsPage().clickNewProgramEnrollment();
        getProgramsPage().fillNewEnrollmentForm();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getProgramsPage().clickOnEnroll();
        getProgramsPage().clickOnProgramDashboardButton();
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
