package Logger;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class LoggerUtility {

    private static final String suitLogsPath="target/logs/suite/";
    private static final String regressionLogsPath="target/logs/";
    private static final Logger logger= LogManager.getLogger();

    // Metoda care loggeaza pornirea unui test
    //synchronized =keyword care se aplica in momentul in care vrem sa blocam apelarea metodei in 2

    public static synchronized void startTestCase(String testName){

        ThreadContext.put("ThreadName", testName);
        logger.info("====================== Execution started :" +testName+ "=============");
    }
    // metoda care logg-eaza oprirea unui test
    public static synchronized void endTestCase(String testName){

        logger.info("================= Execution finished :" +testName+ "=============");

    }
    //Metoda care logg-eaza o actiune din test

    public static synchronized  void  info(String message){
        logger.info(Thread.currentThread().getName() + ":" + getCallInfo() + "  " + message);
    }
    //Metoda care returneaza informatii despre actiunea curenta

    private static synchronized String getCallInfo(){
        String className=Thread.currentThread().getStackTrace()[3].getClassName();
        String methodName=Thread.currentThread().getStackTrace()[3].getMethodName();
        return className + " : "+ methodName + "==>";
    }
    // Metoda in caz de eroare
    public static synchronized  void  error(String message){
        logger.error(Thread.currentThread().getName() + ":" + getCallInfo() + "  " + message);
        logger.info("================= Test Failed ================");
    }

    // Metoda care pune tot continutul fisierelor intr-unul singur

    public static void mergeLogsInToOne(){
        File dir = new File(suitLogsPath);

        // Get list of all the files in form of String Array
        String[] fileNames = dir.list();

        try {
            // create object of PrintWriter for output file
            PrintWriter pw = new PrintWriter(regressionLogsPath+"output.log");

            // loop for reading the contents of all the files
            // in the directory GeeksForGeeks
            for (String fileName : fileNames) {

                System.out.println("Reading from " + fileName);

                // create instance of file from Name of
                // the file stored in string Array
                File f = new File(dir, fileName);

                // create object of BufferedReader
                BufferedReader br = new BufferedReader(new FileReader(f));
                pw.println("Contents of file " + fileName);

                // Read from current file
                String line = br.readLine();
                while (line != null) {

                    // write to the output file
                    pw.println(line);
                    line = br.readLine();
                }
                pw.flush();
            }
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
        }

    }

}
