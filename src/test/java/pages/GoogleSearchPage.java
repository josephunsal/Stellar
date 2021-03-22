package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class GoogleSearchPage {
    @FindBy(xpath = "//*[@id=\"result-stats\"]")
    protected WebElement searchResult;
    @FindBy(xpath = "//*[@name='q']")
    protected WebElement searchBar;

    public GoogleSearchPage() {
        PageFactory.initElements(Driver.getDriver(),
                this);
    }

    public void search(String input) {
        searchBar.sendKeys(input);
        searchBar.submit();
    }

    public void showResultCountAndDuration() {
        System.out.println(searchResult.getText());
    }

    public WebElement getHeaderElementByName(String headerName) {
        WebElement element = null;
        try {
            element = Driver.getDriver().findElement(By.xpath("//header[@class='section-header']/h2[text()='" + headerName + "']"));
        } catch (Exception e) {
            Assert.fail("Invalid header Name");
        }
        return element;
    }

    public WebElement getTitleElementByTitleName(String titleNAme) {
        WebElement element = null;
        try {
            element = Driver.getDriver().findElement(By.xpath("h5[text()='" + titleNAme + "']"));
        } catch (Exception e) {
            Assert.fail("Invalid title Name");
        }
        return element;
    }


}
