package Pages.AleryFrameWindow;

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
//        driver.switchTo().frame("frame1");
        WebElement frameText = driver.findElement(By.id("sampleHeading"));
        System.out.println(frameText.getText());
//        driver.switchTo().defaultContent();
        frameMethods.switchmainFrame();


    }

    public void interractsecondframe() {
//        driver.switchTo().frame("frame2");
        frameMethods.switchtoFrame("frame2");
        System.out.println(frametext.getText());

    }

}
