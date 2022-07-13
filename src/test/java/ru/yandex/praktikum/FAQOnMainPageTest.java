package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.BeforeClass;
import ru.yandex.praktikum.page_object.MainPage;
import org.junit.Test;

public class FAQOnMainPageTest extends TestTemplate {

    private static MainPage mainPage;

    @BeforeClass
    public static void commonSteps() {
        // Создать объект класса главной страницы
        mainPage = new MainPage(driver);
        // Выполнить шаги
        driver.get("https://qa-scooter.praktikum-services.ru/");
        mainPage.clickOnCookieConfirmButton();
        mainPage.scrollToFAQ();
    }

    @Test
    public void answerTextOnFirstQuestionTest() {
        // Задать ожидаемый текст ответа
        String expectedTextAnswer = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        // Выполнить шаги
        mainPage.clickOnFirstQuestion();
        Assert.assertEquals(expectedTextAnswer, mainPage.getFirstAnswerText());
    }

    @Test
    public void answerTextOnSecondQuestionTest() {
        // Задать ожидаемый текст ответа
        String expectedTextAnswer = "Пока что у нас так: один заказ — один самокат. " +
                "Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        // Выполнить шаги
        mainPage.clickOnSecondQuestion();
        Assert.assertEquals(expectedTextAnswer, mainPage.getSecondAnswerText());
    }

    @Test
    public void answerTextOnThirdQuestionTest() {
        // Задать ожидаемый текст ответа
        String expectedTextAnswer = "Допустим, вы оформляете заказ на 8 мая. " +
                "Мы привозим самокат 8 мая в течение дня. " +
                "Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. " +
                "Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        // Выполнить шаги
        mainPage.clickOnThirdQuestion();
        Assert.assertEquals(expectedTextAnswer, mainPage.getThirdAnswerText());
    }

    @Test
    public void answerTextOnFourthQuestionTest() {
        // Задать ожидаемый текст ответа
        String expectedTextAnswer = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        // Выполнить шаги
        mainPage.clickOnFourthQuestion();
        Assert.assertEquals(expectedTextAnswer, mainPage.getFourthAnswerText());
    }

    @Test
    public void answerTextOnFifthQuestionTest() {
        // Задать ожидаемый текст ответа
        String expectedTextAnswer = "Пока что нет! Но если что-то срочное — " +
                "всегда можно позвонить в поддержку по красивому номеру 1010.";
        // Выполнить шаги
        mainPage.clickOnFifthQuestion();
        Assert.assertEquals(expectedTextAnswer, mainPage.getFifthAnswerText());
    }

    @Test
    public void answerTextOnSixthQuestionTest() {
        // Задать ожидаемый текст ответа
        String expectedTextAnswer = "Самокат приезжает к вам с полной зарядкой. " +
                "Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. " +
                "Зарядка не понадобится.";
        // Выполнить шаги
        mainPage.clickOnSixthQuestion();
        Assert.assertEquals(expectedTextAnswer, mainPage.getSixthAnswerText());
    }

    @Test
    public void answerTextOnSeventhQuestionTest() {
        // Задать ожидаемый текст ответа
        String expectedTextAnswer = "Да, пока самокат не привезли. " +
                "Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        // Выполнить шаги
        mainPage.clickOnSeventhQuestion();
        Assert.assertEquals(expectedTextAnswer, mainPage.getSeventhAnswerText());
    }

    @Test
    public void answerTextOnEighthQuestionTest() {
        // Задать ожидаемый текст ответа
        String expectedTextAnswer = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        // Выполнить шаги
        mainPage.clickOnEighthQuestion();
        Assert.assertEquals(expectedTextAnswer, mainPage.getEighthAnswerText());
    }

}
