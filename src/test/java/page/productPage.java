package page;

import io.cucumber.java.en.And;
import org.openqa.selenium.support.PageFactory;
import testRunner.Runner;

import java.util.concurrent.TimeUnit;

public class productPage extends Runner {

    public productPage(){
        PageFactory.initElements(driver,this);
    }

    public void clickFirstProduct() {
        findElements("/html/body/div[3]/main/div[2]/div/div/div/div/div[2]/section/div[1]/div[4]/div/div/div/div/ul/li[1]/div/a/div[2]/h3","xPath");
    }

    public void clickAddToCard() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        findElements("addToCart","id");
    }

    public void clickCloseProductAdvice() {
        findElements("/html/body/div[11]/div/div/div/div[1]/div[2]","xPath");
    }

    public void clickAddBasketFromOtherSaler() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        findElements("/html/body/div[4]/main/div[3]/section[1]/div[5]/div/div[4]/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[3]/div/form/button","xPath");
    }

    public void clickIgnorePackage() {
        findElements("//*[@id=\"pcwrapper\"]/div/a","xPath");
    }

    public void clickRemoteVehicles() {
        findElements("/html/body/div[3]/main/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[1]/div/ul/li[9]/div/div/div[1]/div[2]/ul/li/ul[3]/li/a[2]/span","xPath");
    }

    public void clickMoreCategories() {
        findElements("//a[contains(@class,'moreCategories')]","xPath");
    }

    public void clickDronesPieces() {
        findElements("//a[@href='/drone-yedek-parcalari-c-80438115'][contains(.,'Drone Yedek Parçaları')]","xPath");
    }
}
