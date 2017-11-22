package Woolworths.Base;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class PageBase extends DriverBase
{
    protected PageBase()
    {
        PageFactory.initElements(new AppiumFieldDecorator(Driver, 30, TimeUnit.SECONDS), this);
    }


}
