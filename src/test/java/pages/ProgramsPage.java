package pages;

import framework.PageFactory;
import framework.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class ProgramsPage extends PageFactory {
    private final By listofPatient = By.xpath("//*[contains(@class,'patient-name')]");
    private final By homeButton = By.className("back-btn");
    private final By newProgramEnrollment = By.xpath("//*[contains(@class,'section-title')]");
    private final By formField  = By.xpath("//*[contains(@class,'ng-pristine')]");
    private final By dateField  = By.xpath("//*[contains(@type,'date')]");
//    private final By HIVprogram = By.cssSelector("")
//    Select programList = new Select(driver.findElement(By.cssSelector(".pristine.ng-valid.ng-touched")));
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate localDate = LocalDate.now();


    public void clickOnLastPatient(){
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(listofPatient));
        List<WebElement> list = driver.findElements(listofPatient);
        list.get(list.size()-1).click();
    }


    public void clickNewProgramEnrollment() {
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(newProgramEnrollment));
        driver.findElement(newProgramEnrollment).click();
    }


    public void fillNewEnrollmentForm() {
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(formField));
//        programList.selectByIndex(1);
        driver.findElements(formField).get(1).sendKeys("HIV Program");
        System.out.println(dtf.format(localDate));
        driver.findElement(dateField).sendKeys();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElements(formField).get(2).sendKeys(String.valueOf(new Random().nextInt(10)));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
