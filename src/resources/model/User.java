package resources.model;

public class User{

    String fName;
    String lName;
    char[20] emailAddress;
    char[8] password;
    boolean userFined;

    public User( String fn, String ln, char[] email, char[] passw ){        // purposefully does not include boolean userFined, as a new user wouldnt have been able to be fined
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

    public char[] getEmailAddress(){
        return emailAddress;
    }

    public char[] getPassword(){
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

    public void setEmailAddress(char[] a){
        emailAddress = a;
    }

    public void setPassword(char[] a){
        password = a;
    }

    public boolean setFine(boolean a){
        userFined = a;
    }

//////////////////////////////////////////////////////////////////////

    public String toStringUser(){
        String alles = fName+" "+lName+", "+emailAddress;
        return alles;
    }


}
