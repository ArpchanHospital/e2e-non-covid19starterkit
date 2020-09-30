package tests;

import framework.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProgramDashboardTest extends BaseTestClass {

    @Test(priority = 6)
    public void fillConsultationform() {
        getProgramDashboardPage().clickConsultationButton();

        getProgramDashboardPage().clickAddNewObsForm();

        getProgramDashboardPage().addNewHivTestingAndConsultingForm();

        getProgramDashboardPage().fillHivTestingAndConsultingForm();

        getProgramDashboardPage().saveForm();

        getProgramDashboardPage().clickOnPatientDashboardButton();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getProgramDashboardPage().getFormDataText().toUpperCase());
//        Assert.assertEquals(getProgramDashboardPage().getFormDataText().toUpperCase(),"HIV TESTING AND COUNSELING");
    }
}
