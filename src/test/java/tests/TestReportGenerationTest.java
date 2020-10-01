package tests;

import framework.BaseTestClass;
import framework.ConfigureProperties;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestReportGenerationTest extends BaseTestClass {

    @Test
    public void generateTestObservationReport() {
        getLoginPage().setUserName(ConfigureProperties.adminUsername);
        getLoginPage().setPassword(ConfigureProperties.adminPassword);
        getLoginPage().setLocation("General Ward");
        getLoginPage().clickLoginButton();

        Date date = new Date();
        SimpleDateFormat DateFor = new SimpleDateFormat("yyyy-MM-dd");
        String stringDate= DateFor.format(date);
        getHomePage().clickReports();
        getReportsPage().setStartDate(stringDate);
        getReportsPage().setEndDate(stringDate);
        getReportsPage().setFormat("HTML");
        getReportsPage().clickRunReport();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
