package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class TrenyolMorhipoPage {
    public TrenyolMorhipoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@aria-label='Ara']")
    public WebElement aramaKutusu;
    @FindBy(xpath = "//*[@class='x2VHCd OSrXXb qzEoUe']")
    public WebElement trendyolLinki;
    @FindBy(xpath = "//*[@class='vQI670rJ']")
    public WebElement trendyolSearchBox;

    @FindBy (xpath = "//*[@id='onetrust-accept-btn-handler']")
    public WebElement trendyolCerezKabul;

    @FindBy(xpath = "//*[@class='dscrptn']")
    public WebElement trendyolMakasAramaSonucu;
    @FindBy(xpath = "//*[@id='pw-search-input']")
    public WebElement morhipoSearchBox;

    @FindBy(xpath = "//*[@i//*[@id='total-product-count']")
    public WebElement makasSonuc;




}
