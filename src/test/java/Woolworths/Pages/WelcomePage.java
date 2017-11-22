package Woolworths.Pages;

import Woolworths.Base.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class WelcomePage extends PageBase
{
    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/txtFirstName")
    private MobileElement FirstName;

    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/txtRewardNumnber")
    private MobileElement RewardsNumber;

    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/btnNext")
    private MobileElement Next;


    public String VerifyFirstName()
    {
        return FirstName.getText().toString();
    }

    public String VerifyRewardsNumber() {
        return RewardsNumber.getText().toString();
    }

    public void ClickNext()
    {
        Next.click();
    }
}
