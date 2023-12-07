package HelpMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class WindowMetdods {
    private WebDriver driver;

    public WindowMetdods(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void swichtospecificwindow(Integer size){
        List<String> tabs=new ArrayList<>(driver.getWindowHandles());//lista de taburi
        driver.switchTo().window(tabs.get(size));
        System.out.println("url: " +driver.getCurrentUrl());
    }
    public void closecurrentwindow(){
        driver.close();

    }
}
