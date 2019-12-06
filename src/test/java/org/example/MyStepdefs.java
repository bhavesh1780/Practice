package org.example;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {

    LoginPage loginPage = new LoginPage();



    @Given("^user is on log in page$")
    public void userIsOnLogInPage() {
        loginPage.userIsOnLoginPage();
    }

    @When("^user enters valid credentials$")
    public void userEntersValidCredentials() {
        loginPage.userEnterValidCredentiala();
    }

    @And("^click on Sign in button$")
    public void clickOnSignInButton() {
        loginPage.userClickOnSigninButton();
    }

    @Then("^user is logged in and on homepage$")
    public void userIsLoggedInAndOnHomepage() {
    }

    @And("^user clicks on \"([^\"]*)\" link$")
    public void userClicksOnLink(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^user should able to navigate to search page successfully$")
    public void userShouldAbleToNavigateToSearchPageSuccessfully() {
    }

    @When("^user enters transaction number as \"([^\"]*)\"$")
    public void userEntersTransactionNumberAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^click on search button$")
    public void clickOnSearchButton() {
    }

    @Then("^user should able to see all related transactions for \"([^\"]*)\"$")
    public void userShouldAbleToSeeAllRelatedTransactionsFor(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
