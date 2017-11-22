package Woolworths.Pages;

import Woolworths.Base.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends PageBase
{
    @iOSFindBy(id = "")
    @AndroidFindBy(xpath = "//*[@content-desc='Open']")
    private MobileElement HamburgerMenu;

    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/toolbarTitle")
    private MobileElement Title;

    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/label_welcome")
    private MobileElement WelcomeLabel;

    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/txtStoreName")
    private MobileElement StoreName;

    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/label_reward_points")
    private MobileElement RewardsPoints;

    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/btnScanItem")
    private MobileElement ScanButton;

    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/btnViewCart")
    private MobileElement CartIcon;

    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.android.packageinstaller:id/dialog_container")
    private MobileElement AllowDialogBox;

    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    private MobileElement Allow;

    public String GetTitle()
    {
        WebDriverWait wait = new WebDriverWait(Driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(Title));
        return Title.getText().toString();
    }

    public String GetWelcomeLabel()
    {
        return WelcomeLabel.getText().toString();
    }

    public String GetStoreName()
    {
        return StoreName.getText().toString();
    }

    public void ClickOnHamburgerMenu()
    {
        HamburgerMenu.click();
    }

    public void ClickOnScanIcon()
    {
        try{
            ScanButton.click();
            if (AllowDialogBox.isDisplayed())
            {
                Allow.click();
            }
        }
        catch (Exception ex){}
    }
}
