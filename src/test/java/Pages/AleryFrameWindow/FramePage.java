package Pages.AleryFrameWindow;

import Logger.LoggerUtility;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramePage extends BasePage {

//    public WebDriver driver;
//
//    public FramePage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//
//    }
public FramePage(WebDriver driver) {
    super(driver);
}

    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    private WebElement AlertsFrameWindows;

    @FindBy(id = "sampleHeading")
    private WebElement frametext;


    public void interractfirstframe() {
        frameMethods.switchtoFrame("frame1");
        LoggerUtility.info("The user switched on specific frame");
//        driver.switchTo().frame("frame1");

//        WebElement frameText = driver.findElement(By.id("sampleHeading"));
        System.out.println(frametext.getText());
        LoggerUtility.info("The user prints the frameText value");
//        driver.switchTo().defaultContent();

        frameMethods.switchmainFrame();
        LoggerUtility.info("The switches back on primary frame");


    }

    public void interractsecondframe() {
//        driver.switchTo().frame("frame2");
        frameMethods.switchtoFrame("frame2");
        LoggerUtility.info("The user switched on the second frame");

        System.out.println(frametext.getText());
        LoggerUtility.info("The user prints the frame Text value");

    }

}
