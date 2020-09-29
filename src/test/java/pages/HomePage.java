package pages;

import framework.PageFactory;
import framework.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends PageFactory {
    private final By Registration = By.id("bahmni.registration");
    private final By Programs = By.id("bahmni.programs");

    public String getRegistrationText(){
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(Registration));
        return driver.findElement(Registration).getText();
    }

    public void clickRegistration(){
        Wait.explicitWait(ExpectedConditions.elementToBeClickable(Registration));
        driver.findElement(Registration).click();
    }

    public void clickPrograms(){
        Wait.explicitWait(ExpectedConditions.elementToBeClickable(Programs));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(Programs));
    }
}
