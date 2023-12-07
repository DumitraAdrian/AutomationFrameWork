package Tests;

import Pages.AleryFrameWindow.AlertFrameWindowPage;
import Pages.AleryFrameWindow.FramePage;
import Pages.HomePage;
import ShareData.ShareData;
import org.testng.annotations.Test;

public class FrameTest extends ShareData {


    @Test
    public void metoda_test() {



//        WebElement AlertsFrameWindows = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
//        AlertsFrameWindows.click();

        HomePage homePage=new HomePage(getDriver());
        homePage.clickAlertFrameWindow();

//        WebElement frames = driver.findElement(By.xpath("//span[text()='Frames']"));
//        frames.click();

        AlertFrameWindowPage alertFrameWindowPage=new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.clickFrames();

        FramePage framesPage=new FramePage(getDriver());
        framesPage.interractfirstframe();
        framesPage.interractsecondframe();


//        driver.switchTo().frame("frame1");
//
//        WebElement frameText=driver.findElement(By.id("sampleHeading"));
//        System.out.println(frameText.getText());
//
//        driver.switchTo().defaultContent();//intoarce focusul pe pagina mare

//        driver.switchTo().frame("frame2");
//
//        WebElement frame2Text=driver.findElement(By.id("sampleHeading"));
//        System.out.println(frame2Text.getText());
    }
}