package pages;

import framework.PageFactory;
import framework.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class RegistrationPage extends PageFactory {
    private final By createNew = By.partialLinkText("Create");
    private final By StartOPDVisit = By.xpath("//*[contains(@class, 'buttonClass')]");
    private final By patientFirstName = By.id("givenName");
    private final By patientlastName = By.id("familyName");
    private final By patientAge = By.id("ageYears");
    private final By patientGender = By.id("gender");
    private final By patientVillage = By.id("cityVillage");
    private final By form = By.name("myForm");
    private final By registrationFee = By.xpath("//*[contains(@id, 'observation_')]");
    private final By saveButton = By.className("confirm");
    private final By successSaveMessage = By.className("message-text");
//    private final By homeButton = By.cssSelector("a.back-btn");
    private final By homeButton = By.xpath("//*[contains(@class, 'back-btn')]");
    private final By searchId = By.xpath("//*[contains(@id,'registrationNumber')]");
    private final By listOfPatients = By.xpath("//table/tbody/tr/td[1]");
    private final By enterVisitDetails = By.xpath("//*[contains(@class,'right confirm')]");
    private final By cancelVisit = By.xpath("//*[contains(@class,'cancel')]");


    public void clickCreateNew(){
        Wait.explicitWait(ExpectedConditions.elementToBeClickable(createNew));
        driver.findElement(createNew).click();
    }

    public String getCreateNewText(){
        Wait.explicitWait(ExpectedConditions.elementToBeClickable(createNew));
        return driver.findElement(createNew).getText();
    }

    public String getStartOPDvisitText(){
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(StartOPDVisit));
        return driver.findElement(StartOPDVisit).getText();
    }

    public void fillForm(String firstName, String lastName, String gender, String age, String village) {
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(form));
        driver.findElement(patientFirstName).sendKeys(firstName);
        driver.findElement(patientlastName).sendKeys(lastName);
        driver.findElement(patientGender).sendKeys(gender);
        driver.findElement(patientAge).sendKeys(age);
        driver.findElement(patientVillage).sendKeys(village);
    }

    public void clickStartOPDvisit(){
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(StartOPDVisit));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(StartOPDVisit));
    }

    public void fillRegistrationFee(String fee){
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(registrationFee));
        driver.findElements(registrationFee).get(2).sendKeys(fee);
    }

    public void clickSave(){
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(saveButton));
        driver.findElement(saveButton).click();
    }

    public String getSuccessSaveMessage(){
        return driver.findElement(successSaveMessage).getText();
    }

    public void clickHomeButton(){
        Wait.explicitWait(ExpectedConditions.elementToBeClickable(homeButton));
//        driver.findElement(homeButton).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(homeButton));
    }

    public void SearchPatientById(String id){
        Wait.explicitWait(ExpectedConditions.elementToBeClickable(searchId));
        driver.findElement(searchId).sendKeys(id);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(searchId).submit();
    }

    public void clickOnLastPatientId(){
        Wait.explicitWait(ExpectedConditions.elementToBeClickable(listOfPatients));
        List<WebElement> list=driver.findElements(listOfPatients);
        list.get(list.size()-1).click();
    }

    public void clickOnEnterVisitDetails(){
        Wait.explicitWait(ExpectedConditions.elementToBeClickable(enterVisitDetails));
        driver.findElement(enterVisitDetails).click();
    }
    public void clickOnCancelVisit(){
        Wait.explicitWait(ExpectedConditions.elementToBeClickable(cancelVisit));
        driver.findElement(cancelVisit).click();
    }
    public void clickOkOnAlertBox(){
        driver.switchTo().alert().accept();
    }

}
