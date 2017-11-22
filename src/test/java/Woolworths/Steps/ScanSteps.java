package Woolworths.Steps;

import Woolworths.Pages.HomePage;
import Woolworths.Pages.ScannerPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScanSteps
{
    private HomePage homePage = new HomePage();
    private ScannerPage scannerPage = new ScannerPage();

    @And("^When I tap the Scan Icon$")
    public void whenITapTheScanIcon() throws Throwable {
        homePage.ClickOnScanIcon();
    }

    @Then("^I should be able to see the Scanner Screen$")
    public void iShouldBeAbleToSeeTheScannerScreen() throws Throwable {

    }

    @When("^I open the scanner$")
    public void iOpenTheScanner() throws Throwable {
        homePage.ClickOnScanIcon();
    }

    @And("^I enter the (.*) manually$")
    public void iEnterTheBarcodeManually(String barcode) throws Throwable {
        scannerPage.EnterBarcodeDetails(barcode);
    }
}
