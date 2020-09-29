package pages;

import framework.PageFactory;
import framework.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistrationPage extends PageFactory {
    private final By createNew = By.partialLinkText("Create");
    private final By StartOPDVisit = By.className("primaryOption");

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

}
