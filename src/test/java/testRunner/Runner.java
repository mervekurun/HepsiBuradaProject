package testRunner;
import com.fasterxml.jackson.databind.ser.Serializers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features",glue = {"stepDefinitions"},tags={"@register"},
strict = true)

public class Runner{

    public static WebDriver driver;
    public static ChromeOptions options  = new ChromeOptions();
    WebDriverWait wait;


   public static void getDriver()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\merve\\Desktop\\Driver\\chromedriver.exe");
        options.setExperimentalOption("excludeSwitches", "disable-popup-blocking");
        options.addArguments("--disable-popup-blocking");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);;
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    public void getUrl(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\merve\\Desktop\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hepsiburada.com");
    }

    public void clickMyAccountButton() {
        WebElement element = driver.findElement(By.id("myAccount"));
        element.click();
    }

    public void findElements(String path, String type){
        WebDriverWait wait = new WebDriverWait(driver, 10);

        switch (type) {
            case "className":
                wait.until(ExpectedConditions.elementToBeClickable(By.className(path))).click();
                break;
            case "id":
                wait.until(ExpectedConditions.elementToBeClickable(By.id(path))).click();
                break;
            case "name":
                wait.until(ExpectedConditions.elementToBeClickable(By.name(path))).click();
                break;
            case "xPath":
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path))).click();
                break;
            case "cssSelector":
                wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(path))).click();
                break;
            case "linkText":
                wait.until(ExpectedConditions.elementToBeClickable(By.linkText(path))).click();
                break;
            default:
                new NotFoundException();
        }

    }


    public void findElements(String path, String type, String text){
        wait = new WebDriverWait(driver, 10);

        switch (type) {
            case "className":
                wait.until(ExpectedConditions.presenceOfElementLocated(By.className(path))).sendKeys(text);
                break;
            case "id":
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id(path))).sendKeys(text);
                break;
            case "name":
                wait.until(ExpectedConditions.presenceOfElementLocated(By.name(path))).sendKeys(text);
                break;
            case "xPath":
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path))).sendKeys(text);
                break;
            case "cssSelector":
                wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(path))).sendKeys(text);
                break;
            case "linkText":
                wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(path))).sendKeys(text);
                break;
            default:
                new NotFoundException();
        }

    }

       public void WaitRunner(int seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

        public void PageScrolldown() {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0,300)", "");

        }

        public void PageScrollup() {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0,-300)", "");
        }

        public void DriverQuit() {
            driver.quit();
        }

}
