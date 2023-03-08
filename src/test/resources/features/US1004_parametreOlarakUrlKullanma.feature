Feature: US1004 Url'i parametre olarak kullanma

  Scenario: TC09 Kullanici url icin parametre kullanabilmeli

    Given kullanici "youtubeUrl" anasayfaya gider
    Then url'in "youtube" icerdigini test eder
    And Sayfayi kapatir