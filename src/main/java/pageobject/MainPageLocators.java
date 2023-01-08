package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.junit.Assert.assertEquals;

public class MainPageLocators {


    public MainPageLocators(WebDriver webDriver) {

        this.webDriver = webDriver;
    }

    private final WebDriver webDriver;

    // Кнопка "Заказать" вверху страницы
    private By topOrderButton = By.className("Button_Button__ra12g");
    // Кнопка "Заказать" внизу страницы
    private By lowOrderButton = By.cssSelector("div.Home_FinishButton__1_cWm>button");
    // FAQ. Кнопка "Сколько это стоит? И как оплатить?"
    private By buttonHowMuch = By.id("accordion__heading-0");
    //FAQ. Раскрытие по кнопке "Сколько это стоит? И как оплатить?"
    private By getHowMuchResponseText = By.id("accordion__panel-0");
    // FAQ. Кнопка "Хочу сразу несколько самокатов! Так можно?"
    private By buttonWantSome = By.id("accordion__heading-1");
    //FAQ. Раскрытие по кнопке "Хочу сразу несколько самокатов! Так можно?"
    private By getWantSomeResponseText = By.id("accordion__panel-1");
    // FAQ. Кнопка "Как рассчитывается время аренды?"
    private By buttonHowTheRentalTimeCalculated = By.id("accordion__heading-2");
    //FAQ. Раскрытие по кнопке "Как рассчитывается время аренды?"
    private By getHowTheRentalTimeCalculatedResponseText = By.id("accordion__panel-2");
    // FAQ. Кнопка "Можно ли заказать самокат прямо на сегодня?"
    private By buttonOrderToday = By.id("accordion__heading-3");
    //FAQ. Раскрытие по кнопке "Можно ли заказать самокат прямо на сегодня?"
    private By getOrderTodayResponseText = By.id("accordion__panel-3");
    // FAQ. Кнопка "Можно ли продлить заказ или вернуть самокат раньше?"
    private By buttonExtendTheOrder = By.id("accordion__heading-4");
    //FAQ. Раскрытие по кнопке "Можно ли продлить заказ или вернуть самокат раньше?"
    private By getExtendTheOrderResponseText = By.id("accordion__panel-4");
    // FAQ. Кнопка "Вы привозите зарядку вместе с самокатом?"
    private By buttonChargingWithScooter = By.id("accordion__heading-5");
    //FAQ. Раскрытие по кнопке "Вы привозите зарядку вместе с самокатом?"
    private By getChargingWithScooterResponseText = By.id("accordion__panel-5");
    // FAQ. Кнопка "Можно ли отменить заказ?"
    private By buttonCanICancelTheOrder = By.id("accordion__heading-6");
    //FAQ. Раскрытие по кнопке "Можно ли отменить заказ?"
    private By getCanICancelTheOrderResponseText = By.id("accordion__panel-6");
    // FAQ. Кнопка "Я жизу за МКАДом, привезёте?"
    private By buttonILeaveBehindMKAD = By.id("accordion__heading-7");
    //FAQ. Раскрытие по кнопке "Я жизу за МКАДом, привезёте?"
    private By getILeaveBehindMKADResponseText = By.id("accordion__panel-7");
    // Локатор для закрытия окона с "куками"
    private By closeCookie = By.className("App_CookieButton__3cvqF");

    public void clickCloseCookie() {
        JavascriptExecutor je = (JavascriptExecutor) webDriver;
        je.executeScript("arguments[0].scrollIntoView(true);",webDriver.findElement(closeCookie));
        new WebDriverWait(webDriver, 3).until(ExpectedConditions.elementToBeClickable(closeCookie)).click();
    }


    public void clickTopOrderButton() {
        JavascriptExecutor je = (JavascriptExecutor) webDriver;
        je.executeScript("arguments[0].scrollIntoView(true);",webDriver.findElement(topOrderButton));
        new WebDriverWait(webDriver, 3).until(ExpectedConditions.elementToBeClickable(topOrderButton)).click();
    }
    public void clickLowOrderButton() {
        JavascriptExecutor je = (JavascriptExecutor) webDriver;
        je.executeScript("arguments[0].scrollIntoView(true);",webDriver.findElement(lowOrderButton));
        new WebDriverWait(webDriver, 3).until(ExpectedConditions.elementToBeClickable(lowOrderButton)).click();
    }

    public void clickHowMuch() {
        JavascriptExecutor je = (JavascriptExecutor) webDriver;
        je.executeScript("arguments[0].scrollIntoView(true);",webDriver.findElement(buttonHowMuch));
        new WebDriverWait(webDriver, 3).until(ExpectedConditions.elementToBeClickable(buttonHowMuch)).click();
    }
    public void compareHowMuchText() {
        JavascriptExecutor je = (JavascriptExecutor) webDriver;
        je.executeScript("arguments[0].scrollIntoView(true);",webDriver.findElement(getHowMuchResponseText));
        assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", webDriver.findElement(getHowMuchResponseText).getText());
    }

    public void clickWantSome (){
        JavascriptExecutor je = (JavascriptExecutor) webDriver;
        je.executeScript("arguments[0].scrollIntoView(true);",webDriver.findElement(buttonWantSome));
        new WebDriverWait(webDriver, 3).until(ExpectedConditions.elementToBeClickable(buttonWantSome)).click();
    }
    public void clickHowTheRentalTimeCalculated() {
        JavascriptExecutor je = (JavascriptExecutor) webDriver;
        je.executeScript("arguments[0].scrollIntoView(true);",webDriver.findElement(buttonHowTheRentalTimeCalculated));
        new WebDriverWait(webDriver, 3).until(ExpectedConditions.elementToBeClickable(buttonHowTheRentalTimeCalculated)).click();
    }

    public void compareWantSomeText() {
        JavascriptExecutor je = (JavascriptExecutor) webDriver;
        je.executeScript("arguments[0].scrollIntoView(true);",webDriver.findElement(getWantSomeResponseText));
        assertEquals( "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", webDriver.findElement(getWantSomeResponseText).getText());
    }
    public void compareHowTheRentalTimeCalculatedText() {
        JavascriptExecutor je = (JavascriptExecutor) webDriver;
        je.executeScript("arguments[0].scrollIntoView(true);",webDriver.findElement(getHowTheRentalTimeCalculatedResponseText));
        assertEquals("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", webDriver.findElement(getHowTheRentalTimeCalculatedResponseText).getText());
    }

    public void clickOrderToday() {
        JavascriptExecutor je = (JavascriptExecutor) webDriver;
        je.executeScript("arguments[0].scrollIntoView(true);",webDriver.findElement(buttonOrderToday));
        new WebDriverWait(webDriver, 3).until(ExpectedConditions.elementToBeClickable(buttonOrderToday)).click();
    }
    public void compareOrderTodayText() {
        JavascriptExecutor je = (JavascriptExecutor) webDriver;
        je.executeScript("arguments[0].scrollIntoView(true);",webDriver.findElement(getOrderTodayResponseText));
        assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.", webDriver.findElement(getOrderTodayResponseText).getText());
    }

    public void clickExtendTheOrder() {
        JavascriptExecutor je = (JavascriptExecutor) webDriver;
        je.executeScript("arguments[0].scrollIntoView(true);",webDriver.findElement(buttonExtendTheOrder));
        new WebDriverWait(webDriver, 3).until(ExpectedConditions.elementToBeClickable(buttonExtendTheOrder)).click();
    }
    public void compareExtendTheOrderText() {
        JavascriptExecutor je = (JavascriptExecutor) webDriver;
        je.executeScript("arguments[0].scrollIntoView(true);",webDriver.findElement(getExtendTheOrderResponseText));
        assertEquals("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", webDriver.findElement(getExtendTheOrderResponseText).getText());
    }

    public void clickChargingWithScooter() {
        JavascriptExecutor je = (JavascriptExecutor) webDriver;
        je.executeScript("arguments[0].scrollIntoView(true);",webDriver.findElement(buttonChargingWithScooter));
        new WebDriverWait(webDriver, 3).until(ExpectedConditions.elementToBeClickable(buttonChargingWithScooter)).click();
    }
    public void compareChargingWithScooterText() {
        JavascriptExecutor je = (JavascriptExecutor) webDriver;
        je.executeScript("arguments[0].scrollIntoView(true);",webDriver.findElement(getChargingWithScooterResponseText));
        assertEquals("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", webDriver.findElement(getChargingWithScooterResponseText).getText());
    }

    public void clickCanICancelTheOrder() {
        JavascriptExecutor je = (JavascriptExecutor) webDriver;
        je.executeScript("arguments[0].scrollIntoView(true);",webDriver.findElement(buttonCanICancelTheOrder));
        new WebDriverWait(webDriver, 3).until(ExpectedConditions.elementToBeClickable(buttonCanICancelTheOrder)).click();
    }
    public void compareCanICancelTheOrderText() {
        JavascriptExecutor je = (JavascriptExecutor) webDriver;
        je.executeScript("arguments[0].scrollIntoView(true);",webDriver.findElement(getCanICancelTheOrderResponseText));
        assertEquals("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", webDriver.findElement(getCanICancelTheOrderResponseText).getText());
    }

    public void clickILeaveBehindMKAD() {
        JavascriptExecutor je = (JavascriptExecutor) webDriver;
        je.executeScript("arguments[0].scrollIntoView(true);",webDriver.findElement(buttonILeaveBehindMKAD));
        new WebDriverWait(webDriver, 3).until(ExpectedConditions.elementToBeClickable(buttonILeaveBehindMKAD)).click();
    }
    public void compareILeaveBehindMKADText() {
        JavascriptExecutor je = (JavascriptExecutor) webDriver;
        je.executeScript("arguments[0].scrollIntoView(true);",webDriver.findElement(getILeaveBehindMKADResponseText));
        assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.", webDriver.findElement(getILeaveBehindMKADResponseText).getText());
    }

    public void open(String url) {
        webDriver.get(url);
    }

}