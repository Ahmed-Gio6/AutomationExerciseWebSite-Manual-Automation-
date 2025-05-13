package Pages;

import Utilities.TestDataReader;
import Utilities.Waits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.Map;

public class ContactUsPage {

    WebDriver driver;

    public ContactUsPage(WebDriver driver){
        this.driver = driver;
    }
    SoftAssert softAssert = new SoftAssert();

    Map<String, String> data = TestDataReader.getTestData("src/main/resources/ContactData.json");
    private final By inputName           = By.id("input-name");
    private final By inputEmail          = By.id("input-email");
    private final By inputEnquiry        = By.id("input-enquiry");
    private final By SubmitBtn           = By.xpath("//*[@id=\"content\"]/form/div/div/input");
    private final By SuccessMsg          = By.xpath("//*[@id=\"content\"]/p");
    private final By InvalidEmailMsg     = By.className("text-danger");
    private final By InvalidEenquiryMsg  = By.className("text-danger");
    private final By Home_btn       = By.xpath("//a[@href='https://awesomeqa.com/ui/index.php?route=common/home']");

    public void EnterName(String Name){
        driver.findElement(inputName).sendKeys(Name);
    }

    public void EnterEmail(String Email){
        driver.findElement(inputEmail).sendKeys(Email);
    }

    public void EnterEnquiry(String Enquiry){
        driver.findElement(inputEnquiry).sendKeys(Enquiry);
    }

    public void clickSubmitBtn(){
        driver.findElement(SubmitBtn).click();
    }

    public void enterValidContact(){
        EnterName(data.get("ValidName"));
        EnterEmail(data.get("ValidEmail"));
        EnterEnquiry(data.get("ValidEnquiry"));
        clickSubmitBtn();
    }

    public void enterInValidContactEmail(){
        EnterName(data.get("ValidName"));
        EnterEmail(data.get("InValidEmail"));
        EnterEnquiry(data.get("ValidEnquiry"));
        clickSubmitBtn();
    }

    public void enterInValidContactEnquiry(){
        EnterName(data.get("ValidName"));
        EnterEmail(data.get("ValidEmail"));
        EnterEnquiry(data.get("InValidEnquiry"));
        clickSubmitBtn();
    }

    public void clickOnHome(){
        WebElement Home_btnL = Waits.waitForElementToBeClickable(driver, Home_btn);
        Home_btnL.click();
    }

    public void AssertSuccessMsg(){
        softAssert.assertEquals(driver.findElement(SuccessMsg).getText(), "Your enquiry has been successfully sent to the store owner!");
        softAssert.assertEquals(driver.getCurrentUrl(), "https://awesomeqa.com/ui/index.php?route=information/contact/success");
        softAssert.assertAll();
    }

    public void AssertInvalidEmailMsg(){
        softAssert.assertEquals(driver.findElement(InvalidEmailMsg).getText(), "E-Mail Address does not appear to be valid!");
        softAssert.assertNotEquals(driver.getCurrentUrl(), "https://awesomeqa.com/ui/index.php?route=information/contact/success");
        softAssert.assertAll();
    }

    public void AssertInvalidEnquiryMsg(){
        softAssert.assertEquals(driver.findElement(InvalidEenquiryMsg).getText(), "Enquiry must be between 10 and 3000 characters!");
        softAssert.assertNotEquals(driver.getCurrentUrl(), "https://awesomeqa.com/ui/index.php?route=information/contact/success");
        softAssert.assertAll();
    }




}
