package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GooglePage {
    public GooglePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//div[text()='Accept all']")
   public WebElement qookiesAccept;

    @FindBy(xpath = "//*[@class='gLFyf']")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//*[@class='DFlfde SwHCTb']")  //DFlfde SwHCTb  //MWvIVe nGP2Tb
    public WebElement sonucYazisi;

    @FindBy(xpath = "")
    public WebElement m2;

}
