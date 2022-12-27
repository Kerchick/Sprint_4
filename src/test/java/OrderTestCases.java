import org.junit.Test;
import pageobject.*;

public class OrderTestCases extends TestBase{

    @Test
    public void topOrderButtonValidValues(){
        MainPageLocators mainPageLocators = new MainPageLocators(driver);
        ForWhoScooterLocators forWhoScooterLocators = new ForWhoScooterLocators(driver);
        AboutRentLocators aboutRentLocators = new AboutRentLocators(driver);
        WantOrderLocators wantOrderLocators = new WantOrderLocators(driver);
        OrderPlaceLocators orderPlaceLocator = new OrderPlaceLocators(driver);


        mainPageLocators.open();
        mainPageLocators.clickTopOrderButton();
        mainPageLocators.clickCloseCookie();

        forWhoScooterLocators.sendKeysName("Пресняков");
        forWhoScooterLocators.sendKeysSurname("Кирилл");
        forWhoScooterLocators.sendKeysAddress("Москва, ул Пушкина, д Колотушкина");
        forWhoScooterLocators.clickMetroStation();
        forWhoScooterLocators.isDisplayedSelectMetroStation();
        forWhoScooterLocators.chooseMetroStation();
        forWhoScooterLocators.sendKeysPhoneNumber("+79858885458");
        forWhoScooterLocators.clickButtonNext();

        aboutRentLocators.WhenBringScooter();
        aboutRentLocators.clickWhenBringScooter();
        aboutRentLocators.clickDaysRent();
        aboutRentLocators.clickTwoDaysRent();
        aboutRentLocators.selectColor();
        aboutRentLocators.sendCommentToCourier("Позвонить за 10 минут до приезда");
        aboutRentLocators.clickButtonOrder();

        wantOrderLocators.clickButtonYes();

        orderPlaceLocator.isOrderPlaceImageIsDisable();

    }

    @Test
    public void topOrderButtonInvalidValues(){
        MainPageLocators mainPageLocators = new MainPageLocators(driver);
        ForWhoScooterLocators forWhoScooterLocators = new ForWhoScooterLocators(driver);
        AboutRentLocators aboutRentLocators = new AboutRentLocators(driver);
        WantOrderLocators wantOrderLocators = new WantOrderLocators(driver);
        OrderPlaceLocators orderPlaceLocator = new OrderPlaceLocators(driver);


        mainPageLocators.open();
        mainPageLocators.clickTopOrderButton();
        mainPageLocators.clickCloseCookie();

        forWhoScooterLocators.sendKeysName("Anna");
        forWhoScooterLocators.sendKeysSurname("Dicaprio");
        forWhoScooterLocators.sendKeysAddress("Москва, 3й Спарведливый пр-д, д 46");
        forWhoScooterLocators.clickMetroStation();
        forWhoScooterLocators.isDisplayedSelectMetroStation();
        forWhoScooterLocators.chooseMetroStation();
        forWhoScooterLocators.sendKeysPhoneNumber("89858885458");
        forWhoScooterLocators.clickButtonNext();

        aboutRentLocators.WhenBringScooter();
        aboutRentLocators.clickWhenBringScooter();
        aboutRentLocators.clickDaysRent();
        aboutRentLocators.clickTwoDaysRent();
        aboutRentLocators.selectColor();
        aboutRentLocators.sendCommentToCourier("");
        aboutRentLocators.clickButtonOrder();

        wantOrderLocators.clickButtonYes();

        orderPlaceLocator.isOrderPlaceImageIsDisable();

    }

    @Test
    public void lowOrderButtonValidValues(){
        MainPageLocators mainPageLocators = new MainPageLocators(driver);
        ForWhoScooterLocators forWhoScooterLocators = new ForWhoScooterLocators(driver);
        AboutRentLocators aboutRentLocators = new AboutRentLocators(driver);
        WantOrderLocators wantOrderLocators = new WantOrderLocators(driver);
        OrderPlaceLocators orderPlaceLocator = new OrderPlaceLocators(driver);


        mainPageLocators.open();
        mainPageLocators.clickCloseCookie();
        mainPageLocators.clickLowOrderButton();


        forWhoScooterLocators.sendKeysName("Пресняков");
        forWhoScooterLocators.sendKeysSurname("Кирилл");
        forWhoScooterLocators.sendKeysAddress("Москва, ул Пушкина, д Колотушкина");
        forWhoScooterLocators.clickMetroStation();
        forWhoScooterLocators.isDisplayedSelectMetroStation();
        forWhoScooterLocators.chooseMetroStation();
        forWhoScooterLocators.sendKeysPhoneNumber("+79858885458");
        forWhoScooterLocators.clickButtonNext();

        aboutRentLocators.WhenBringScooter();
        aboutRentLocators.clickWhenBringScooter();
        aboutRentLocators.clickDaysRent();
        aboutRentLocators.clickTwoDaysRent();
        aboutRentLocators.selectColor();
        aboutRentLocators.sendCommentToCourier("Позвонить за 10 минут до приезда");
        aboutRentLocators.clickButtonOrder();

        wantOrderLocators.clickButtonYes();

        orderPlaceLocator.isOrderPlaceImageIsDisable();

    }

    @Test
    public void lowOrderButtonInvalidValues(){
        MainPageLocators mainPageLocators = new MainPageLocators(driver);
        ForWhoScooterLocators forWhoScooterLocators = new ForWhoScooterLocators(driver);
        AboutRentLocators aboutRentLocators = new AboutRentLocators(driver);
        WantOrderLocators wantOrderLocators = new WantOrderLocators(driver);
        OrderPlaceLocators orderPlaceLocator = new OrderPlaceLocators(driver);


        mainPageLocators.open();
        mainPageLocators.clickLowOrderButton();
        mainPageLocators.clickCloseCookie();

        forWhoScooterLocators.sendKeysName("Anna");
        forWhoScooterLocators.sendKeysSurname("Dicaprio");
        forWhoScooterLocators.sendKeysAddress("Москва, 3й Спарведливый пр-д, д 46");
        forWhoScooterLocators.clickMetroStation();
        forWhoScooterLocators.isDisplayedSelectMetroStation();
        forWhoScooterLocators.chooseMetroStation();
        forWhoScooterLocators.sendKeysPhoneNumber("89858885458");
        forWhoScooterLocators.clickButtonNext();

        aboutRentLocators.WhenBringScooter();
        aboutRentLocators.clickWhenBringScooter();
        aboutRentLocators.clickDaysRent();
        aboutRentLocators.clickTwoDaysRent();
        aboutRentLocators.selectColor();
        aboutRentLocators.sendCommentToCourier("");
        aboutRentLocators.clickButtonOrder();

        wantOrderLocators.clickButtonYes();

        orderPlaceLocator.isOrderPlaceImageIsDisable();

    }



}



