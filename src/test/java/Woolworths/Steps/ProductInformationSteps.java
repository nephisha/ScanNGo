package Woolworths.Steps;

import Woolworths.Pages.CartsPage;
import Woolworths.Pages.ProductInformationPage;
import cucumber.api.java.en.Then;
import org.assertj.core.api.Assertions;

public class ProductInformationSteps
{
    private ProductInformationPage productInformationPage = new ProductInformationPage();
    private CartsPage cartsPage = new CartsPage();

    @Then("^I should see the product (.*) (.*) (.*) added to the cart$")
    public void iShouldSeeTheProductAddedToTheCart(String name, String price, String cents) throws Throwable {
        Assertions.assertThat(productInformationPage.GetProductName()).isEqualTo(name);
        Assertions.assertThat(productInformationPage.GetProductPrice()).isEqualTo(price);
        Assertions.assertThat(productInformationPage.GetProductCents()).isEqualTo(cents);
        Assertions.assertThat(productInformationPage.GetCartItemsCount()).isEqualTo("1");
        productInformationPage.ClickOnViewCartItems();
        Assertions.assertThat(cartsPage.GetCartTitle()).isEqualTo("My items");
        Assertions.assertThat(cartsPage.GetItemsCount()).isEqualTo("1 ITEM");
    }
}
