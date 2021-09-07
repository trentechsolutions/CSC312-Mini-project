package resources.adminController;

public class AdminOperations {
    public void login(){
        IDandPasswords idandPasswords = new IDandPasswords();
        
        TempLoginPage loginPage = new TempLoginPage(idandPasswords.getLoginInfo());
    }
}
