package Woolworths.Pages;

import Woolworths.Base.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductInformationPage extends PageBase
{
    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/txtProductName")
    private MobileElement ProductName;

    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/labelDollar")
    private MobileElement DollarLabel;

    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/txtItemPrice")
    private MobileElement ItemPrice;

    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/txtItemPriceCents")
    private MobileElement ItemPriceCents;

    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/itemQuantity")
    private MobileElement ItemQuantity;

    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/reduceItemQuantity")
    private MobileElement DecreaseQuantity;

    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/increaseItemQuantity")
    private MobileElement IncreaseQuantity;

    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/btnViewCart")
    private MobileElement ViewCart;

    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/cartItems")
    private MobileElement CartItems;

    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/btnScanItem")
    private MobileElement ScanButton;

    public String GetProductName()
    {
        WebDriverWait wait = new WebDriverWait(Driver, 20);
        wait.until(ExpectedConditions.visibilityOf(ProductName));
        return ProductName.getText();
    }

    public String GetProductPrice()
    {
        return ItemPrice.getText();
    }

    public String GetProductCents()
    {
        return ItemPriceCents.getText();
    }

    public String GetCartItemsCount()
    {
        return CartItems.getText();
    }

    public void ClickOnViewCartItems()
    {
        ViewCart.click();
    }
}
