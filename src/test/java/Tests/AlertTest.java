package Tests;

import ObjectData.AlertObject;
import Pages.AleryFrameWindow.AlertFrameWindowPage;
import Pages.AleryFrameWindow.AlertPage;
import Pages.HomePage;
import ShareData.ShareData;
import ShareData.Hooks;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class AlertTest extends Hooks {


    @Test
    public void metoda_test() {

        AlertObject alertObject=new AlertObject(testData);

        HomePage homePage=new HomePage(getDriver());
        homePage.clickAlertWindow();

        JavascriptExecutor JS=(JavascriptExecutor)getDriver();
        JS.executeScript("window.scroll(0,450)", "");

        AlertFrameWindowPage alertFrameWindowPage=new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.clickAlerts();

        AlertPage alertPage=new AlertPage(getDriver());
        alertPage.interractAlertOK();
        alertPage.interractAlertDelay();
        alertPage.interractAlertDismiss();
        alertPage.interractPromptAlertValue(alertObject);







//        WebElement AlertsFrameWindows = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
//        AlertsFrameWindows.click();

//        WebElement alerts = driver.findElement(By.xpath("//span[text()='Alerts']"));
//        alerts.click();

//        WebElement alertButton= driver.findElement(By.id("alertButton"));
//        alertButton.click();
//
//        Alert alertOK=driver.switchTo().alert();
//        alertOK.accept();

//        WebElement alertDelayButton= driver.findElement(By.id("timerAlertButton"));
//        alertDelayButton.click();
//
//        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.alertIsPresent());
//
//        Alert alertDelay=driver.switchTo().alert();
//        alertDelay.accept();

//        WebElement alertOkCancelButton=driver.findElement(By.id("confirmButton"));
//        alertOkCancelButton.click();
//
//        Alert alertOKcancel=driver.switchTo().alert();
//        alertOKcancel.dismiss();

//        WebElement alertValueButton=driver.findElement(By.id("promtButton"));
//        alertValueButton.click();
//
//        Alert alertValue=driver.switchTo().alert();
//        alertValue.sendKeys("Dumitra");
//        alertValue.accept();

    }
}
