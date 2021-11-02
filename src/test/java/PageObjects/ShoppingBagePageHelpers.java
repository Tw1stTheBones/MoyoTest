package PageObjects;

import com.codeborne.selenide.SelenideElement;

public class ShoppingBagePageHelpers extends ShoppingBagePageElements {
    public int  productNumber(){
        String a = productQuantity().getText();
        int numb = Integer.parseInt(a);
        return numb;

    }

}
