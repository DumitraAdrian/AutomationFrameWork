package Pages;

import Logger.LoggerUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    //    public WebDriver driver;
//
//    public HomePage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver,this);
//
//    }
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    private WebElement AlertsFrameWindows;

    @FindBy(xpath = "//h5[text()='Forms']")
    private WebElement forms;

    @FindBy(xpath = "//h5[text()='Elements']")
    private WebElement elements;


    public void clickAlertFrameWindow() {
        AlertsFrameWindows.click();
        LoggerUtility.info("The user clicks on alert  AlertsFrameWindows");
    }

    public void clickforms() {
        forms.click();
        LoggerUtility.info("The user clicks on forms button");
    }

    public void clickelements() {
        elements.click();
        LoggerUtility.info("The user clicks on elements button");
    }


}
