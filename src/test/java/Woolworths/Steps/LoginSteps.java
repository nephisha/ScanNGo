package Woolworths.Steps;

import Woolworths.Base.DriverBase;
import Woolworths.Pages.LoginPage;
import Woolworths.Pages.WelcomePage;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginSteps
{
    private LoginPage loginPage = new LoginPage();
    private WelcomePage welcomePage = new WelcomePage();

    @Given("^I enter the Scan and Go application$")
    public void iEnterTheScanAndGoApplication() throws Throwable {
        loginPage.EnterLoginCredentials("john@gmail.com", "123456");
    }

    @When("^I press the login button$")
    public void iPressTheLoginButton() throws Throwable {
        loginPage.ClickLoginButton();
    }

    @Then("^I should be able to see the welcome page$")
    public void iShouldBeAbleToSeeTheWelcomePage() throws Throwable {
        assertThat(welcomePage.VerifyFirstName()).startsWith("JohnCarter");
        //assertThat(welcomePage.VerifyRewardsNumber()).isEqualTo("");
        welcomePage.ClickNext();
    }

    @Given("^I enter the Scan and Go application with (.*) and (.*)$")
    public void iEnterTheScanAndGoApplicationWithEmailAndPassword(String uName, String uPassword) throws Throwable {
        loginPage.EnterLoginCredentials(uName,uPassword);
    }

    @After
    public void Teardown()
    {
        DriverBase.Driver.resetApp();
    }
}
