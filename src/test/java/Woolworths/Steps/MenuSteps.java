package Woolworths.Steps;

import Woolworths.Pages.HomePage;
import Woolworths.Pages.MenuPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.assertj.core.api.Assertions;


public class MenuSteps
{
    private HomePage homePage = new HomePage();
    private MenuPage menuPage = new MenuPage();

    @And("^When I tap the Menu$")
    public void whenITapTheMenu() throws Throwable {
        homePage.ClickOnHamburgerMenu();
    }

    @Then("^I should be able to see all the Menu Items$")
    public void iShouldBeAbleToSeeAllTheMenuItems() throws Throwable {
        Assertions.assertThat(menuPage.GetMenuFirstName()).startsWith("JohnCarter");
    }


}
