package pages;

import framework.PageFactory;
import framework.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProgramDashboardPage extends PageFactory {

    private final By consultationButton = By.cssSelector(".btn--left.btn--success");
    private final By addNewObsButton = By.cssSelector("#template-control-panel-button.fr");
    private final By hivTestingButton = By.id("HIV_Testing_and_Counseling");
    private final By SaveButton = By.cssSelector(".confirm.save-consultation");
    private final By preTestCounselingSelector  = By.xpath("//*[contains(@class,'grid-row-element')]");
    private final By patientDashBoardButton = By.id("dashboard-link");
//    private final By getFormdata = By.cssSelector("li.clearfix > span:nth-child(1)");
    private final By getFormdata = By.xpath("//*[contains(@class,'clearfix')]");

    public void clickConsultationButton(){
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(consultationButton));
        driver.findElement(consultationButton).click();
    }

    public void clickAddNewObsForm(){
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(addNewObsButton));
//        driver.findElement(addNewObsButton).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(addNewObsButton));
    }

    public void addNewHivTestingAndConsultingForm(){
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(hivTestingButton));
//        driver.findElement(hivTestingButton).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(hivTestingButton));
    }

    public void fillHivTestingAndConsultingForm(){
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(preTestCounselingSelector));
//        driver.findElements(preTestCounselingSelector).get(0).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElements(preTestCounselingSelector).get(0));
    }

    public void saveForm(){
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(SaveButton));
        driver.findElement(SaveButton).click();
    }

    public void clickOnPatientDashboardButton(){
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(patientDashBoardButton));
//        driver.findElement(addNewObsButton).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(patientDashBoardButton));
    }

    public String getFormDataText(){
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(getFormdata));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver.findElements(getFormdata).get(8).getText();
    }
}
