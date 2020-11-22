package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import testRunner.Runner;

import java.util.concurrent.TimeUnit;

public class registerSteps extends Runner {
    @Given("^Hepsiburada sitesine girilir$")
    public void aWebBrowserIsAtTheHepsiburadaHomePage() {
        geturl();
    }

    @And("^Giris Yap butonuna gelinir")
    public void clickMyAccount() {
        findElements("myAccount","id");
    }

    @And("^Giris Yap butonuna tıklanır$")
    public void clickLogin() {
        findElements("login","id");
    }

    @And("^Eposta adresi alanına kullanıcı maili girilir")
    public void setUserEmail() {
        findElements("txtUserName","id","@hotmail.com");
    }

    @And("^Şifre alanına kullanıcı şifresi girilir$")
    public void setUserPassword() {
        findElements("txtPassword","id","***");
    }

    @Then("^Giris Yap butonuna tıklanarak kullanıcı girişi yapılır$")
    public void clickUserLogin() {
        findElements("btnLogin","id");
    }

    @And("^Arama çubuğuna istene ürün yazılır$")
    public void setSearchedProducts() {
        findElements("//*[@id=\"SearchBoxOld\"]/div/div/div[1]/div[2]/input","xPath","Xiaomi Redmi Note 9 Pro 128 GB");
    }

    @And("^Ara butonuna tıklanır$")
    public void clickSearchButton() {
        findElements("//*[@id=\"SearchBoxOld\"]/div/div/div[2]","xPath");
    }

    @And("^Açılan sayfadaki ilk ürüne tıklanır$")
    public void clickFirstProduct() {
        Wait(50);
        findElements("/html/body/div[3]/main/div[2]/div/div/div/div/div[2]/section/div[1]/div[4]/div/div/div/div/ul/li[1]/div/a/div[2]/h3","xPath");
    }

    @And("^Ürün sepete eklenir$")
    public void clickAddToCard() {
        findElements("addToCart","id");
    }

    @And("^Açılan ürün öneri popup'ı kapatılır$")
    public void clickCloseProductAdvice() {
        Wait(15);
        findElements("sf-SalesFrontCash-3zIbr hb_sfc_close","class");
    }

    @And("^İkinci satıcıdan ürün sepete ekle tıklanır$")
    public void clickAddBasketFromOtherSaler() {
        Wait(15);
        findElements("body > div.wrapper > main > div.product-detail-module > section.detail-main > div.container.contain-lg-4.contain-md-4.contain-sm-1.fluid > div > div.productDetailRight.col.lg-2.md-2.sm-1.grid-demo-fluid > div.merchantLists.col.lg-5.sm-1.no-padding > div.merchantList > div > div.marketplace-list > table > tbody > tr:nth-child(1) > td.form-area > div > form > button","cssSelector");
    }

    @And("^Onarım paketi istemiyorum tıklanarak ürün sepete ekleme tamamlanır$")
    public void clickIgnorePackage() {
        findElements("//*[@id=\"pcwrapper\"]/div/a","xPath");
    }

    @Then("^Hepsiburadadan çıkılır$")
    public void closeDriver() {
        DriverQuit();
    }

    @And("^Kitap Müzik Film Hobi tabının üstüne gelinir$")
    public void clickBookCategory() {
        findElements("/html/body/div[3]/main/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[1]/div/ul/li[9]/span/span","xPath");
    }

    @And("^Uzaktan Kumandalı Araçlar sekmesine tıklanır$")
    public void clickRemoteVehicles() {
        findElements("/html/body/div[3]/main/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[1]/div/ul/li[9]/div/div/div[1]/div[2]/ul/li/ul[3]/li/a[2]/span","xPath");
    }

    @And("^Diğer Kategoriler tıklanır$")
    public void clickMoreCategories() {
       Wait(30);
       findElements("//*[@id=\"productResult\"]/div/div/div/div[1]/section/div[1]/div[2]/div/div/div/a/text()[contains(., \"Diğer Kategoriler\")]","xPath");
    }

    @And("^Drone Yedek Parçaları kategorisine tıklanır$")
    public void clickDronesPieces() {
        //findElements("#\\31 ced7ba5-31da-4e31-b639-7008b7330a7d > div > div > div > ul > li:nth-child(10) > a","cssSelector");
        findElements("//*[@id=\"productResult\"]/div/div/div/div[1]/section/div[1]/div[2]/div/div/div/div/ul/li[10]","xPath");

    }
}
