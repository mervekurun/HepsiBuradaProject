package page;

import io.cucumber.java.en.And;
import org.openqa.selenium.support.PageFactory;
import testRunner.Runner;

public class productPage extends Runner {

    public productPage(){
        PageFactory.initElements(driver,this);
    }

    public void clickFirstProduct() {
        findElements("/html/body/div[3]/main/div[2]/div/div/div/div/div[2]/section/div[1]/div[4]/div/div/div/div/ul/li[1]/div/a/div[2]/h3","xPath");
    }

    public void clickAddToCard() {
        findElements("addToCart","id");
    }

    public void clickCloseProductAdvice() {
        findElements("/html/body/div[12]/div/div/div/div[1]/div[2]","xPath");
    }

    public void clickAddBasketFromOtherSaler() {
        findElements("body > div.wrapper > main > div.product-detail-module > section.detail-main > div.container.contain-lg-4.contain-md-4.contain-sm-1.fluid > div > div.productDetailRight.col.lg-2.md-2.sm-1.grid-demo-fluid > div.merchantLists.col.lg-5.sm-1.no-padding > div.merchantList > div > div.marketplace-list > table > tbody > tr:nth-child(1) > td.form-area > div > form > button","cssSelector");
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
