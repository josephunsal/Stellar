package step_def;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.InvalidArgumentException;
import pages.GoogleSearchPage;
import utils.Driver;


public class GoogleSearchPageSteps {

    GoogleSearchPage searchPage = new GoogleSearchPage();


    @When("user able to open {string} page")
    public void user_able_to_open_page(String targetUrl) {
        try {
            Driver.getDriver().get(targetUrl);
        } catch (InvalidArgumentException e) {
            Assert.fail(targetUrl + " is invalid url");
        }
    }

    @When("web page should auto direct to the {string} url")
    public void web_page_should_auto_direct_to_the_url(String expectedUrl) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue("Expected url is not matching actual url ", actualUrl.contains(expectedUrl));

    }

    @Then("user should able to search {string}")
    public void user_should_able_to_search(String string) {
        searchPage.search("ducks");

    }

    @Then("user should able to see the total number of results along with the total search duration.")
    public void user_should_able_to_see_the_total_number_of_results_along_with_the_total_search_duration() {
        searchPage.showResultCountAndDuration();
    }


}
