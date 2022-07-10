package ru.yandex.praktikum.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderPage {
    // Объект драйвера
    private final WebDriver driver;
    // Поле ввода Имя
    private final By nameField = By.xpath("//input[@placeholder='* Имя']");
    // Поле ввода Фамилия
    private final By surnameField = By.xpath("//input[@placeholder='* Фамилия']");
    // Поле ввода Адрес
    private final By addressField = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    // Поле ввода Станция метро
    private final By metroStationField = By.className("select-search__input");
    // Результат поиска по значению станции метро
    private final By metroStationSearchResult = By.xpath("//ul[@class='select-search__options']/li[1]/button");
    // Поле ввода Телефон
    private final By phoneNumberField = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    // Кнопка Далее
    private final By nextButton = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Далее']");
    // Поле ввода даты Когда привезти самокат
    private final By dateField = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    // Выпадающий список Срок аренды
    private final By rentTermField = By.className("Dropdown-arrow");
    // Значение выпадающего списка Срок аренды
    private final String rentTermFieldValue = "//div[@class='Dropdown-option' and text()='%s']";
    // Чек-бокс Цвет самоката
    private final String colorCheckBox = "//label[@for='%s']";
    // Поле ввода Комментарий для курьера
    private final By commentField = By.xpath("//input[@placeholder='Комментарий для курьера']");
    // Кнопка Заказать в форме заказа
    private final By orderButton = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']");
    // Окно подтверждения заказа
    private final By confirmOrderWindow = By.className("Order_Modal__YZ-d3");
    // Кнопка Да в окне подтверждения заказа
    private final By confirmButton = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']");
    // Номер заказа
    private final By orderText = By.className("Order_Text__2broi");
    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }
    // заполнение полей
    public void setName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public  void setSurname(String surname) {
        driver.findElement(surnameField).sendKeys(surname);
    }

    public void setAddress(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    public void setMetroStation(String metroStation) {
        driver.findElement(metroStationField).sendKeys(metroStation);
        driver.findElement(metroStationSearchResult).click();
    }

    public void setPhoneNumber(String phoneNumber) {
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
    }

    public void setDeliveryDate(String deliveryDate) {
        driver.findElement(dateField).sendKeys(deliveryDate);
    }

    public void setRentTerm(String rentTerm) {
        clickOnRentTermField();
        driver.findElement(By.xpath(String.format(rentTermFieldValue, rentTerm))).click();
    }

    public void setColor(String color) {
        driver.findElement(By.xpath(String.format(colorCheckBox, color))).click();
    }

    public void setComment(String comment) {
        driver.findElement(commentField).sendKeys(comment);
    }

    // Нажатия
    public void clickOnNextButton() {
        driver.findElement(nextButton).click();
    }
    public void clickOnOrderButton() {
        driver.findElement(orderButton).click();
    }

    public void clickOnRentTermField() {
        driver.findElement(rentTermField).click();
    }

    // Заполнить форму контактных данных
    public void setPersonData(String name, String surname, String address, String metroStation, String phoneNumber) {
        setName(name);
        setSurname(surname);
        setAddress(address);
        setMetroStation(metroStation);
        setPhoneNumber(phoneNumber);
        clickOnNextButton();
    }

    // Заполнить форму заказа
    public void setOrderData (String deliveryDate, String rentTerm, String color, String comment) {
        setDeliveryDate(deliveryDate);
        setRentTerm(rentTerm);
        setColor(color);
        setComment(comment);
        clickOnOrderButton();
    }

    public void confirmOrder() {
        new WebDriverWait(driver, 2)
                .until(ExpectedConditions.visibilityOfElementLocated(confirmOrderWindow));
        driver.findElement(confirmButton).click();
        driver.findElement(orderText);
    }
}
