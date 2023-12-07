package Pages;

import HelpMethods.AlertMethods;
import HelpMethods.ElementsMethods;
import HelpMethods.FrameMethods;
import HelpMethods.WindowMetdods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;
    public WindowMetdods windowMetdods;
    public AlertMethods alertMethods;
    public FrameMethods frameMethods;
    public ElementsMethods elementsMethods;

    public BasePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        windowMetdods=new WindowMetdods(driver);
        alertMethods=new AlertMethods(driver);
        frameMethods=new FrameMethods(driver);
        elementsMethods=new ElementsMethods(driver);

    }

}
