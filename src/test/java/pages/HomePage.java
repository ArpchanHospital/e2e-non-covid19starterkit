package pages;

import framework.PageFactory;
import framework.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends PageFactory {
    private final By Registration = By.id("bahmni.registration");

    public String getRegistrationText(){
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(Registration));
        return driver.findElement(Registration).getText();
    }

    public void clickRegistration(){
        Wait.explicitWait(ExpectedConditions.elementToBeClickable(Registration));
        driver.findElement(Registration).click();
    }
}
