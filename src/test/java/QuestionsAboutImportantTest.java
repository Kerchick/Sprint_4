import org.junit.Test;
import pageobject.MainPageLocators;


public class QuestionsAboutImportantTest extends TestBase {
    private static final String url = "https://qa-scooter.praktikum-services.ru/";

    @Test
    public void questionsAboutImportant() {
        MainPageLocators mainPageLocators = new MainPageLocators(driver);
        mainPageLocators.open(url);


        mainPageLocators.clickHowMuch();
        mainPageLocators.compareHowMuchText();

        mainPageLocators.clickWantSome();
        mainPageLocators.compareWantSomeText();

        mainPageLocators.clickHowTheRentalTimeCalculated();
        mainPageLocators.compareHowTheRentalTimeCalculatedText();

        mainPageLocators.clickOrderToday();
        mainPageLocators.compareOrderTodayText();

        mainPageLocators.clickExtendTheOrder();
        mainPageLocators.compareExtendTheOrderText();

        mainPageLocators.clickChargingWithScooter();
        mainPageLocators.compareChargingWithScooterText();

        mainPageLocators.clickCanICancelTheOrder();
        mainPageLocators.compareCanICancelTheOrderText();

        mainPageLocators.clickILeaveBehindMKAD();
        mainPageLocators.compareILeaveBehindMKADText();
    }


}