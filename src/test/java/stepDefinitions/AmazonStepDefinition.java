package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinition {
    AmazonPage amazonPageObje = new AmazonPage();

    @Given("Kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("Kullanici nutella aratir")
    public void kullaniciNutellaAratir() {
        amazonPageObje.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }

    @And("Sonuclarin nutella icerdigini test eder")

    public void sonuclarinNutellaIcerdiginiTestEder() {
        String arananKElime = "Nutella";
        String actualAramaSonucu = amazonPageObje.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucu.contains(arananKElime));
    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("Kullanici Selenium aratir")
    public void kullaniciSeleniumAratir() {
        amazonPageObje.aramaKutusu.sendKeys("Selenium" + Keys.ENTER);
    }


    @And("Sonuclarin Selenium icerdigini test eder")
    public void sonuclarinSeleniumIcerdiginiTestEder() {
        String arananKElime = "Selenium";
        String actualAramaSonucu = amazonPageObje.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucu.contains(arananKElime));
    }

    @Then("Kullanici iphone aratir")
    public void kullaniciIphoneAratir() {
        amazonPageObje.aramaKutusu.sendKeys("iphone" + Keys.ENTER);
    }

    @And("Sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String arananKElime = "iphone";
        String actualAramaSonucu = amazonPageObje.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucu.contains(arananKElime));
    }


    @Then("Kullanici {string} için arama yapar")
    public void kullaniciIçinAramaYapar(String arananKElime) {
        amazonPageObje.aramaKutusu.sendKeys(arananKElime,Keys.ENTER);
    }

    @And("sonuclarin amazonda {string} icerdiğini test eder")
    public void sonuclarinAmazondaIcerdiğiniTestEder(String arananKElime) {
        String actualAramaSonucu = amazonPageObje.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucu.contains(arananKElime));
    }


    @And("sayfayi kapatir")
    public void sayfayiKapatır() {
        Driver.closeDriver();

    }
    @Then("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String arg0) {
    }

    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String arg0) {
    }

}
