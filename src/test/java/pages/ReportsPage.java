package pages;

import framework.PageFactory;
import framework.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ReportsPage extends PageFactory {
    private final By startDate = By.xpath("//*[starts-with(@class,'form-field start-date')]");
    private final By endDate = By.xpath("//*[starts-with(@class,'form-field stop-date')]");
    private final By format = By.xpath("//*[starts-with(@class,'ng-pristine ng-untouched ng-valid')]");
    private final By runReport = By.xpath("//*[contains(@class,'run-report confirm')]");

    public void setStartDate(String date){
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(startDate));
        WebElement select = driver.findElements(startDate).get(3);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].type = arguments[1]", select, "text");
        js.executeScript("arguments[0].value = arguments[1]", select, "2020-10-01");
    }

    public void setEndDate(String date){
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(endDate));
        WebElement select = driver.findElements(endDate).get(1);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].type = arguments[1]", select, "text");
        js.executeScript("arguments[0].value = arguments[1]", select, "2020-10-01");
    }
    public void setFormat(String form){
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(format));
        driver.findElements(format).get(2).sendKeys(form);
    }

    public void clickRunReport(){
        Wait.explicitWait(ExpectedConditions.presenceOfElementLocated(runReport));
        driver.findElements(runReport).get(2).click();
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
    }
}
