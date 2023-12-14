package ObjectData;

import java.util.HashMap;

public class WebTableDataObject {

   private String firstnamevalue;
    private  String lastnamevalue;
    private  String emailvalue;
    private  String agevalue;
    private  String salaryvalue;
    private String departamentvalue;

    public String getFirstnamevalue() {
        return firstnamevalue;
    }

    public void setFirstnamevalue(String firstnamevalue) {
        this.firstnamevalue = firstnamevalue;
    }

    public String getLastnamevalue() {
        return lastnamevalue;
    }

    public void setLastnamevalue(String lastnamevalue) {
        this.lastnamevalue = lastnamevalue;
    }

    public String getEmailvalue() {
        return emailvalue;
    }

    public void setEmailvalue(String emailvalue) {
        this.emailvalue = emailvalue;
    }

    public String getAgevalue() {
        return agevalue;
    }

    public void setAgevalue(String agevalue) {
        this.agevalue = agevalue;
    }

    public String getSalaryvalue() {
        return salaryvalue;
    }

    public void setSalaryvalue(String salaryvalue) {
        this.salaryvalue = salaryvalue;
    }

    public String getDepartamentvalue() {
        return departamentvalue;
    }

    public void setDepartamentvalue(String departamentvalue) {
        this.departamentvalue = departamentvalue;
    }

    public WebTableDataObject(HashMap<String, String> testdata) {
        populateObject(testdata);

    }
    //facem o metoda care sa mapeze valorile din propreties la variabilele din clasa

    private void populateObject(HashMap<String, String> testdata) {
        for (String Key : testdata.keySet()) {
            switch (Key) {
                case "firstnamevalue":
                    setFirstnamevalue(testdata.get(Key));
                    break;
                case "lastnamevalue":
                    setLastnamevalue(testdata.get(Key));
                    break;
                case "emailvalue":
                    setEmailvalue(testdata.get(Key));
                    break;
                case "agevalue":
                    setAgevalue(testdata.get(Key));
                    break;
                case "salaryvalue":
                    setSalaryvalue(testdata.get(Key));
                    break;
                case "departamentvalue":
                    setDepartamentvalue(testdata.get(Key));
                    break;


            }
        }
    }
}

