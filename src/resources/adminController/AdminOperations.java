package resources.adminController;
import resources.adminController.TempLoginPage;

public class AdminOperations {
    public void login(){
        IDandPasswords idandPasswords = new IDandPasswords();
        
        TempLoginPage loginPage = new TempLoginPage(idandPasswords.getLoginInfo());
    }
}
