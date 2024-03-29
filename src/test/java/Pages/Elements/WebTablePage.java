package Pages.Elements;

import Logger.LoggerUtility;
import ObjectData.WebTableDataObject;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class WebTablePage extends BasePage {
//    public WebDriver driver;
//
//    public WebTablePage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//
//    }
public WebTablePage(WebDriver driver) {
    super(driver);
}


    @FindBy(xpath = "//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']")
    private List<WebElement> actualentries;

    @FindBy(id = "addNewRecordButton")
    private WebElement addButtton;

    @FindBy(id = "firstName")
    private WebElement firstname;

    @FindBy(id = "lastName")
    private WebElement lastname;

    @FindBy(id = "userEmail")
    private WebElement email;

    @FindBy(id = "age")
    private WebElement age;

    @FindBy(id = "salary")
    private WebElement salary;

    @FindBy(id = "department")
    private WebElement departament;

    @FindBy(id = "submit")
    private WebElement submit;


    public void addnewentry(WebTableDataObject webTableDataObject) {

        Integer actualtablesize=actualentries.size();
//        addButton.click();
        elementsMethods.clickElement(addButtton);
        LoggerUtility.info("The user click add Button");
        elementsMethods.fillElement(firstname,webTableDataObject.getFirstnamevalue());
        LoggerUtility.info("The user fill first name");
        elementsMethods.fillElement(lastname,webTableDataObject.getLastnamevalue());
        LoggerUtility.info("The user fill last name");
        elementsMethods.fillElement(email,webTableDataObject.getEmailvalue());
        LoggerUtility.info("The user fill email");
        elementsMethods.fillElement(age,webTableDataObject.getAgevalue());
        LoggerUtility.info("The user fill age");
        elementsMethods.fillElement(salary,webTableDataObject.getSalaryvalue());
        LoggerUtility.info("The user fill salary");
        elementsMethods.fillElement(departament,webTableDataObject.getDepartamentvalue());
        LoggerUtility.info("The user fill departament");
        elementsMethods.clickElement(submit);
        LoggerUtility.info("The user click on submit");
//        firstname.sendKeys(firstnamevalue);
//        lastname.sendKeys(lastnamevalue);
//        email.sendKeys(emailvalue);
//        age.sendKeys(agevalue);
//        salary.sendKeys(salaryvalue);
//        departament.sendKeys(departamentvalue);
//        submit.click();

        validatenewentry(actualtablesize,webTableDataObject);
    }

    private void validatenewentry(Integer actualtablesize,WebTableDataObject webTableDataObject){
        Integer expectedtablesize=actualentries.size();

        Assert.assertTrue(actualtablesize+1==expectedtablesize);
        String lastentrytable=actualentries.get(actualtablesize).getText();
        Assert.assertTrue(lastentrytable.contains(webTableDataObject.getFirstnamevalue()));
        Assert.assertTrue(lastentrytable.contains(webTableDataObject.getLastnamevalue()));
        Assert.assertTrue(lastentrytable.contains(webTableDataObject.getEmailvalue()));
        Assert.assertTrue(lastentrytable.contains(webTableDataObject.getAgevalue()));
        Assert.assertTrue(lastentrytable.contains(webTableDataObject.getSalaryvalue()));
        Assert.assertTrue(lastentrytable.contains(webTableDataObject.getDepartamentvalue()));

    }

}
