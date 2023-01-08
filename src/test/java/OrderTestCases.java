import org.junit.Test;
import pageobject.*;

public class OrderTestCases extends TestBase{

    private static final String url = "https://qa-scooter.praktikum-services.ru/";
    private final String name = "Кирилл";
    private final String engName = "Kirill";
    private final String surname = "Пресняков";
    private final String engSurname = "Presniakov";
    private final String address = "Москва, 3й Спарведливый пр-д, д 46";
    private final String phone = "+79858885458";
    private final String date = "12.12.2023";
    private final String comment = "Позвонить за 10 минут до приезда";

    @Test
    public void topOrderButtonValidValues(){
        MainPageLocators mainPageLocators = new MainPageLocators(driver);
        ForWhoScooterLocators forWhoScooterLocators = new ForWhoScooterLocators(driver);
        AboutRentLocators aboutRentLocators = new AboutRentLocators(driver);
        WantOrderLocators wantOrderLocators = new WantOrderLocators(driver);
        OrderPlaceLocators orderPlaceLocator = new OrderPlaceLocators(driver);


        mainPageLocators.open(url);
        mainPageLocators.clickTopOrderButton();
        mainPageLocators.clickCloseCookie();

        forWhoScooterLocators.sendKeysName(name);
        forWhoScooterLocators.sendKeysSurname(surname);
        forWhoScooterLocators.sendKeysAddress(address);
        forWhoScooterLocators.clickMetroStation();
        forWhoScooterLocators.isDisplayedSelectMetroStation();
        forWhoScooterLocators.chooseMetroStation();
        forWhoScooterLocators.sendKeysPhoneNumber(phone);
        forWhoScooterLocators.clickButtonNext();

        aboutRentLocators.WhenBringScooter(date);
        aboutRentLocators.clickWhenBringScooter();
        aboutRentLocators.clickDaysRent();
        aboutRentLocators.clickTwoDaysRent();
        aboutRentLocators.selectColor();
        aboutRentLocators.sendCommentToCourier(comment);
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


        mainPageLocators.open(url);
        mainPageLocators.clickTopOrderButton();
        mainPageLocators.clickCloseCookie();

        forWhoScooterLocators.sendKeysName(engName);
        forWhoScooterLocators.sendKeysSurname(engSurname);
        forWhoScooterLocators.sendKeysAddress(address);
        forWhoScooterLocators.clickMetroStation();
        forWhoScooterLocators.isDisplayedSelectMetroStation();
        forWhoScooterLocators.chooseMetroStation();
        forWhoScooterLocators.sendKeysPhoneNumber(phone);
        forWhoScooterLocators.clickButtonNext();

        aboutRentLocators.WhenBringScooter(date);
        aboutRentLocators.clickWhenBringScooter();
        aboutRentLocators.clickDaysRent();
        aboutRentLocators.clickTwoDaysRent();
        aboutRentLocators.selectColor();
        aboutRentLocators.sendCommentToCourier(comment);
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


        mainPageLocators.open(url);
        mainPageLocators.clickCloseCookie();
        mainPageLocators.clickLowOrderButton();


        forWhoScooterLocators.sendKeysName(name);
        forWhoScooterLocators.sendKeysSurname(surname);
        forWhoScooterLocators.sendKeysAddress(address);
        forWhoScooterLocators.clickMetroStation();
        forWhoScooterLocators.isDisplayedSelectMetroStation();
        forWhoScooterLocators.chooseMetroStation();
        forWhoScooterLocators.sendKeysPhoneNumber(phone);
        forWhoScooterLocators.clickButtonNext();

        aboutRentLocators.WhenBringScooter(date);
        aboutRentLocators.clickWhenBringScooter();
        aboutRentLocators.clickDaysRent();
        aboutRentLocators.clickTwoDaysRent();
        aboutRentLocators.selectColor();
        aboutRentLocators.sendCommentToCourier(comment);
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


        mainPageLocators.open(url);
        mainPageLocators.clickLowOrderButton();
        mainPageLocators.clickCloseCookie();

        forWhoScooterLocators.sendKeysName(engName);
        forWhoScooterLocators.sendKeysSurname(engSurname);
        forWhoScooterLocators.sendKeysAddress(address);
        forWhoScooterLocators.clickMetroStation();
        forWhoScooterLocators.isDisplayedSelectMetroStation();
        forWhoScooterLocators.chooseMetroStation();
        forWhoScooterLocators.sendKeysPhoneNumber(phone);
        forWhoScooterLocators.clickButtonNext();

        aboutRentLocators.WhenBringScooter(date);
        aboutRentLocators.clickWhenBringScooter();
        aboutRentLocators.clickDaysRent();
        aboutRentLocators.clickTwoDaysRent();
        aboutRentLocators.selectColor();
        aboutRentLocators.sendCommentToCourier(comment);
        aboutRentLocators.clickButtonOrder();

        wantOrderLocators.clickButtonYes();

        orderPlaceLocator.isOrderPlaceImageIsDisable();

    }



}



