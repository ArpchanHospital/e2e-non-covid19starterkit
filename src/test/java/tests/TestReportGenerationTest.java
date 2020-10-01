package tests;

import framework.BaseTestClass;
import framework.ConfigureProperties;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestReportGenerationTest extends BaseTestClass {

    @Test(priority = 9)
    public void generateTestObservationReport() {

        Date date = new Date();
        SimpleDateFormat DateFor = new SimpleDateFormat("yyyy-MM-dd");
        String stringDate= DateFor.format(date);
        getHomePage().clickReports();

        getReportsPage().fillReportForm(stringDate,stringDate,"HTML");

        Assert.assertEquals(getReportsPage().getTestObservationText().toUpperCase(), "TEST OBSERVATION REPORT");
    }
}
