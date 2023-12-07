package HelpMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertMethods {
    private WebDriver driver;

    public AlertMethods(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    private void WaitForAlert(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
    }
    public void AcceptAlert(){
        WaitForAlert();
        Alert alertOK=driver.switchTo().alert();
        alertOK.accept();
    }
    public void CancelAlert(){
        WaitForAlert();
        Alert alertOKcancel=driver.switchTo().alert();
        alertOKcancel.dismiss();
    }
    public void fillAlert(String value){
        WaitForAlert();
        Alert alertValue=driver.switchTo().alert();
        alertValue.sendKeys(value);
        alertValue.accept();

    }
}
