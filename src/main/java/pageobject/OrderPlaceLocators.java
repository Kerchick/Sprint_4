package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;
public class OrderPlaceLocators {

    public OrderPlaceLocators(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private final WebDriver webDriver;


    // Локатор для проверки что заказ оформлен
    private By orderPlace = By.xpath("/html/body/div/div/div[2]/div[5]/div[1]");

    public void isOrderPlaceImageIsDisable() {
        assertEquals("Заказ оформлен\n" +
                "Номер заказа: .  Запишите его:\n" +
                "пригодится, чтобы отслеживать статус", webDriver.findElement(orderPlace).getText());
    }
}


