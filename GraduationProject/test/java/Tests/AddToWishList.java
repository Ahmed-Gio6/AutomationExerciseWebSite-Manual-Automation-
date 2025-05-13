package Tests;

import Base.TestBase;
import Pages.AddToCartPage;
import Pages.AddToWishListPage;
import Pages.HomePage;
import Pages.LoginPage;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class AddToWishList extends TestBase {

    LoginPage loginPage ;
    HomePage homePage;
    AddToWishListPage addToWishListPage ;
    @Description("Validate that user can Add Product To WishList")
    @Test
    public void validateAddProductToCart(){
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        addToWishListPage=new AddToWishListPage(driver);
        homePage.navigate();
        homePage.goToLogin();
        loginPage.loginSuccessfully();
        addToWishListPage.clickOnHome();
        addToWishListPage.AddIphoneToWishList();
        addToWishListPage.WishListCartView();
        homePage.ContinueToRegister();
    }

    @Description("Validate that user can Add More Product To WishList")
    @Test
    public void validateAddMoreProductToCart(){
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        addToWishListPage=new AddToWishListPage(driver);
        homePage.navigate();
        homePage.goToLogin();
        loginPage.loginSuccessfully();
        addToWishListPage.clickOnHome();
        addToWishListPage.addMoreProductToWishList();
        addToWishListPage.WishListCartView2();
        homePage.ContinueToRegister();
    }
}
