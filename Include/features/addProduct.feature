@addProduct
Feature: Add New Product

  @addProduct1
  Scenario: User Add Product With Valid Data
    Given User Login Satu
    When User click button Jual Satu
    And User Input Nama Produk Satu
    And User Input Harga Produk Satu
    And User Set Categories Satu
    And User Set Deskripsi Satu
    And User Add Image Satu
    And User Klik Terbitkan Satu
    Then Product successfully published
 
  @addProduct2
  Scenario: User Add Product Without Nama Produk
    Given  User Login Dua
    When User click button Jual Dua
    And User Input Harga Produk Dua
    And User Set Categories Dua
    And User Set Deskripsi Dua
    And User Add Image Dua
    And User Klik Terbitkan Dua
    Then Name Cannot Blank
    
    @addProduct3
  Scenario: User Add Product Without Right Price
    Given  User Login Tiga
    When User click button Jual Tiga
    And User Input Nama Produk Tiga
    And User Input Harga Produk Salah
    And User Set Categories Tiga
    And User Set Deskripsi Tiga
    And User Add Image Tiga
    And User Klik Terbitkan Tiga
    Then Price Only Number
  
  @addProduct4
  Scenario: User Add Product Without Filled Data
    Given  User Login Empat
    When User click button Jual Empat
    And User Klik Terbitkan Empat
    Then Product Failed published