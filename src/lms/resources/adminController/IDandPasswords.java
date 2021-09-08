package lms.resources.adminController;

import java.util.HashMap;

public class IDandPasswords {
    HashMap<String, String> loginInfo = new HashMap<String,String>();

    //Temporary constructor, initializes one user
    IDandPasswords(){
        loginInfo.put("123", "password");
    }

    protected HashMap getLoginInfo(){
        return loginInfo;
    }


}
