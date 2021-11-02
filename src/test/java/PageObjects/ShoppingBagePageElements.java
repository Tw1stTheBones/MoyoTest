package PageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ShoppingBagePageElements {
    public SelenideElement nameProduct2(){return $x("(//a[@class='link product-link color-blue text'])[1]");}
    public SelenideElement nameProduct1(){return $x("(//a[@class='link product-link color-blue text'])[2]");}
    public SelenideElement productQuantity(){return $x("//span[@class='b count']");}
}
