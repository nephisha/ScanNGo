package Woolworths.Steps;

import Woolworths.Pages.HomePage;
import Woolworths.Pages.TermsAndConditionsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.assertj.core.api.Assertions;

import static org.assertj.core.api.Assertions.assertThat;

public class HomeSteps
{
    private TermsAndConditionsPage termsAndConditionsPage = new TermsAndConditionsPage();
    private HomePage homePage = new HomePage();

    @Then("^I should be able to see the Home Page$")
    public void iShouldBeAbleToSeeTheHomePage() throws Throwable {
        Assertions.assertThat(homePage.GetTitle()).isEqualTo("Scan&Go");
        Assertions.assertThat(homePage.GetWelcomeLabel()).isEqualTo("Welcome to");
        Assertions.assertThat(homePage.GetStoreName()).isEqualTo("Norwest Support Office");
    }

    @And("^When I accept the terms and conditions$")
    public void whenIAcceptTheTermsAndConditions() throws Throwable {
        termsAndConditionsPage.ClickOnAgree();
    }


}
