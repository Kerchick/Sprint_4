import org.junit.Test;
import pageobject.MainPageLocators;


public class QuestionsAboutImportantTest extends TestBase {
    private static final String url = "https://qa-scooter.praktikum-services.ru/";

    @Test
    public void clickAndCompareHowMuch() {
        MainPageLocators mainPageLocators = new MainPageLocators(driver);
        mainPageLocators.open(url);

        mainPageLocators.clickHowMuch();
        mainPageLocators.compareHowMuchText();
    }

    @Test
    public void clickAndCompareWantSome() {
        MainPageLocators mainPageLocators = new MainPageLocators(driver);
        mainPageLocators.open(url);

        mainPageLocators.clickWantSome();
        mainPageLocators.compareWantSomeText();
    }
    @Test
    public void clickAndCompareHowTheRentalTimeCalculated() {
        MainPageLocators mainPageLocators = new MainPageLocators(driver);
        mainPageLocators.open(url);

        mainPageLocators.clickHowTheRentalTimeCalculated();
        mainPageLocators.compareHowTheRentalTimeCalculatedText();
    }
    @Test
    public void clickAndCompareOrderToday() {
        MainPageLocators mainPageLocators = new MainPageLocators(driver);
        mainPageLocators.open(url);

        mainPageLocators.clickOrderToday();
        mainPageLocators.compareOrderTodayText();
    }
    @Test
    public void clickAndCompareExtendTheOrder() {
        MainPageLocators mainPageLocators = new MainPageLocators(driver);
        mainPageLocators.open(url);

        mainPageLocators.clickExtendTheOrder();
        mainPageLocators.compareExtendTheOrderText();
    }
    @Test
    public void clickAndCompareChargingWithScooter() {
        MainPageLocators mainPageLocators = new MainPageLocators(driver);
        mainPageLocators.open(url);

        mainPageLocators.clickChargingWithScooter();
        mainPageLocators.compareChargingWithScooterText();
    }
    @Test
    public void clickAndCompareCanICancelTheOrder() {
        MainPageLocators mainPageLocators = new MainPageLocators(driver);
        mainPageLocators.open(url);

        mainPageLocators.clickCanICancelTheOrder();
        mainPageLocators.compareCanICancelTheOrderText();
    }
    @Test
    public void clickAndCompareILeaveBehindMKAD() {
        MainPageLocators mainPageLocators = new MainPageLocators(driver);
        mainPageLocators.open(url);

        mainPageLocators.clickILeaveBehindMKAD();
        mainPageLocators.compareILeaveBehindMKADText();
    }
}