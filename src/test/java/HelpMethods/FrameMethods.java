package HelpMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FrameMethods {
    private WebDriver driver;

    public FrameMethods(WebDriver driver){
        this.driver=driver;

    }
    public void switchtoFrame(String value){
        driver.switchTo().frame(value);
    }
    public void switchmainFrame(){
        driver.switchTo().defaultContent();
    }
}
