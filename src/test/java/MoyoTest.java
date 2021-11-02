import PageObjects.*;
import com.codeborne.selenide.Condition;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public class MoyoTest{

    @Test
    public void run(){

    open("https://www.moyo.ua/");
    MoyoHomePageHelpers moyo = new MoyoHomePageHelpers();
    moyo.searchBar().shouldHave(Condition.visible);
    moyo.searchBar().sendKeys("Конвектор электрический"+ Keys.ENTER);

    SeartchPageHelpers seartchPage = new SeartchPageHelpers();
    seartchPage.chooseProduct().click();
    String productName1 = seartchPage.productName();
    seartchPage.addToBag().click();
    seartchPage.continueShopping().click();

    moyo.searchBar().shouldHave(Condition.visible);
    moyo.searchBar().sendKeys("Смартфон Apple iPhone"+ Keys.ENTER);
    seartchPage.chooseProduct().click();
    String productName2 = seartchPage.productName();
    seartchPage.addToBag().click();
    seartchPage.buyProduct().shouldBe(Condition.visible,Condition.enabled);
    seartchPage.buyProduct().click();

    ShoppingBagePageHelpers shoppingBage = new ShoppingBagePageHelpers();
    Assert.assertEquals(productName1,shoppingBage.nameProduct1().getText());
    Assert.assertEquals(productName2,shoppingBage.nameProduct2().getText());
    Assert.assertEquals(2,  shoppingBage.productNumber());



   }
}
