package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.TrenyolMorhipoPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class TrenyolMorhipoStepDefinition {
    TrenyolMorhipoPage trendMorPageObje = new TrenyolMorhipoPage();
    String trendyolAramaSonucuYazisi;
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
        //trendMorPageObje.trendyolCerezKabul.click();
        trendyolHandle = Driver.getDriver().getWindowHandle();

    }

    @And("makas aratiniz")
    public void makasAratiniz() {
        trendMorPageObje.trendyolSearchBox.sendKeys("makas", Keys.ENTER);

    }

    @And("toplam urun sayisini aliniz")
    public void toplamUrunSayisiniAliniz() throws InterruptedException {
        trendyolAramaSonucuYazisi = trendMorPageObje.trendyolMakasAramaSonucu.getText();

        String[] trendyolSonucSayisiArr = trendyolAramaSonucuYazisi.split("");
        trendyolUrunSayisi = Integer.parseInt(trendyolSonucSayisiArr[3]);
        Thread.sleep(3000);

    }

    @And("yeni sekmede morhipo'ya gidiniz")
    public void yeniSekmedeMorhipoYaGidiniz() throws InterruptedException {
     /*   Driver.getDriver().switchTo().newWindow(WindowType.TAB).get(ConfigReader.getProperty("morhipoUrl"));
        Thread.sleep(3000);
        morhipoHandle = Driver.getDriver().getWindowHandle();
*/
    }

    @And("makas aratiniz morhipo")
    public void makasAratinizMorhipo() {
        trendMorPageObje.morhipoSearchBox.sendKeys("Makas", Keys.ENTER);
    }

    @And("toplam urun sayisini aliniz morhipo")
    public void toplamUrunSayisiniAlinizMorhipo() {
        wait.until(ExpectedConditions.visibilityOf(trendMorPageObje.makasSonuc));
        morhipoUrunSayisi = Integer.parseInt(trendMorPageObje.makasSonuc.getText());
    }

    @And("iki sitedeki toplam makas sayisini karsilastiriniz")
    public void ikiSitedekiToplamMakasSayisiniKarsilastiriniz() {
        if (morhipoUrunSayisi > trendyolUrunSayisi) {
            System.out.println("Morhipo da makas daha fazla");
        } else {
            System.out.println("Trendyol da makas daha fazla");
        }
    }

    @And("Once urun sayisi fazla Alan siteyi kapatiniz")
    public void onceUrunSayisiFazlaAlanSiteyiKapatiniz() {
        if (morhipoUrunSayisi > trendyolUrunSayisi) {
            Driver.getDriver().switchTo().window(morhipoHandle).close();
        } else {
            Driver.getDriver().switchTo().window(trendyolHandle).close();
        }
    }
    @And("Sonra diger sayfayida kapatiniz")
    public void sonraDigerSayfayidaKapatiniz() throws InterruptedException{
        Thread.sleep(2000);
        Driver.quitDriver();
    }
}