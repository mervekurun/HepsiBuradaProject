Feature: HepsiBurada Registering

  Scenario: Kullanıcı girişi yapılarak sepete ürün eklenmesi
    Given Hepsiburada sitesine girilir
    And Giris Yap butonuna gelinir
    And Giris Yap butonuna tıklanır
    And Eposta adresi alanına kullanıcı maili girilir
    And Şifre alanına kullanıcı şifresi girilir
    Then Giris Yap butonuna tıklanarak kullanıcı girişi yapılır
    And Arama çubuğuna istene ürün yazılır
    And Ara butonuna tıklanır
    And Açılan sayfadaki ilk ürüne tıklanır
    And Ürün sepete eklenir
    And Açılan ürün öneri popup'ı kapatılır
    And İkinci satıcıdan ürün sepete ekle tıklanır
    And Onarım paketi istemiyorum tıklanarak ürün sepete ekleme tamamlanır
    Then Hepsiburadadan çıkılır


Scenario: Kullanıcı girişi yapılmadan belirtilen ürünü sepete ekleme
    Given Hepsiburada sitesine girilir
    And Kitap Müzik Film Hobi tabının üstüne gelinir
    And Uzaktan Kumandalı Araçlar sekmesine tıklanır
    And Diğer Kategoriler tıklanır
    And Drone Yedek Parçaları kategorisine tıklanır
    And Açılan sayfadaki ilk ürüne tıklanır
    And Ürün sepete eklenir
    Then Hepsiburadadan çıkılır



