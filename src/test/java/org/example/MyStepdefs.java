package org.example;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {

    HomePage homePage =new HomePage();
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

    @Then("^user is logged in$")
    public void userIsLoggedInAndOnHomepage() {
        homePage.userIsLoggedInSuccessfully();
    }

    @And("^user clicks on Transaction Search link$")
    public void userClicksOnTransactionSearchLink() {
        homePage.userClickOnLink();
    }

    @Then("^user should able to navigate to search page successfully$")
    public void userShouldAbleToNavigateToSearchPageSuccessfully() {
        homePage.verifyUserIsOnTransactionPage();
    }

    @When("^user enters transaction number as \"([^\"]*)\"$")
    public void userEntersTransactionNumberAs(String transactionNo){
        homePage.userEntersTransactionNo(transactionNo);
    }

    @And("^click on search button$")
    public void clickOnSearchButton() {
        homePage.userClicksOnSearchButton();
    }

    @Then("^user should able to see all related transactions for \"([^\"]*)\"$")
    public void userShouldAbleToSeeAllRelatedTransactionsFor(String transactionNo){
        homePage.verifyTransactionNoAppearsInSearchResult(transactionNo);
    }
}
