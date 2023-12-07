package Pages.Elements;

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


    public void addnewentry(String firstnamevalue,String lastnamevalue, String emailvalue,String agevalue,
                            String salaryvalue,String departamentvalue) {

        Integer actualtablesize=actualentries.size();
//        addButton.click();
        elementsMethods.clickElement(addButtton);
        firstname.sendKeys(firstnamevalue);
        lastname.sendKeys(lastnamevalue);
        email.sendKeys(emailvalue);
        age.sendKeys(agevalue);
        salary.sendKeys(salaryvalue);
        departament.sendKeys(departamentvalue);
        submit.click();

        validatenewentry(actualtablesize,firstnamevalue,lastnamevalue,emailvalue,agevalue,salaryvalue,departamentvalue);
    }

    private void validatenewentry(Integer actualtablesize,String firstnamevalue,String lastnamevalue, String emailvalue,String agevalue,
                                  String salaryvalue,String departamentvalue){
        Integer expectedtablesize=actualentries.size();

        Assert.assertTrue(actualtablesize+1==expectedtablesize);
        String lastentrytable=actualentries.get(actualtablesize).getText();
        Assert.assertTrue(lastentrytable.contains(firstnamevalue));
        Assert.assertTrue(lastentrytable.contains(lastnamevalue));
        Assert.assertTrue(lastentrytable.contains(emailvalue));
        Assert.assertTrue(lastentrytable.contains(agevalue));
        Assert.assertTrue(lastentrytable.contains(salaryvalue));
        Assert.assertTrue(lastentrytable.contains(departamentvalue));

    }

}
