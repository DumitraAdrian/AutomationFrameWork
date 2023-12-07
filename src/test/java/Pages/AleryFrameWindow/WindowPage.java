package Pages.AleryFrameWindow;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class WindowPage extends BasePage {
//    public WebDriver driver;
//
//    public WindowPage(WebDriver driver){
//        this.driver=driver;
//        PageFactory.initElements(driver,this);
//    }
public WindowPage(WebDriver driver) {
    super(driver);
}
    @FindBy(id = "tabButton")
    private WebElement newTabButton;

    @FindBy(id = "windowButton")
    private  WebElement newWindowButton;



    public void interracttab(){
        newTabButton.click();

        windowMetdods.swichtospecificwindow(1);
        windowMetdods.closecurrentwindow();
        windowMetdods.swichtospecificwindow(0);

//        System.out.println("url: " +driver.getCurrentUrl());
//        List<String> tabs=new ArrayList<>(driver.getWindowHandles());//lista de taburi
//        driver.switchTo().window(tabs.get(1));
//        System.out.println("url: " +driver.getCurrentUrl());
//        driver.close();
//        driver.switchTo().window(tabs.get(0));

    }
    public  void interractwindow(){
        newWindowButton.click();

        windowMetdods.swichtospecificwindow(1);
        windowMetdods.closecurrentwindow();
        windowMetdods.swichtospecificwindow(0);

//        System.out.println("url: " +driver.getCurrentUrl());
//        List<String> windows=new ArrayList<>(driver.getWindowHandles());//lista de taburi
//        driver.switchTo().window(windows.get(1));
//        System.out.println("url: " +driver.getCurrentUrl());
//        driver.close();
//        driver.switchTo().window(windows.get(0));
    }

}
