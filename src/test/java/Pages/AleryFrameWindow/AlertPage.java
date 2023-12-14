package Pages.AleryFrameWindow;

import ObjectData.AlertObject;
import Pages.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertPage extends BasePage {

//    public WebDriver driver;
//
//    public AlertPage(WebDriver driver){
//        this.driver=driver;
//        PageFactory.initElements(driver,this);
//    }
public AlertPage(WebDriver driver) {
    super(driver);
}
    @FindBy(id="alertButton")
    private WebElement alertButtonOK;

    @FindBy(id="timerAlertButton")
    private WebElement alertDelayButton;

    @FindBy(id="confirmButton")
    private WebElement alertOkCancelButton;

    @FindBy(id="promtButton")
    private WebElement promptAlertValueButton;



    public void interractAlertOK(){
        elementsMethods.clickElement(alertButtonOK);
        alertMethods.AcceptAlert();
//        Alert alertOK=driver.switchTo().alert();
//        alertOK.accept();
    }

    public void interractAlertDelay(){
        elementsMethods.clickElement(alertDelayButton);
        alertMethods.AcceptAlert();

//        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.alertIsPresent());
//        Alert alertDelay=driver.switchTo().alert();
//        alertDelay.accept();
    }
    public void interractAlertDismiss(){

        elementsMethods.clickElement(alertDelayButton);
        alertMethods.CancelAlert();
//        Alert alertOKcancel=driver.switchTo().alert();
//        alertOKcancel.dismiss();
    }
    public void interractPromptAlertValue(AlertObject alertObject){
        elementsMethods.clickElement(promptAlertValueButton);
        alertMethods.fillAlert(alertObject.getPromptAlertValue());
//        Alert alertValue=driver.switchTo().alert();
//        alertValue.sendKeys(value);
//        alertValue.accept();
    }

}
