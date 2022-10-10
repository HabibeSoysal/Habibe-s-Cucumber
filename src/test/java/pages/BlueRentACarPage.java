package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentACarPage {
    public BlueRentACarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement login;

    @FindBy(xpath = "//*[@id='formBasicEmail']")
    public WebElement email;

    @FindBy(xpath = "//*[@id='formBasicPassword']")
    public WebElement password;


    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement login2;

    @FindBy(xpath = "//*[@id='dropdown-basic-button']")
    public WebElement girisBasarili;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement ikinciLogin;
}
