package lms.resources.model;

public class User{

    String fName;
    String lName;
    String emailAddress;
    String password;
    public boolean userFined;

    public User( String fn, String ln, String email, String passw){        // purposefully does not include boolean userFined, as a new user wouldnt have been able to be fined
        fName = fn;
        lName = ln;
        emailAddress = email;
        password = passw;

    }

//      Accessors       //////////////////////////////////////////

    public String getfName(){
        return fName;
    }

    public String getlName(){
        return lName;
    }

    public String getEmailAddress(){
        return emailAddress;
    }

    public String getPassword(){
        return password;
    }

    public boolean isFined(){
        return userFined;
    }

//      Mutators       ////////////////////////////////////////////

    public void setfName(String a){
        fName = a;
    }

    public void setlName(String a){
        lName = a;
    }

    public void setEmailAddress(String a){
        emailAddress = a;
    }

    public void setPassword(String a){
        password = a;
    }

    public boolean setFine(boolean a){
        userFined = a;
        return userFined;
    }

//////////////////////////////////////////////////////////////////////

    public String toStringUser(){
        String alles = fName+" "+lName+", "+emailAddress;
        return alles;
    }


}
