## Cucumber Appium - JAVA Framework

**Appium-JAVA Framework to automate tests using Appium WebDrive on both Android and iOS devicesr**

Mobile Test Framework was designed in JAVA following BDD style to propose a common way how people should create Acceptance tests.

**It provides following features:**
- Ready for parallel tests execution
- Possibility to use TestNG, JUnit framework --[JUnit framework is implemented]
- Cucumber ready
- Written entirely in JAVA
- Allows to use on Android and iOS devices
- Automatically waits when locating element for specified time and conditions
- Page Object Pattern is implemented using PageFactory design.
- Possibility to take screen shot on failures

Cucumber Feature:

```java
Feature: Login
  As a User
    I should be able to access the Scan And Go app with valid credentials

    Scenario Outline: Login to Application
  Given I enter the Scan and Go application with <email> and <password>
  When I press the login button
    Then I should be able to see the welcome page

    Examples:
      | email          | password |
      | john@gmail.com | 123456   |

```

JUnit Example Page Object:

```java

import Woolworths.Base.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LoginPage extends PageBase
{
    @iOSFindBy(xpath = "//*[@value='Email']")
    @AndroidFindBy(id = "com.woolworths.scango:id/etInputEmail")
    private MobileElement EmailAddress;

    @iOSFindBy(xpath = "//*[@value='Password']")
    @AndroidFindBy(id = "com.woolworths.scango:id/etInputPassword")
    private MobileElement Password;

    @iOSFindBy(xpath = "//*[@name='Log In']")
    @AndroidFindBy(id = "com.woolworths.scango:id/btnSignIn")
    private MobileElement Login;

    public void EnterLoginCredentials(String username, String pwd)
    {
        EmailAddress.sendKeys(username);
        Password.sendKeys(pwd);
    }
```
