package Woolworths.Pages;

import Woolworths.Base.PageBase;
import Woolworths.Common.PageHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TermsAndConditionsPage extends PageBase
{
    @iOSFindBy(id = "")
    @AndroidFindBy(xpath = "//*[@class='android.view.View' and @index='0']")
    private MobileElement TermsAndConditionsTitle;

    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/btnTnCAgree")
    private MobileElement Agree;




    public void ClickOnAgree()
    {
        WebDriverWait wait = new WebDriverWait(Driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(Agree));
        //PageHelper.WaitForElement(Driver, Agree);
        Agree.click();
    }
}
