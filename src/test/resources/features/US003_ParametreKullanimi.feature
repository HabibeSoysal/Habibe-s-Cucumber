Feature: Parametre Kullanimi
  Scenario: Parametre Kullaniminda ConfigReader Kullanimi
    Given Kullanici "amazonUrl" sayfasina gider
  Scenario: TC01 Kullanici amazonda parametreli arama yapar
    Then kullanici "nutella" icin arama yapar
    And sonuclarin "nutella" icerdigini test eder