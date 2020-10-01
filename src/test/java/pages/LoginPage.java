package pages;

import framework.PageFactory;
import framework.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends PageFactory {
    private final By loginText = By.cssSelector(".left");
    private final By username = By.id("username");
    private final By password = By.id("password");
    private final By location = By.id("location");
    private final By loginButton = By.className("confirm");

    public String getLoginText() {
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(loginText));
        return driver.findElement(loginText).getText();
    }
    public void setUserName(String adminUserName) {
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(username));
        driver.findElement(username).sendKeys(adminUserName);
    }

    public void setPassword(String adminPassword) {
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(password));
        driver.findElement(password).sendKeys(adminPassword);
    }

    public void setLocation(String locationWard) {
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(location));
        driver.findElement(location).sendKeys(locationWard);
    }

    public void clickLoginButton() {
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(loginButton));
        driver.findElement(loginButton).submit();
    }

}