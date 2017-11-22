package Woolworths.Pages;

import Woolworths.Base.PageBase;
import Woolworths.Common.PageHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScannerPage extends PageBase
{
    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/manualEntry")
    private MobileElement ManualBarCodeIcon;

    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/scanClose")
    private MobileElement CloseScanner;

    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/labelEnterProduct")
    private MobileElement ManualBarCodeLabel;

    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/manualBarCodeEntryText")
    private MobileElement ManualBarCodeEntry;

    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/clearManualBarCodeEntry")
    private MobileElement ClearManualBarCode;

    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/btnOk")
    private MobileElement Ok_Button;

    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/btnCancel")
    private MobileElement Cancel;

    @iOSFindBy(id = "")
    @AndroidFindBy(id = "com.woolworths.scango:id/errorMessage")
    private MobileElement ManualBarCodeErrorMessage;

    public void EnterBarcodeDetails(String barcode) {
        WebDriverWait wait = new WebDriverWait(Driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(ManualBarCodeIcon));
        ManualBarCodeIcon.click();
        PageHelper.WaitForElement(Driver, ManualBarCodeEntry);
        ManualBarCodeEntry.sendKeys(barcode);
        Ok_Button.click();
    }
}
