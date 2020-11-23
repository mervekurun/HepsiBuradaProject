package page;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.PageFactory;
import testRunner.Runner;

public class homePage extends Runner {
    public homePage(){
        PageFactory.initElements(driver,this);
    }

    public void clickMyAccount() { findElements("myAccount","id"); }

    public void clickLogin() {
        findElements("login","id");
    }

    public void setSearchedProducts() {
        findElements("//*[@id=\"SearchBoxOld\"]/div/div/div[1]/div[2]/input","xPath","Xiaomi Redmi Note 9 Pro 128 GB");
    }

    public void clickSearchButton() {
        findElements("//*[@id=\"SearchBoxOld\"]/div/div/div[2]","xPath");
    }

    public void clickBookCategory() {
        findElements("/html/body/div[3]/main/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[1]/div/ul/li[9]/span/span","xPath");
    }

    public void clickMoreCategories() {
        findElements("//a[contains(@class,'moreCategories')]","xPath");
    }


}
