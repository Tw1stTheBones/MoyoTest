package PageObjects;

public class SeartchPageHelpers extends SeartchPageElements {


    public String productName() {
        String nameFirst = nameProduct().getText();
        return nameFirst;
    }



}
