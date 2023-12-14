package ObjectData;

import java.util.HashMap;

public class AlertObject {

    private String promptAlertValue;

    public String getPromptAlertValue() {
        return promptAlertValue;
    }

    public void setPromptAlertValue(String promptAlertValue) {
        this.promptAlertValue = promptAlertValue;
    }

    public AlertObject(HashMap<String, String> testdata) {
        populateObject(testdata);

    }
    //facem o metoda care sa mapeze valorile din propreties la variabilele din clasa

    private void populateObject(HashMap<String, String> testdata) {
        for (String Key : testdata.keySet()) {
            switch (Key) {
                case "promptAlertValue":
                    setPromptAlertValue(testdata.get(Key));
                    break;


            }
        }
    }
}