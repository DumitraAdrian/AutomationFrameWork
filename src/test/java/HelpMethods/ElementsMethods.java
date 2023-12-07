package HelpMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ElementsMethods {
    private WebDriver driver;

    public ElementsMethods(WebDriver driver){
        this.driver=driver;
    }
    public void WaitVisibleElement(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));

    }
    public void clickElement(WebElement element){
        WaitVisibleElement(element);
        element.click();

    }
    public void fillElement(WebElement element,String value){
        WaitVisibleElement(element);
        element.sendKeys(value);

    }
    public void fillElement(WebElement element, String value, Keys keyboardPress){
        WaitVisibleElement(element);
        element.sendKeys(value);
        element.sendKeys(keyboardPress);

    }
    public void fillElement(WebElement element, String value, String keyboardPress){
        WaitVisibleElement(element);
        element.sendKeys(value);
        element.sendKeys(keyboardPress);

    }
    public void scrollBypixels(Integer x,Integer y){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy("+x+","+y+")");
    }
    public void clicjJSElement(WebElement element){
        WaitVisibleElement(element);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", element);

    }
    public void ValidateElementMessage(WebElement element,String value){
        WaitVisibleElement(element);
        String actualMessege=element.getText();
        Assert.assertEquals(actualMessege,value);
    }
}
