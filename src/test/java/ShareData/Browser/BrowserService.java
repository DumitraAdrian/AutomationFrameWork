package ShareData.Browser;

public interface BrowserService {
    void openBrowser(Boolean cicd);
    void closeBrowser();

    Object prepareBrowserOption(Boolean cicd); //metoda cu return(un return generic pentru a se plia pe orice browser)


}
