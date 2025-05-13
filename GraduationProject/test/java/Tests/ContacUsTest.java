package Tests;

import Base.TestBase;
import Pages.AddToCartPage;
import Pages.ContactUsPage;
import Pages.HomePage;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class ContacUsTest extends TestBase {
    HomePage homePage;
    ContactUsPage contactUsPage ;


    @Description("Validate that user can Contact To Owner With Valid data")
    @Test
    public void validateContactToOwner(){
        homePage = new HomePage(driver);
        contactUsPage = new ContactUsPage(driver);
        homePage.goToContact();
        contactUsPage.enterValidContact();
        contactUsPage.AssertSuccessMsg();
        contactUsPage.clickOnHome();
    }

    @Description("Validate that user can't Contact To Owner With Invalid Email")
    @Test
    public void validateContactToOwnerWithInvalidEmail(){
        homePage = new HomePage(driver);
        contactUsPage = new ContactUsPage(driver);
        homePage.goToContact();
        contactUsPage.enterInValidContactEmail();
        contactUsPage.AssertInvalidEmailMsg();
        contactUsPage.clickOnHome();
    }

    @Description("Validate that user can't Contact To Owner With Invalid Enquiry")
    @Test
    public void validateContactToOwnerWithInvalidEnqiry(){
        homePage = new HomePage(driver);
        contactUsPage = new ContactUsPage(driver);
        homePage.goToContact();
        contactUsPage.enterInValidContactEnquiry();
        contactUsPage.AssertInvalidEnquiryMsg();
        contactUsPage.clickOnHome();
    }
}
