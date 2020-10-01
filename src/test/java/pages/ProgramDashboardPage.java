package pages;

import framework.PageFactory;
import framework.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ProgramDashboardPage extends PageFactory {

    private final By consultationButton = By.cssSelector(".btn--left.btn--success");
    private final By addNewObsButton = By.cssSelector("#template-control-panel-button.fr");
    private final By hivTestingButton = By.id("HIV_Testing_and_Counseling");
    private final By SaveButton = By.cssSelector(".confirm.save-consultation");
    private final By preTestCounselingSelector = By.xpath("//*[contains(@class,'grid-row-element')]");
    private final By patientDashBoardButton = By.id("dashboard-link");
    //    private final By getFormdata = By.cssSelector("li.clearfix > span:nth-child(1)");
    private final By getFormdata = By.xpath("//*[contains(@class,'clearfix')]");
    private final By editIcon = By.xpath("//*[contains(@class,'has-link fl formDataEdit')]");
    private final By hivTestedBeforeSelector = By.xpath("//*[contains(@class,'grid-row-element')]");
    private final By SaveButtonEditForm = By.cssSelector(".confirm.fr");
    private final By patientListPage = By.id("patients-link");

    public void clickConsultationButton() {
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(consultationButton));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(consultationButton));
    }

    public void clickAddNewObsForm() {
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(addNewObsButton));
//        driver.findElement(addNewObsButton).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(addNewObsButton));
    }

    public void addNewHivTestingAndConsultingForm() {
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(hivTestingButton));
//        driver.findElement(hivTestingButton).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(hivTestingButton));
    }

    public void fillHivTestingAndConsultingForm() {
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(preTestCounselingSelector));
//        driver.findElements(preTestCounselingSelector).get(0).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElements(preTestCounselingSelector).get(0));
    }

    public void saveForm() {
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(SaveButton));
        driver.findElement(SaveButton).click();
    }

    public void clickOnPatientDashboardButton() {
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(patientDashBoardButton));
//        driver.findElement(addNewObsButton).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(patientDashBoardButton));
    }

    public String getFormDataText() {
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(getFormdata));
        return driver.findElements(getFormdata).get(5).getText();
    }

    public void clickEditIcon() {
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(editIcon));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElements(editIcon).get(1));
    }

    public void editHivTestingAndConsultingForm() {
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(hivTestedBeforeSelector));
//        driver.findElements(preTestCounselingSelector).get(0).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElements(hivTestedBeforeSelector).get(2));
    }

    public void clickSaveButtonInEditForm() {
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(SaveButtonEditForm));
        driver.findElement(SaveButtonEditForm).click();
    }

    public void goToPatientListPage() {
        Wait.explicitWait(ExpectedConditions.elementToBeClickable(patientListPage));
        driver.findElement(patientListPage).click();
    }

}
