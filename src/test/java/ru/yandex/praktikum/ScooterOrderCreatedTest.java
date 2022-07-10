package ru.yandex.praktikum;

import ru.yandex.praktikum.page_object.MainPage;
import ru.yandex.praktikum.page_object.OrderPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class ScooterOrderCreatedTest extends TestTemplate {

    private final String name;
    private final String surname;
    private final String address;
    private final String metroStation;
    private final String phoneNumber;
    private final String deliveryDate;
    private final String rentTerm;
    private final String color;
    private final String comment;

    public ScooterOrderCreatedTest(String name, String surname, String address, String metroStation, String phoneNumber, String deliveryDate, String rentTerm, String color, String comment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.metroStation = metroStation;
        this.phoneNumber = phoneNumber;
        this.deliveryDate = deliveryDate;
        this.rentTerm = rentTerm;
        this.color = color;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Object[][] getOrderData() {
        return new Object[][]{
                {   "Арнольд",
                    "Тестовый",
                    "ул Тургенева, 23, 123",
                    "Сокольники",
                    "+79566674565",
                    "15.07.2022",
                    "сутки",
                    "black",
                    "Код домофона #132"
                },
                {   "Матильда",
                    "Тестовая",
                    "ул Какая-то, 1, 1",
                    "Черкизовская",
                    "+79459867545",
                    "13.07.2022",
                    "двое суток",
                    "grey",
                    "очень важный комментарий"
                }
        };
    }
    @Test
    public void ScooterOrderFromUpperButtonTest() {
        // Создать объект класса главной страницы
        MainPage mainPage = new MainPage(driver);
        // Создать объект класса страницы заказа
        OrderPage orderPage = new OrderPage(driver);
        // Выполнить шаги
        driver.get("https://qa-scooter.praktikum-services.ru/");
        mainPage.clickUpperOrderButton();
        orderPage.setPersonData(name, surname, address, metroStation, phoneNumber);
        orderPage.setOrderData(deliveryDate, rentTerm, color, comment);
        orderPage.confirmOrder();
    }

    @Test
    public void ScooterOrderFromLowerButtonTest() {
        // Создать объект класса главной страницы
        MainPage mainPage = new MainPage(driver);
        // Создать объект класса страницы заказа
        OrderPage orderPage = new OrderPage(driver);
        // Выполнить шаги
        driver.get("https://qa-scooter.praktikum-services.ru/");
        mainPage.scrollToOrderButton();
        mainPage.clickLowerOrderButton();
        orderPage.setPersonData(name, surname, address, metroStation, phoneNumber);
        orderPage.setOrderData(deliveryDate, rentTerm, color, comment);
        orderPage.confirmOrder();
    }

}
