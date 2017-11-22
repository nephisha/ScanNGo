package Woolworths.Pages;

import Woolworths.Base.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MenuPage extends PageBase
{
    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/userFirstName")
    private MobileElement Menu_FirstName;

    public String GetMenuFirstName()
    {
        return Menu_FirstName.getText().toString();
    }
}
