package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WantOrderLocators {

    public WantOrderLocators(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private final WebDriver webDriver;

    // Форма "Хотите Оформить заказ". Кнопка "Нет"
    private By buttonNo = By.xpath("//div/div[2]/div[5]/div[2]/button[1]");

    // Форма "Хотите Оформить заказ". Кнопка "Да"
    private By buttonYes = By.xpath("//div/div[2]/div[5]/div[2]/button[2]");


    public void clickButtonYes() {
        webDriver.findElement(buttonYes).click();
    }
    public void clickButtonNo() {
        webDriver.findElement(buttonNo).click();
    }

}
