package pages;

import framework.PageFactory;
import framework.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class ProgramsPage extends PageFactory {
    private final By listofPatient = By.xpath("//*[contains(@class,'patient-name')]");
    private final By homeButton = By.className("back-btn");
    private final By newProgramEnrollment = By.xpath("//*[contains(@class,'section-title')]");
    private final By formField  = By.xpath("//*[contains(@class,'field-value')]");
//    private final By HIVprogram = By.cssSelector("")
    Select programList = new Select(driver.findElement(By.cssSelector(".pristine.ng-valid.ng-touched")));

    public void clickOnLastPatient(){
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(listofPatient));
        List<WebElement> list = driver.findElements(listofPatient);
        list.get(list.size()-1).click();
    }

    @Test
    public void clickNewProgramEnrollment() {
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(newProgramEnrollment));
        driver.findElement(newProgramEnrollment).click();
    }

    @Test
    public void fillNewEnrollmentForm() {
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(formField));
        programList.selectByIndex(1);
//        driver.findElements(formField).get(0).sendKeys("HIV Program");
        driver.findElements(formField).get(2).sendKeys("29/09/2020");
        driver.findElements(formField).get(3).sendKeys(String.valueOf(new Random(10).nextInt()));
    }
}
