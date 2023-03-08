package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepdefinitions {

    GooglePage googlePage = new GooglePage();
    String sonuc;

    @Then("Kullanici google {string} sayfasina gider")
    public void kullaniciGoogleSayfasinaGider(String url) {Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
    }

    @Then("Kullanici qookiesi kabul eder")
    public void kullanici_qookiesi_kabul_eder() {
        googlePage.qookiesAccept.click();

    }

   /* @Then("Arama kutusuna karsilastirmak istedigi para birimlerini girer")
    public void arama_kutusuna_karsilastirmak_istedigi_para_birimlerini_girer() {   bu sekilde de yazabiliriz yada asagidaki sekilde de yazabiliriz
        googlePage.aramaKutusu.sendKeys("100 dollars in pounds"+ Keys.ENTER);

    }*/

    @Then("Arama kutusuna karsilastirmak istedigi {string}para birimlerini girer")
    public void aramaKutusunaKarsilastirmakIstedigiParaBirimleriniGirer(String degerler) {
        googlePage.aramaKutusu.sendKeys(degerler+ Keys.ENTER);
    }

    @Then("Para birimlerinin karsilastirmasini alir")
    public void para_birimlerinin_karsilastirmasini_alir() {
       sonuc = googlePage.sonucYazisi.getText();  //  String sonuc; bunu sayfa basinda yazdirdim butum sayfada kullanmak icin
        System.out.println(sonuc);
    }

    @Then("Verilen degerlerin {int} den kucuk oldugunu dogrular")
    public void verilenDegerlerinDenKucukOldugunuDogrular(int sayi) {
        Assert.assertTrue(Double.parseDouble(sonuc)<sayi);
    }

    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();

    }
}
