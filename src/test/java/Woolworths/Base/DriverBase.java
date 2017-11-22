package Woolworths.Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_ACTIVITY;
import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_PACKAGE;
import static io.appium.java_client.remote.MobileCapabilityType.*;

public class DriverBase
{
    protected DriverBase()
    {
        if (Driver == null)
        {
            GetDefaultDriver();
        }
    }

    public static AppiumDriver<MobileElement> Driver;

    public static void GetDefaultDriver()
    {
        URL url = null;
        try {
            url = new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(PLATFORM_NAME, "Android");
        capabilities.setCapability(DEVICE_NAME, "06157df614de4b32");
//      capabilities.setCapability(DEVICE_NAME, "U8Q845PN99999999");
//      capabilities.setCapability(DEVICE_NAME, "02160274c9852003");
        capabilities.setCapability(APP_PACKAGE, "com.woolworths.scango");
        capabilities.setCapability(APP, "E:\\Builds\\app-debug.apk");
        capabilities.setCapability(APP_ACTIVITY, "com.woolworths.scango.splash.SplashScreenActivity");

        Driver = new AndroidDriver<>(url, capabilities);
        Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

}
