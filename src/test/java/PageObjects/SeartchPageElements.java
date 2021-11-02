package PageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SeartchPageElements {
    public SelenideElement chooseProduct(){return $x("(//div[@class='search_products js-products-list']/div)[1]/a");}
    public SelenideElement addToBag(){return $x("(//div[@class='product_buy-info']/button)[1]");}
    public SelenideElement continueShopping(){return $x("//div[@class='cart-footer__continue']");}
    public SelenideElement buyProduct(){return $x("//div[@class='main-btn sc-cSHVUG bPnwdk']");}
    public SelenideElement nameProduct(){return $x("//h1[@class='product_name']");}

}
