package page;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import testRunner.Runner;

public class mainMethods extends Runner {
    public WebDriver driver;
    ChromeOptions options  = new ChromeOptions();
    WebDriverWait wait;


    public mainMethods(){
        PageFactory.initElements(driver,this);
    }

    public void getHepsiBurada() {
        getUrl();
    }

    public  void Wait(int seconds){WaitRunner(seconds);}

    public void closeDriver() {
        DriverQuit();
    }

    public void PageScrollDown(){
        PageScrolldown();
    }

    public void PageScrollUp(){
        PageScrollup();
    }
}
