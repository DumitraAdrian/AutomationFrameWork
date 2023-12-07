package Pages.AleryFrameWindow;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertFrameWindowPage extends BasePage {

//    public WebDriver driver;
//
//    public AlertFrameWindowPage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver,this);
//    }
public AlertFrameWindowPage(WebDriver driver) {
    super(driver);
}


    @FindBy (xpath = "//span[text()='Alerts']")
    private WebElement alerts;

    @FindBy(xpath = "//span[text()='Frames']")
    private WebElement frame;

    @FindBy(xpath = "//span[text()='Browser Windows']")
    private WebElement BrowserWindows;


    public void clickFrames(){
        frame.click();
    }

    public void clickAlerts(){
        alerts.click();

        }

    public void clickwindow() {
        BrowserWindows.click();
    }

}

