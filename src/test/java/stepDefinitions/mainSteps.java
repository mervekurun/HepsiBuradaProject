package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page.homePage;
import page.mainMethods;
import page.productPage;
import page.registerPage;

public class mainSteps {
    page.homePage homePage=new homePage();
    page.registerPage registerPage=new registerPage();
    mainMethods mainSteps = new mainMethods();
    page.productPage productPage=new productPage();

    @Given("^Hepsiburada sitesine girilir$")
    public void getHepsiBurada() {
      mainSteps.getHepsiBurada();
    }

    @And("^Giris Yap butonuna gelinir")
    public void clickMyAccount() {
        homePage.clickMyAccount();
    }

    @And("^Giris Yap butonuna tıklanır$")
    public void clickLogin() {
        homePage.clickLogin();
    }

    @And("^Eposta adresi alanına kullanıcı maili girilir")
    public void setUserEmail() {
        registerPage.setUserEmail();
    }

    @And("^Şifre alanına kullanıcı şifresi girilir$")
    public void setUserPassword() {
        registerPage.setUserPassword();
    }

    @Then("^Giris Yap butonuna tıklanarak kullanıcı girişi yapılır$")
    public void clickUserLogin() {
        registerPage.clickUserLogin();
    }

    @And("^Arama çubuğuna istene ürün yazılır$")
    public void setSearchedProducts() {
        homePage.setSearchedProducts();
    }

    @And("^Ara butonuna tıklanır$")
    public void clickSearchButton() {
        homePage.clickSearchButton();
    }

    @And("^Açılan sayfadaki ilk ürüne tıklanır$")
    public void clickFirstProduct() {
        productPage.clickFirstProduct();
    }

    @And("^Ürün sepete eklenir$")
    public void clickAddToCard() {
        productPage.clickAddToCard();
    }

    @And("^Açılan ürün öneri popup'ı kapatılır$")
    public void clickCloseProductAdvice() {
        productPage.clickCloseProductAdvice();
    }

    @And("^İkinci satıcıdan ürün sepete ekle tıklanır$")
    public void clickAddBasketFromOtherSaler() {
        mainSteps.PageScrollDown();
        mainSteps.Wait(10);
        productPage.clickAddBasketFromOtherSaler();
    }

    @And("^Onarım paketi istemiyorum tıklanarak ürün sepete ekleme tamamlanır$")
    public void clickIgnorePackage() {
        productPage.clickIgnorePackage();
    }

    @Then("^Hepsiburadadan çıkılır$")
    public void closeDriver() {
        mainSteps.closeDriver();
    }

    @And("^Kitap Müzik Film Hobi tabının üstüne gelinir$")
    public void clickBookCategory() {
       homePage.clickBookCategory();
    }

    @And("^Uzaktan Kumandalı Araçlar sekmesine tıklanır$")
    public void clickRemoteVehicles() {
        productPage.clickRemoteVehicles();
    }

    @And("^Diğer Kategoriler tıklanır$")
    public void clickMoreCategories() {
       mainSteps.Wait(15);
       mainSteps.PageScrollDown();
       productPage.clickMoreCategories();
    }

    @And("^Drone Yedek Parçaları kategorisine tıklanır$")
    public void clickDronesPieces() {
      productPage.clickDronesPieces();
    }
}
