Feature: Trenyol Morhipo Makas Aratma

  Scenario: Kullanici Trendyol ve Morhipo da makas aratir

  Given Google'a gidiniz
  Then trendyol'u aratiniz
  And trendyol linkini bulup siteye gidiniz
  And makas aratiniz
  And toplam urun sayisini aliniz
  And yeni sekmede morhipo'ya gidiniz
  And makas aratiniz morhipo
  And toplam urun sayisini aliniz morhipo
  And iki sitedeki toplam makas sayisini karsilastiriniz
  And Once urun sayisi fazla Alan siteyi kapatiniz
  And Sonra diger sayfayida kapatiniz