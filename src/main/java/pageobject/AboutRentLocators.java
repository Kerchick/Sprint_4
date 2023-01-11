package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutRentLocators {

    public AboutRentLocators(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private final WebDriver webDriver;


    // Форма "Про аренду". Когда привезти самокат
    private By sendKeysWhenBringScooter = By.cssSelector("div.react-datepicker-wrapper > div > input");
    // Локатор клика в календаре
    private By clickWhenBringScooter = By.cssSelector("div.react-datepicker__day.react-datepicker__day--020");

    // Форма "Про аренду". Срок аренды
    private By daysRent = By.cssSelector("div.Dropdown-placeholder");
    // Локатор выбора срока аренды (2дня)
    private By twoDays = By.cssSelector("div.Dropdown-menu > div:nth-child(2)");

    // Форма "Про аренду". Цвет самоката
    private By scooterColor = By.cssSelector("div > div.Order_Content__bmtHS > div.Order_Form__17u6u > div.Order_Checkboxes__3lWSI > label:nth-child(4)");

    // Форма "Про аренду". Комментарий курьеру
    private By commentToCourier = By.cssSelector("div.Order_Content__bmtHS > div.Order_Form__17u6u > div.Input_InputContainer__3NykH > input");

    // Форма "Про аренду". Кнопка "Назад"
    private By buttonBack = By.cssSelector("div.Order_Buttons__1xGrp > button.Button_Button__ra12g.Button_Middle__1CSJM.Button_Inverted__3IF-i");

    // Форма "Про аренду". Кнопка "Заказать"
    private By buttonOrder = By.cssSelector("div.Order_Buttons__1xGrp > button:nth-child(2)");





    public void whenBringScooter(String date) {
        webDriver.findElement(sendKeysWhenBringScooter).sendKeys(date);
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