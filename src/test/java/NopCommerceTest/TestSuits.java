package NopCommerceTest;

import org.testng.annotations.Test;

public class TestSuits extends BaseTest{
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    JeweleryPage jeweleryPage= new JeweleryPage();
    JeweleryComparisionPage jeweleryComparisionPage = new JeweleryComparisionPage();
    WishListPage wishListPage = new WishListPage();
    ComputerPage computerPage= new ComputerPage();
    DesktopPage desktopPage = new DesktopPage();
    EmailWishList emailWishList = new EmailWishList();
    ElectronicPage electronicPage = new ElectronicPage();
    CameraPhotosPage cameraPhotosPage = new CameraPhotosPage();
    LoginPage loginPage = new LoginPage();
    ReferProduct referProduct = new ReferProduct();
    HomePage homePage=new HomePage();
    BookPage bookPage=new BookPage();
    CartPage cartPage=new CartPage();
    CheckoutAsGuest checkoutAsGuest=new CheckoutAsGuest();
    FillCheckoutDetails fillCheckoutDetails=new FillCheckoutDetails();
    CheckoutResult checkoutResult=new CheckoutResult();
    NewsPage newsPage=new NewsPage();
    NewOnlineStoreIsOpenPage newOnlineStoreIsOpenPage=new NewOnlineStoreIsOpenPage();



    @Test
    public void userShouldAbleToRegisterSuccessfully()
    {
        //click on Register Button
        homePage.clickOnRegisterButton();
        //verify user on Registration page
        registrationPage.verifyUserIsOnRegistrationPage();
        //fill up registration details
        registrationPage.userEnterRegistrationDetails();
        //verify registration success message
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
    }
    @Test
    public void userShouldAbleToCompareTwoDifferentProductSuccessfully()
    {
        //calling method to click on jewelery
        homePage.clickOnJewelery();
        jeweleryPage.verifyUserOnJeweleryPage();
        //calling method to compare product from jeweleryPage
        jeweleryPage.chooseProductToCompare();
        jeweleryComparisionPage.verifyUserIsOnJeweleryComparisionPage();

    }
    @Test
    public void registeredUserShouldAbleToReferProductToFriend()
    {
        homePage.clickOnLogin();
        loginPage.userEnterLoginDetails();

        homePage.clickOnComputer();
        computerPage.clickOnDesktop();
        desktopPage.userSelectItemToReferFriend();
        //calling method to click on email to friend
        referProduct.emailProduct();

        emailWishList.enterEmailAddressOfFriend();
        emailWishList.sendEmailToFriend();
        emailWishList.verifyUserSeeEmailSentMessage();
    }
    @Test
    public void notRegisteredUserCanNotReferItemToFriend()
    {
        homePage.clickOnComputer();
        computerPage.clickOnDesktop();
        desktopPage.userSelectItemToReferFriend();
        referProduct.emailProduct();
        emailWishList.enterEmailAddressOfFriend();

        //calling method to click on send email
        emailWishList.sendEmailToFriend();
        //verify user see error message
        emailWishList.verifyNotRegisterUserSeeErrorMessage();
    }
    @Test
    public void userShouldAbleToSortProductHighToLowByPrice()
    {
        homePage.clickOnElectronics();
        electronicPage.clickOnCameraAndPhotos();
        cameraPhotosPage.useSelectFromPositionPriceHighToLow();
        cameraPhotosPage.pricesFromElement();
    }

    @Test
    public void verifyGuestUserShouldAbleToCheckoutSuccessfully()
    {

        homePage.clickOnBooksLink();

        bookPage.clickOnAddToCart();

        bookPage.clickOnShoppingCart();

        cartPage.checkTermsAndCondition();

        cartPage.clickOnCheckout();

        checkoutAsGuest.clickOnCheckoutAsGuest();

        fillCheckoutDetails.fillCheckoutDetails();

        checkoutResult.verifyCheckoutSuccessMessage();
    }
    @Test
    public void userShouldAbleToAddNewCommentOnNopCommerceWebsite()
    {
        //To click on view news archive
        homePage.ClickOnViewNewsArchive();
        //To click on details
        newsPage.clickOnDetails();
        //To add new comment
        newOnlineStoreIsOpenPage.addNewComment();
        //To verify New comment added
        newOnlineStoreIsOpenPage.verifySuccessMessageOfComment();
    }
    @Test
    public void userShouldAbleToChangeCurrency()
    {
        //To click on currency euro
        homePage.clickCurrencyEuro();
        //To verify Euro sign
        homePage.VerifyPriceHasEuroSign();
        //To click on currency dollar
        homePage.clickCurrencyDollar();
        //To verify Dollar sign
        homePage.VerifyPriceHasDollarSign();
    }
    @Test
    public void verifyAddToCartButtonIsPresentOnAllFeaturedProducts()
    {
        //To verify add to cart is present in all featured products
        homePage.verifyAddToCartPresentOnHomepageFeaturedItems();

    }

}
