package tests;

import framework.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProgramDashboardTest extends BaseTestClass {

    @Test(priority = 6)
    public void fillConsultationForm() {
        getProgramDashboardPage().clickConsultationButton();

        getProgramDashboardPage().clickAddNewObsForm();

        getProgramDashboardPage().addNewHivTestingAndConsultingForm();

        getProgramDashboardPage().fillHivTestingAndConsultingForm();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getProgramDashboardPage().saveForm();

        getProgramDashboardPage().clickOnPatientDashboardButton();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 7)
    public void editConsultationFormFromDashBoard() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().refresh();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getProgramDashboardPage().clickEditIcon();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        getProgramDashboardPage().editHivTestingAndConsultingForm();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getProgramDashboardPage().clickSaveButtonInEditForm();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        getProgramDashboardPage().goToPatientListPage();

        getProgramsPage().goToHomePage();
        getProgramsPage().goToHomePage();
    }
}
