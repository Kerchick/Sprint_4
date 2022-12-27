package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForWhoScooterLocators {



    public ForWhoScooterLocators(WebDriver webDriver) {

        this.webDriver = webDriver;
    }
    private final WebDriver webDriver;


    // Форма "Для кого самокат". Имя
    private By yourName = By.xpath("//div/div[2]/div[2]/div[1]/input");

    // Форма "Для кого самокат". Фамилия
    private By yourSurname = By.xpath("//div/div[2]/div[2]/div[2]/input");

    // Форма "Для кого самокат". Адрес куда привезти
    private By addressDelivery = By.xpath("//div/div[2]/div[2]/div[3]/input");

    // Форма "Для кого самокат". Станция метро
    private By clickMetroStation = By.className("select-search__input");
    // Локатор отображения выбора метро
    private By isDispalayedSelectMetroStation = By.className("select-search__select");
    // Локатор выбора станции метро
    private By chooseMetroStation = By.xpath("//div/div[2]/div[2]/div[4]/div/div[2]/ul/li[1]");

    // Форма "Для кого самокат". Телефон
    private By phoneNumber = By.xpath("//div/div[2]/div[2]/div[5]/input");

    // Форма "Для кого самокат". Кнопка "Далее"
    private By buttonNext = By.xpath("//div/div[2]/div[3]/button");



    public void sendKeysName(String name) {
        webDriver.findElement(yourName).sendKeys(name);
    }
    public void sendKeysSurname(String surname) {
        webDriver.findElement(yourSurname).sendKeys(surname);
    }
    public void sendKeysAddress(String address) {
        webDriver.findElement(addressDelivery).sendKeys(address);
    }
    public void clickMetroStation() {
        webDriver.findElement(clickMetroStation).click();
    }
    public void isDisplayedSelectMetroStation() {
        webDriver.findElement(isDispalayedSelectMetroStation).isDisplayed();
    }
    public void chooseMetroStation() {
        webDriver.findElement(chooseMetroStation).click();
    }
    public void sendKeysPhoneNumber(String phone){
        webDriver.findElement(phoneNumber).sendKeys(phone);
    }
    public void clickButtonNext() {
        new WebDriverWait(webDriver, 3).until(ExpectedConditions.elementToBeClickable(buttonNext)).click();
    }
}
