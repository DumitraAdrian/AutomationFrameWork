package Pages.Forms;

import Pages.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PracticeFormsPage extends BasePage {

//    public WebDriver driver;
//
//    public PracticeFormsPage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver,this);
//
//    }
public PracticeFormsPage(WebDriver driver) {
    super(driver);
}

    @FindBy(id = "firstName")
    private WebElement firstName;

    @FindBy(id = "lastName")
    private WebElement lastName;

    @FindBy(id = "userEmail")
    private WebElement email;

    @FindBy(xpath = "//label [@for='gender-radio-1']")
    private WebElement gender;

    @FindBy(id = "userNumber")
    private  WebElement mobile;

    @FindBy(id = "subjectsInput")
    private WebElement subjects;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-1']")
    private WebElement Sports;

    @FindBy(id = "currentAddress")
    private  WebElement address;

    @FindBy(id = "state")
    private WebElement state;

    @FindBy(id = "react-select-3-input")
    private WebElement selectstate;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "react-select-4-input")
    private WebElement selectCity;

    @FindBy(id = "submit")
    private WebElement submit;

    @FindBy(id = "example-modal-sizes-title-lg")
    private WebElement thanksMessage;

    @FindBy(css = ".table-dark>tbody>tr")
    private List<WebElement> validationTable;

    @FindBy(id = "closeLargeModal")
    private WebElement close;



    public void fillPracticeForm(String firstname,String lastname,String email,String mobile,
                                 String subjects,String address,String state,String city){
        fillFirstName(firstname);
        fillLastName(lastname);
        fillemail(email);
        fillgender();
        fillmobile(mobile);
        fillsubjects(subjects);
        fillsports();
        filladress(address);
        fillState(state);
        fillCity(city);
    }

    public List<String> getValuesForm(){
        List<String> formValues=new ArrayList<>();
        formValues.add(gender.getText());
        formValues.add(Sports.getText());
        return formValues;
    }

    public void fillFirstName(String firstNamevalue){
        elementsMethods.fillElement(firstName,firstNamevalue);
//        firstName.sendKeys(firstNamevalue);
    }

    public void fillLastName(String lastNameValue){
        lastName.sendKeys(lastNameValue);
    }

    public void fillemail(String emailValue){
        email.sendKeys(emailValue);
    }

    public void fillgender(){
        elementsMethods.clickElement(gender);
//        gender.click();
    }

    public void fillmobile(String mobileValue){
        mobile.sendKeys(mobileValue);
    }

    public void fillsubjects(String subjectsValue){
        elementsMethods.fillElement(subjects,subjectsValue,Keys.ENTER);
//        subjects.sendKeys(subjectsValue);
//        subjects.sendKeys(Keys.ENTER);
    }

    public void fillsports(){
        Sports.click();
    }

    public void filladress(String addressValue){
        address.sendKeys(addressValue);
    }

    public void fillState(String stateValue){
        elementsMethods.scrollBypixels(0,450);
        elementsMethods.clickElement(state);
        elementsMethods.fillElement(selectstate,stateValue,Keys.ENTER);

//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("window.scrollBy(0,450)");
//        state.click();
//        selectstate.sendKeys(stateValue);
//        selectstate.sendKeys(Keys.ENTER);
    }

    public void fillCity(String cityValue){
        city.click();
        selectCity.sendKeys(cityValue);
        selectCity.sendKeys(Keys.ENTER);
    }

    public void fillSubmit(){
        elementsMethods.clicjJSElement(submit);
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("arguments[0].click();", submit);
    }

    public void clickClose(){
        close.sendKeys(Keys.ENTER);
    }

    public void validatePracticeForm(String expectedMessage,String firstNamevalue,String lastNameValue,
                                     String emailValue,String genderValue,String mobileValue,String subjectsValue,
                                     String SportsValue,String addressValue,String stateValue,String cityValue){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern( "dd MMMM,yyyy", Locale.ENGLISH );
        LocalDateTime now = LocalDateTime.now();
//        System.out.println(dtf.format(now));
        String dateofbirthValue=dtf.format(now);

        elementsMethods.ValidateElementMessage(thanksMessage,expectedMessage);

//        String actualMessege=thanksMessage.getText();
//        Assert.assertEquals(actualMessege,expectedMessage);

        Assert.assertTrue(validationTable.get(0).getText().contains("Student Name"));
        Assert.assertTrue(validationTable.get(0).getText().contains(firstNamevalue + " " +lastNameValue));

        Assert.assertTrue(validationTable.get(1).getText().contains("Student Email"));
        Assert.assertTrue(validationTable.get(1).getText().contains(emailValue));

        Assert.assertTrue(validationTable.get(2).getText().contains("Gender"));
        Assert.assertTrue(validationTable.get(2).getText().contains(genderValue));

        Assert.assertTrue(validationTable.get(3).getText().contains("Mobile"));
        Assert.assertTrue(validationTable.get(3).getText().contains(mobileValue));

        Assert.assertTrue(validationTable.get(4).getText().contains("Date of Birth"));
        Assert.assertTrue(validationTable.get(4).getText().contains(dateofbirthValue));

        Assert.assertTrue(validationTable.get(5).getText().contains("Subjects"));
        Assert.assertTrue(validationTable.get(5).getText().contains(subjectsValue));

        Assert.assertTrue(validationTable.get(6).getText().contains("Hobbies"));
        Assert.assertTrue(validationTable.get(6).getText().contains(SportsValue));

        Assert.assertTrue(validationTable.get(8).getText().contains("Address"));
        Assert.assertTrue(validationTable.get(8).getText().contains(addressValue));

        Assert.assertTrue(validationTable.get(9).getText().contains("State and City"));
        Assert.assertTrue(validationTable.get(9).getText().contains(stateValue + " " +cityValue));
    }
}
