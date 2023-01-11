package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WantOrderLocators {

    public WantOrderLocators(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private final WebDriver webDriver;

    // Форма "Хотите Оформить заказ". Кнопка "Нет"
    private By buttonNo = By.cssSelector("div.Order_Content__bmtHS > div.Order_Modal__YZ-d3 > div.Order_Buttons__1xGrp > button.Button_Button__ra12g.Button_Middle__1CSJM.Button_Inverted__3IF-i");

    // Форма "Хотите Оформить заказ". Кнопка "Да"
    private By buttonYes = By.cssSelector("div.Order_Content__bmtHS > div.Order_Modal__YZ-d3 > div.Order_Buttons__1xGrp > button:nth-child(2)");


    public void clickButtonYes() {
        webDriver.findElement(buttonYes).click();
    }
    public void clickButtonNo() {
        webDriver.findElement(buttonNo).click();
    }

}
