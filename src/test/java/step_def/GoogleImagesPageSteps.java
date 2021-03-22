package step_def;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.GoogleImagesPage;

public class GoogleImagesPageSteps {
    GoogleImagesPage imagesPage = new GoogleImagesPage();

    @And("user clicks the {string} linktext")
    public void userClicksTheLinktext(String arg0) {
        imagesPage.images.click();
    }

    @Then("user verifies the titles contains the word {string}")
    public void userVerifiesTheLinksContainsTheWord(String SearchedItem) {
        imagesPage.GetsearchedItemTitles(imagesPage.searchedItemTitles, SearchedItem);
    }
}
