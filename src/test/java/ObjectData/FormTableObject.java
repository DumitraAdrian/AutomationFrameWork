package ObjectData;

import java.util.HashMap;

public class FormTableObject {

    private String firstNamevalue ;
    private String   lastNameValue ;
    private String emailValue ;
    private String  mobileValue ;
    private String subjectsValue ;
    private String  addressValue ;
    private String  stateValue ;
    private String cityValue ;
    private String   expectedMessage ;

    public FormTableObject(HashMap<String, String> testdata){
        populateObject(testdata);

    }
    //facem o metoda care sa mapeze valorile din propreties la variabilele din clasa

    private void populateObject(HashMap<String,String> testdata){
        for(String Key:testdata.keySet()){
            switch (Key){
                case "firstNamevalue":
                    setFirstNamevalue(testdata.get(Key));
                    break;
                case "lastNameValue":
                    setLastNameValue(testdata.get(Key));
                    break;
                case "emailValue":
                    setEmailValue(testdata.get(Key));
                    break;
                case "mobileValue":
                    setMobileValue(testdata.get(Key));
                    break;
                case "subjectsValue":
                    setSubjectsValue(testdata.get(Key));
                    break;
                case "addressValue":
                    setAddressValue(testdata.get(Key));
                    break;
                case "stateValue":
                    setStateValue(testdata.get(Key));
                    break;
                case "cityValue":
                    setCityValue(testdata.get(Key));
                    break;
                case "expectedMessage":
                    setExpectedMessage(testdata.get(Key));
                    break;

            }
        }
    }
    public String getFirstNamevalue() {
        return firstNamevalue;
    }

    public void setFirstNamevalue(String firstNamevalue) {
        this.firstNamevalue = firstNamevalue;
    }

    public String getLastNameValue() {
        return lastNameValue;
    }

    public void setLastNameValue(String lastNameValue) {
        this.lastNameValue = lastNameValue;
    }

    public String getEmailValue() {
        return emailValue;
    }

    public void setEmailValue(String emailValue) {
        this.emailValue = emailValue;
    }

    public String getMobileValue() {
        return mobileValue;
    }

    public void setMobileValue(String mobileValue) {
        this.mobileValue = mobileValue;
    }

    public String getSubjectsValue() {
        return subjectsValue;
    }

    public void setSubjectsValue(String subjectsValue) {
        this.subjectsValue = subjectsValue;
    }

    public String getAddressValue() {
        return addressValue;
    }

    public void setAddressValue(String addressValue) {
        this.addressValue = addressValue;
    }

    public String getStateValue() {
        return stateValue;
    }

    public void setStateValue(String stateValue) {
        this.stateValue = stateValue;
    }

    public String getCityValue() {
        return cityValue;
    }

    public void setCityValue(String cityValue) {
        this.cityValue = cityValue;
    }

    public String getExpectedMessage() {
        return expectedMessage;
    }

    public void setExpectedMessage(String expectedMessage) {
        this.expectedMessage = expectedMessage;
    }
}
