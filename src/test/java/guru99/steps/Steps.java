package guru99.steps;

import guru99.pages.HomePage;
import guru99.pages.PaymentProcesPage;
import guru99.pages.VerifyPaymentPage;
import guru99.utils.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Steps {

    HomePage homePage = new HomePage();
    PaymentProcesPage paymentProcesPage = new PaymentProcesPage();
    VerifyPaymentPage verifyPaymentPage = new VerifyPaymentPage();


    @Given("The user wants to go toy page")
    public void the_user_wants_to_go_toy_page() {
        homePage.clickPaymentGatevay();

    }
    @Then("The user wants to verify toy head as {string}")
    public void the_user_wants_to_verify_toy_head_as(String string) {
        Assert.assertTrue(homePage.getElephantToyHead().getText().equals(string));

    }
    @Then("The user wants to verify the toy price")
    public void the_user_wants_to_verify_the_toy_price() {
        Assert.assertTrue(homePage.getToyPriceVerify().getText().contains("$20"));

    }
    @Then("The user wants to verify the url contains {string}")
    public void the_user_wants_to_verify_the_url_contains(String string) {
       Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(string));
    }
    @Then("The user set the quantity as {string}")
    public void the_user_set_the_quantity_as(String string) throws InterruptedException {
        homePage.setQuantitySelect(string);
    }
    @Then("The user wants click BuyNow button")
    public void the_user_wants_click_buy_now_button() throws InterruptedException {
       homePage.clickBuyNow().click();

    }
    @Then("The user wants verify correct amount as {string}")
    public void the_user_wants_verify_correct_amount_as(String string) {
        Assert.assertTrue(paymentProcesPage.getVerifyPrice().getText().contains(string));
    }
    @Then("The user wants to put credit card info as")
    public void the_user_wants_to_put_credit_card_info_as(Map<String,String> dataTable) {
        paymentProcesPage.setCardNumber("cardNumber");
        paymentProcesPage.setCardMonth("expirationMonth");
        paymentProcesPage.setCardYear("expirationYear");
        paymentProcesPage.setCvvNumber("CVVNumber");

    }
    @Then("The user wants click payButton")
    public void the_user_wants_click_pay_button() {
       paymentProcesPage.clickBuyNowButton();
    }

    @Then("The user wants verify purchase success as {string}")
    public void the_user_wants_verify_purchase_success_as(String string) {
       Assert.assertTrue(verifyPaymentPage.getVerifyPaymentSuccess().equals(string));
    }





}
