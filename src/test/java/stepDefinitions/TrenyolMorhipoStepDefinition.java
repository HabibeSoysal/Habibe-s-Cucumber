package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.TrenyolMorhipoPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class TrenyolMorhipoStepDefinition {
    TrenyolMorhipoPage trendMorPageObje= new TrenyolMorhipoPage();
    int trendyolUrunSayisi;
    int morhipoUrunSayisi;
    String trendyolHandle;
    String morhipoHandle;
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

    @Given("Google'a gidiniz")
    public void googleAGidiniz() {
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
    }

    @Then("trendyol'u aratiniz")
    public void trendyolUAratiniz() {
        trendMorPageObje.aramaKutusu.sendKeys("Trendyol", Keys.ENTER);
    }

    @And("trendyol linkini bulup siteye gidiniz")
    public void trendyolLinkiniBulupSiteyeGidiniz() {
        trendMorPageObje.trendyolLinki.click();
        trendyolHandle=Driver.getDriver().getWindowHandle();

    }

    @And("makas aratiniz")
    public void makasAratiniz() {
        trendMorPageObje.trendyolSearchBox.sendKeys("makas",Keys.ENTER);

    }

    @And("toplam urun sayisini aliniz")
    public void toplamUrunSayisiniAliniz() {
    }

    @And("yeni sekmede morhipo'ya gidiniz")
    public void yeniSekmedeMorhipoYaGidiniz() {
        trendyolAramaSonucuYazisi= trendMorPageObje.trendyolMakasAramaSonucu.getText();

        String[] trendyolSonucSayisiArr = trendyolAramaSonucuYazisi.split(" ");
        trendyolUrunSayisi = Integer.parseInt(trendyolSonucSayisiArr[3]);


    }

    @And("makas aratiniz morhipo")
    public void makasAratinizMorhipo() {
    }

    @And("toplam urun sayisini aliniz morhipo")
    public void toplamUrunSayisiniAlinizMorhipo() {
    }

    @And("iki sitedeki toplam makas sayisini karsilastiriniz")
    public void ikiSitedekiToplamMakasSayisiniKarsilastiriniz() {
    }

    @And("Once urun sayisi fazla Alan siteyi kapatiniz")
    public void onceUrunSayisiFazlaAlanSiteyiKapatiniz() {
    }
}
