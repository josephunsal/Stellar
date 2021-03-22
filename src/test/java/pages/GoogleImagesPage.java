package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class GoogleImagesPage {

    @FindBy(xpath = "//*[@class=\"hdtb-mitem\"]/a")
    public WebElement images;
    @FindBy(xpath = "//a[contains(text(),'ducks')]")
    public List<WebElement> searchedItemTitles;

    public GoogleImagesPage() {
        PageFactory.initElements(Driver.getDriver(),
                this);
    }

    public void GetsearchedItemTitles(List<WebElement> input, String SearchedItem) {
        for (WebElement eachTitle : input) {
            try {
                Assert.assertTrue(eachTitle.getText().contains(SearchedItem));
            } catch (Exception e) {
                System.out.println("Non of the titles includes " + SearchedItem);
            }

        }
        System.out.println("There are " + input.size() + " images that contains " + SearchedItem);
    }
}
