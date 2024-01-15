package ShareData.Browser;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class BrowserFactory {
    // Facem o metoda care sa citesaca valorile unor variabile de sistem din pom.xml
    // pe baza acestor valori vom lua o decizie in functie de enviromentul pe care se ruleaza testele

    public WebDriver getBrowserDriver(){
        Boolean cicd=Boolean.parseBoolean(System.getProperty("cicd"));
        String browser=null;

        // Trebuie sa decidem care este tipud de browser in momentul in care rulam pe local si remote
        // Daca este pe remote trebuie sa citeasca valoarea din pom.xml
        // Daca este pe LOCAL trebuie sa citeasca valoarea din BrowserData.properties
        if(cicd){
             browser = System.getProperty("browser");
        }
        else {
            HashMap<String,String> testData = new BaseBrowserService().getBrowserOptions();
            browser=testData.get("browser");
        }

        // Facem un switch case care sa decida ca browser sa se initializeze
        // Aplicam design patten de tip Creational cu numele Factory Method

        switch (browser){
            case "chrome":
                ChromeBrowserService chromeBrowserService=new ChromeBrowserService();
                chromeBrowserService.openBrowser(cicd);
                return chromeBrowserService.getDriver();
            case "edge":
                EdgeBrowserService edgeBrowserService=new EdgeBrowserService();
                edgeBrowserService.openBrowser(cicd);
                return edgeBrowserService.getDriver();
            case "firefox":
                FirefoxBrowserService firefoxBrowserService=new FirefoxBrowserService();
                firefoxBrowserService.openBrowser(cicd);
                return firefoxBrowserService.getDriver();

        }
        return null;
    }
}
