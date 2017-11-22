package Woolworths.Pages;

import Woolworths.Base.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class CartsPage extends PageBase
{
    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/toolbarTitle")
    private MobileElement CartTitle;

    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/itemsCount")
    private MobileElement CountOfItems;


    public String GetCartTitle()
    {
        return CartTitle.getText();
    }

    public String GetItemsCount()
    {
        return CountOfItems.getText();
    }
}
