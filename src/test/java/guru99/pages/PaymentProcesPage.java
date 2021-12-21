package guru99.pages;

import guru99.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class PaymentProcesPage {
    @FindBy(xpath = "//div[@class='6u 12u$(xsmall)']/font[2]")
    private WebElement verifyPrice;
    public WebElement getVerifyPrice(){
        return verifyPrice;



    }
    @FindBy(id = "card_nmuber")
    private WebElement cardNumber;
    public void setCardNumber(String data){
        cardNumber.sendKeys(data);
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @FindBy(id = "month")
    private WebElement cardMonth;
    public void setCardMonth(String data){
        cardMonth.sendKeys(data);
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @FindBy(id="year")
    private WebElement cardYear;
    public void setCardYear(String data){
        cardYear.sendKeys(data);
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @FindBy(id= "cvv_code")
    private WebElement cvvNumber;
    public void setCvvNumber(String data){
        cvvNumber.sendKeys(data);
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }
    @FindBy(name = "submit")
    private WebElement buyNowButton;
    public void clickBuyNowButton(){
        buyNowButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
}
