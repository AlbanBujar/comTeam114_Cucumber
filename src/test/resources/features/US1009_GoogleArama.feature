@1009
Feature: US1009 Google Arama testi
  Background: Before Butun testler icin  ortak  calisacaklar  buraya yaziliyor
    Then Kullanici google "url" sayfasina gider
    Then Kullanici qookiesi kabul eder

  Scenario: Arama Kutusu Testi

    Then Arama kutusuna karsilastirmak istedigi "dollar to tl "para birimlerini girer
    Then Para birimlerinin karsilastirmasini alir
    Then Verilen degerlerin 20 den kucuk oldugunu dogrular
    And Kullanici sayfayi kapatir


  Scenario Outline: Arama Kutusu Testi

    Then Arama kutusuna karsilastirmak istedigi "<testEdilecekParaBirimleri>"para birimlerini girer
    Then Para birimlerinin karsilastirmasini alir
    Then Verilen degerlerin 150 den kucuk oldugunu dogrular
    And Kullanici sayfayi kapatir

    Examples:
    |testEdilecekParaBirimleri |
    |dollar to tl              |
    |dollar to pound           |
    |pound to leke             |
    |euro to tl                |
    |denar to tl               |

  Scenario: Arama Kutusu Testi 2

    Then Arama kutusuna karsilastirmak istedigi "dollar to tl "para birimlerini girer
    Then Para birimlerinin karsilastirmasini alir
    Then Verilen degerlerin 21 den kucuk oldugunu dogrular
    And Kullanici sayfayi kapatir