package Woolworths.Hooks;

import Woolworths.Base.DriverBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook
{
    @Before
    public void Setup()
    {
        System.out.println("Executing Before Scenario");

    }

    @After
    public void Teardown()
    {
        System.out.println("Executing After Scenario");
        DriverBase.Driver.resetApp();
        DriverBase.Driver.quit();
    }
}
