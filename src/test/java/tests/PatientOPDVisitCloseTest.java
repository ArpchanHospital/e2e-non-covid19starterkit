package tests;

import framework.BaseTestClass;
import org.testng.annotations.Test;

public class PatientOPDVisitCloseTest extends BaseTestClass {

    @Test(priority = 8)
    public void OpdVisitCloseTest() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getHomePage().clickRegistration();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getRegistrationPage().SearchPatientById("%");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getRegistrationPage().clickOnLastPatientId();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getRegistrationPage().clickOnEnterVisitDetails();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getRegistrationPage().clickOnCancelVisit();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getRegistrationPage().clickOkOnAlertBox();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getRegistrationPage().clickHomeButton();
    }
}
