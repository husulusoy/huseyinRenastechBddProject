package guru99.pages;

import guru99.utils.CommonUtils;
import guru99.utils.Driver;
import io.cucumber.java.eo.Se;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.security.PublicKey;
import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {
    @FindBy(xpath = "//a[.='Payment Gateway Project']")
    private WebElement paymentGateway;
    public void clickPaymentGatevay(){
        paymentGateway.click();
    }


    @FindBy(xpath = "//h2")
    private WebElement elephantToyHead;
    public WebElement getElephantToyHead(){
    return elephantToyHead;
    }



    @FindBy(xpath = "//h3")
    private  WebElement toyPrice;
    public WebElement getToyPriceVerify(){
        return toyPrice;
    }



    @FindBy(name = "quantity")
    private WebElement quantitySelect;
    public void setQuantitySelect(String string) throws InterruptedException {
        Select selectQuantity =new Select(quantitySelect);
        selectQuantity.selectByValue("5");
        Thread.sleep(7000);



    }
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement buyNowButton;
    public WebElement clickBuyNow() {
        return buyNowButton;

//        buyNowButton.click();
        //Driver.getDriver().findElement(By.xpath("//input[@type='submit']")).click();

//       CommonUtils.clickWithWait(buyNowButton);

    }




}
