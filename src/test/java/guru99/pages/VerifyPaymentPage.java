package guru99.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyPaymentPage {
    @FindBy(xpath = "//h2")
    private WebElement verifyPaymentSuccess;
    public WebElement getVerifyPaymentSuccess(){
        return verifyPaymentSuccess;
    }
}
