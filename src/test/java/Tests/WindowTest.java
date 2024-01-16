package Tests;

import Pages.AleryFrameWindow.AlertFrameWindowPage;
import Pages.HomePage;
import Pages.AleryFrameWindow.WindowPage;
import ShareData.ShareData;
import org.testng.annotations.Test;

public class WindowTest extends ShareData {


    @Test
    public void testMethod() {



//        WebElement AlertsFrameWindows = getDriver().findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
//        AlertsFrameWindows.click();

        HomePage homePage=new HomePage(getDriver());
        homePage.clickAlertFrameWindow();

//        WebElement BrowserWindows = getDriver().findElement(By.xpath("//span[text()='Browser Windows']"));
//        BrowserWindows.click();

        AlertFrameWindowPage alertFrameWindowPage=new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.clickwindow();

        WindowPage windowPage=new WindowPage(getDriver());
        windowPage.interracttab();
        windowPage.interractwindow();

//        WebElement newTabButton=getDriver().findElement(By.id("tabButton"));
//        newTabButton.click();
//
//        System.out.println("url: " +getDriver().getCurrentUrl());
//
//        List<String> tabs=new ArrayList<>(getDriver().getWindowHandles());//lista de taburi
//        getDriver().switchTo().window(tabs.get(1));
//
//        System.out.println("url: " +getDriver().getCurrentUrl());
//
//        getDriver().close();
//
//        getDriver().switchTo().window(tabs.get(0));
//        WebElement newWindowButton= getDriver().findElement(By.id("windowButton"));
//        newWindowButton.click();
//
//        System.out.println("url: " +getDriver().getCurrentUrl());
//
//        List<String> windows=new ArrayList<>(getDriver().getWindowHandles());//lista de taburi
//        getDriver().switchTo().window(windows.get(1));
//
//        System.out.println("url: " +getDriver().getCurrentUrl());
//
//        getDriver().close();
//
//        getDriver().switchTo().window(windows.get(0));


    }
}
