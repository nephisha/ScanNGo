package Woolworths.Pages;

import Woolworths.Base.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LoginPage extends PageBase
{
    @iOSFindBy(accessibility = "InputEmail")
    @AndroidFindBy(id = "com.woolworths.scango:id/etInputEmail")
    private MobileElement EmailAddress;

    @iOSFindBy(id = "InputPassword")
    @AndroidFindBy(id = "com.woolworths.scango:id/etInputPassword")
    private MobileElement Password;

    @iOSFindBy(id = "SignIn")
    @AndroidFindBy(id = "com.woolworths.scango:id/btnSignIn")
    private MobileElement Login;

    public void EnterLoginCredentials(String username, String pwd)
    {
        EmailAddress.sendKeys(username);
        Password.sendKeys(pwd);
    }

    public void ClickLoginButton() {
        Driver.hideKeyboard();
        Login.click();
    }
}
