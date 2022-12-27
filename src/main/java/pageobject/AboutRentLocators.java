package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutRentLocators {

    public AboutRentLocators(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private final WebDriver webDriver;


    // Форма "Про аренду". Когда привезти самокат
    private By sendKeysWhenBringScooter = By.xpath("//div/div[2]/div[2]/div[1]/div[1]/div/input");
    // Локатор клика в календаре
    private By clickWhenBringScooter = By.xpath("//div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[6]");

    // Форма "Про аренду". Срок аренды
    private By daysRent = By.xpath("//div/div[2]/div[2]/div[2]/div");
    // Локатор выбора срока аренды (2дня)
    private By twoDays = By.xpath("//div/div[2]/div[2]/div[2]/div[2]/div[2]");

    // Форма "Про аренду". Цвет самоката
    private By scooterColor = By.xpath("//div/div[2]/div[2]/div[3]/label[2]");

    // Форма "Про аренду". Комментарий курьеру
    private By commentToCourier = By.xpath("//div/div[2]/div[2]/div[4]/input");

    // Форма "Про аренду". Кнопка "Назад"
    private By buttonBack = By.xpath("/div/div[2]/div[3]/button[1]");

    // Форма "Про аренду". Кнопка "Заказать"
    private By buttonOrder = By.xpath("//div/div[2]/div[3]/button[2]");





    public void WhenBringScooter() {
        webDriver.findElement(sendKeysWhenBringScooter).sendKeys("31.12.2022");
    }
    public void clickButtonOrder() {
        webDriver.findElement(buttonOrder).click();
    }
    public void clickButtonBack() {
        webDriver.findElement(buttonBack).click();
    }
    public void sendCommentToCourier(String comment) {
        webDriver.findElement(commentToCourier).sendKeys(comment);
    }
    public void selectColor() {
        webDriver.findElement(scooterColor).click();
    }
    public void clickTwoDaysRent() {
        webDriver.findElement(twoDays).click();
    }
    public void clickDaysRent() {
        webDriver.findElement(daysRent).click();
    }
    public void clickWhenBringScooter() {
        webDriver.findElement(clickWhenBringScooter).click();
    }
}