package ru.yandex.praktikum;

import org.junit.Assert;
import ru.yandex.praktikum.page_object.MainPage;
import org.junit.Test;

public class FAQOnMainPageTest extends TestTemplate {
    // Проверка первого вопроса
    @Test
    public void answerTextOnFirstQuestionTest() {
        // Создать объект класса главной страницы
        MainPage mainPage = new MainPage(driver);
        // Задать ожидаемый текст ответа
        String expectedTextAnswer = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        // Выполнить шаги
        driver.get("https://qa-scooter.praktikum-services.ru/");
        mainPage.scrollToFAQ();
        mainPage.clickOnFirstQuestion();
        Assert.assertEquals(expectedTextAnswer, mainPage.getFirstAnswerText());
    }
    // Проверка второго вопроса
    @Test
    public void answerTextOnSecondQuestionTest() {
        // Создать объект класса главной страницы
        MainPage mainPage = new MainPage(driver);
        // Задать ожидаемый текст ответа
        String expectedTextAnswer = "Пока что у нас так: один заказ — один самокат. " +
                "Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        // Выполнить шаги
        driver.get("https://qa-scooter.praktikum-services.ru/");
        mainPage.scrollToFAQ();
        mainPage.clickOnSecondQuestion();
        Assert.assertEquals(expectedTextAnswer, mainPage.getSecondAnswerText());
    }
    // Проверка третьего вопроса
    @Test
    public void answerTextOnThirdQuestionTest() {
        // Создать объект класса главной страницы
        MainPage mainPage = new MainPage(driver);
        // Задать ожидаемый текст ответа
        String expectedTextAnswer = "Допустим, вы оформляете заказ на 8 мая. " +
                "Мы привозим самокат 8 мая в течение дня. " +
                "Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. " +
                "Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        // Выполнить шаги
        driver.get("https://qa-scooter.praktikum-services.ru/");
        mainPage.scrollToFAQ();
        mainPage.clickOnThirdQuestion();
        Assert.assertEquals(expectedTextAnswer, mainPage.getThirdAnswerText());
    }
    // Проверка четвертого вопроса
    @Test
    public void answerTextOnFourthQuestionTest() {
        // Создать объект класса главной страницы
        MainPage mainPage = new MainPage(driver);
        // Задать ожидаемый текст ответа
        String expectedTextAnswer = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        // Выполнить шаги
        driver.get("https://qa-scooter.praktikum-services.ru/");
        mainPage.scrollToFAQ();
        mainPage.clickOnFourthQuestion();
        Assert.assertEquals(expectedTextAnswer, mainPage.getFourthAnswerText());
    }
    // Проверка пятого вопроса
    @Test
    public void answerTextOnFifthQuestionTest() {
        // Создать объект класса главной страницы
        MainPage mainPage = new MainPage(driver);
        // Задать ожидаемый текст ответа
        String expectedTextAnswer = "Пока что нет! Но если что-то срочное — " +
                "всегда можно позвонить в поддержку по красивому номеру 1010.";
        // Выполнить шаги
        driver.get("https://qa-scooter.praktikum-services.ru/");
        mainPage.scrollToFAQ();
        mainPage.clickOnFifthQuestion();
        Assert.assertEquals(expectedTextAnswer, mainPage.getFifthAnswerText());
    }
    // Проверка шестого вопроса
    @Test
    public void answerTextOnSixthQuestionTest() {
        // Создать объект класса главной страницы
        MainPage mainPage = new MainPage(driver);
        // Задать ожидаемый текст ответа
        String expectedTextAnswer = "Самокат приезжает к вам с полной зарядкой. " +
                "Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. " +
                "Зарядка не понадобится.";
        // Выполнить шаги
        driver.get("https://qa-scooter.praktikum-services.ru/");
        mainPage.scrollToFAQ();
        mainPage.clickOnSixthQuestion();
        Assert.assertEquals(expectedTextAnswer, mainPage.getSixthAnswerText());
    }
    // Проверка седьмого вопроса
    @Test
    public void answerTextOnSeventhQuestionTest() {
        // Создать объект класса главной страницы
        MainPage mainPage = new MainPage(driver);
        // Задать ожидаемый текст ответа
        String expectedTextAnswer = "Да, пока самокат не привезли. " +
                "Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        // Выполнить шаги
        driver.get("https://qa-scooter.praktikum-services.ru/");
        mainPage.scrollToFAQ();
        mainPage.clickOnSeventhQuestion();
        Assert.assertEquals(expectedTextAnswer, mainPage.getSeventhAnswerText());
    }
    // Проверка восьмого вопроса
    @Test
    public void answerTextOnEighthQuestionTest() {
        // Создать объект класса главной страницы
        MainPage mainPage = new MainPage(driver);
        // Задать ожидаемый текст ответа
        String expectedTextAnswer = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        // Выполнить шаги
        driver.get("https://qa-scooter.praktikum-services.ru/");
        mainPage.scrollToFAQ();
        mainPage.clickOnEighthQuestion();
        Assert.assertEquals(expectedTextAnswer, mainPage.getEighthAnswerText());
    }

}
