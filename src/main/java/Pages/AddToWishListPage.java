package Pages;

import Utilities.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class AddToWishListPage {

    private final WebDriver driver;


    public AddToWishListPage(WebDriver driver) {
        this.driver = driver;

    }


    // Locators

    private final By IphoneItem     = By.xpath("//div[@class='caption']//a[text()='iPhone' and @href='https://awesomeqa.com/ui/index.php?route=product/product&product_id=40']");
    private final By MacBook        = By.xpath("//div[@class='caption']//a[@href='https://awesomeqa.com/ui/index.php?route=product/product&product_id=43']");
    private final By SuccessMsg     = By.cssSelector("div.alert.alert-success.alert-dismissible");
    private final By Home_btn       = By.xpath("//a[@href='https://awesomeqa.com/ui/index.php?route=common/home']");
    private final By AddWishListBtn = By.xpath("//button[contains(@class, 'btn btn-default') and @data-original-title='Add to Wish List']");
    private final By WishListCart   = By.id("wishlist-total");
    private final By ItemModel1     = By.cssSelector("div[class=\"table-responsive\"] img[src=\"https://awesomeqa.com/ui/image/cache/catalog/demo/iphone_1-47x47.jpg\"]");
    private final By ItemModel2     = By.cssSelector("div[class=\"table-responsive\"] img[src=\"https://awesomeqa.com/ui/image/cache/catalog/demo/macbook_1-47x47.jpg\"]");

    public void clickOnHome(){
        WebElement Home_btnL = Waits.waitForElementToBeClickable(driver, Home_btn);
        Home_btnL.click();
    }

    public void AddToWishListViewProduct(By product){
        driver.findElement(product).click();
    }
    public void addToWishListClick() {
        driver.findElement(AddWishListBtn).click();
    }

    public void AddIphoneToWishList(){
        AddToWishListViewProduct(IphoneItem);
        addToWishListClick();
        AddToWishListCheckIphoneMsg();
    }

    public void AddMacBookToWishList(){
        AddToWishListViewProduct(MacBook);
        addToWishListClick();
        AddToWishListCheckMacBookMsg();
    }

    public void WishListCartView(){
        driver.findElement(WishListCart).click();
        Assert.assertTrue(driver.findElement(ItemModel1).isDisplayed(),"Iphone is not displayed in shopping cart." );
    }

    public void WishListCartView2(){
        driver.findElement(WishListCart).click();
        Assert.assertTrue(driver.findElement(ItemModel1).isDisplayed(),"Iphone is not displayed in shopping cart." );
        Assert.assertTrue(driver.findElement(ItemModel2).isDisplayed(),"MacBook is not displayed in shopping cart." );

    }

    public void addMoreProductToWishList(){
        AddIphoneToWishList();
        clickOnHome();
        AddMacBookToWishList();
    }


    //Assert

    public void AddToWishListCheckIphoneMsg() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        WebElement loggedInElement = wait.until(ExpectedConditions.visibilityOfElementLocated(SuccessMsg));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(loggedInElement.isDisplayed(), "Success: You have added iPhone to your wish list!");
        softAssert.assertAll();
        clickOnHome();
    }

    public void AddToWishListCheckMacBookMsg() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        WebElement loggedInElement = wait.until(ExpectedConditions.visibilityOfElementLocated(SuccessMsg));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(loggedInElement.isDisplayed(), "Success: You have added MacBook to your wish list!");
        softAssert.assertAll();
        clickOnHome();
    }


}
