package Tests;


import Pages.Forms.FormsPage;
import Pages.HomePage;
import Pages.Forms.PracticeFormsPage;
import ShareData.ShareData;
import org.testng.annotations.Test;

import java.util.List;

public class FormTableTest extends ShareData {

    @Test
    public void metoda_test() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickforms();

        FormsPage formsPage = new FormsPage(getDriver());
        formsPage.clickPracticeForm();

        String firstNamevalue = "Dumitra";
        String lastNameValue = "Adrian";
        String emailValue = "adrian@gmail.com";
        String mobileValue = "0712345678";
        String subjectsValue = "English";
        String addressValue = "Timisoara";
        String stateValue = "NCR";
        String cityValue = "Delhi";
        String expectedMessage = "Thanks for submitting the form";
        PracticeFormsPage practiceFormsPage = new PracticeFormsPage(getDriver());
        practiceFormsPage.fillPracticeForm(firstNamevalue, lastNameValue, emailValue, mobileValue, subjectsValue,
                addressValue, stateValue, cityValue);

        List<String> Formvalues = practiceFormsPage.getValuesForm();
        practiceFormsPage.fillSubmit();

        practiceFormsPage.validatePracticeForm(expectedMessage, firstNamevalue, lastNameValue, emailValue,
                Formvalues.get(0), mobileValue, subjectsValue, Formvalues.get(1), addressValue, stateValue, cityValue);
//     WebElement uploadPicture=driver.findElement(By.id("uploadPicture"));
//        File file=new File("caiet.docx");
//        uploadPicture.sendKeys(file.getAbsolutePath());

        practiceFormsPage.clickClose();
    }
}
