package Woolworths.Common;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageHelper
{
    public static MobileElement WaitForElement(AppiumDriver driver, MobileElement mobileElement)
    {
        try{
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.elementToBeClickable(mobileElement));
            return mobileElement;
        }catch(Exception e)
        {
            throw e;
        }
    }
}
