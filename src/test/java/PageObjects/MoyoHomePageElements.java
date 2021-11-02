package PageObjects;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.SelenideElement;

public class MoyoHomePageElements {
    public SelenideElement searchBar(){return $x("//input[@id='search-input']");}


}
