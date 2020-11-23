package page;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import testRunner.Runner;

public class registerPage extends Runner {

    public registerPage(){
        PageFactory.initElements(driver,this);
    }

    public void setUserEmail() {
        findElements("txtUserName","id","mecitkurun@hotmail.com");
    }

    public void setUserPassword() {
        findElements("txtPassword","id","2318921");
    }

    public void clickUserLogin() {
        findElements("btnLogin","id");
    }
}
