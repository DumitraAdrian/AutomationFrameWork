package ShareData;

import Logger.LoggerUtility;
import PropertyUtility.PropertyUtility;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;

public class Hooks extends  ShareData {
    public HashMap<String, String> testData;
    public String testName;

    @BeforeMethod
    public void prepareEnviroment() {
        setup();
        testName = this.getClass().getSimpleName();
        PropertyUtility propertyUtility = new PropertyUtility(testName);
        testData = propertyUtility.getAlldata();
        LoggerUtility.startTestCase(testName);


    }

    @AfterMethod
    public void clesrEnviroment(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            LoggerUtility.error(result.getThrowable().getMessage());
        } else {
            clear();
            LoggerUtility.endTestCase(testName);

            // adaugam un listener pe statusul testului
        }

        }
    @AfterSuite
    public void finishArtifacts(){
        LoggerUtility.mergeLogsInToOne();
    }

}