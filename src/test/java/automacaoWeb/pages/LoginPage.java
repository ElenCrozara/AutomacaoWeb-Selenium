package automacaoWeb.pages;

import automacaoWeb.core.Driver;
import automacaoWeb.maps.LoginMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    LoginMap loginMap;
    public LoginPage(){
        loginMap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(), loginMap);
    }
    public void clickBtnLogin(){
        loginMap.btnLogin.click();
    }
    public void clickBtnFechar(){
        loginMap.btnFechar.click();
    }
    public void clickFecharModal(){
        loginMap.divFecharModal.click();
    }
    public void setInpUsername(String username){
        loginMap.inpUserName.sendKeys(username);
    }
    public void setInpPassword(String password){
        loginMap.inpPassword.sendKeys(password);
    }
    public void clickInpRemember(){
        loginMap.inpRemember.click();
    }
    public void clickLinkCreateAccount(){
        loginMap.linkCreateAccount.click();
    }
    public  void clickBtnSignIn(){
        loginMap.btnSignIn.click();
    }
    public boolean isBtnSignIn(){
        return loginMap.btnSignIn.isEnabled();
    }
}
