package ru.yandex.praktikum.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    // Объект драйвера
    private final WebDriver driver;
    // Блок вопросов
    private final By homeFAQ = By.className("Home_FAQ__3uVm4");
    // Первый вопрос и текст ответа
    private final By firstAccordionPanel = By.id("accordion__heading-0");
    private final By firstAnswerText = By.xpath("//*[@id='accordion__panel-0']/p");
    // Второй вопрос и текст ответа
    private final By secondAccordionPanel = By.id("accordion__heading-1");
    private final By secondAnswerText = By.xpath("//*[@id='accordion__panel-1']/p");
    // Третий вопрос и текст ответа
    private final By thirdAccordionPanel = By.id("accordion__heading-2");
    private final By thirdAnswerText = By.xpath("//*[@id='accordion__panel-2']/p");
    // Четвертый вопрос и текст ответа
    private final By fourthAccordionPanel = By.id("accordion__heading-3");
    private final By fourthAnswerText = By.xpath("//*[@id='accordion__panel-3']/p");
    // Пятый вопрос, ответ и текст ответа
    private final By fifthAccordionPanel = By.id("accordion__heading-4");
    private final By fifthAnswerText = By.xpath("//*[@id='accordion__panel-4']/p");
    // Шестой вопрос и текст ответа
    private final By sixthAccordionPanel = By.id("accordion__heading-5");
    private final By sixthAnswerText = By.xpath("//*[@id='accordion__panel-5']/p");
    // Седьмой вопрос и текст ответа
    private final By seventhAccordionPanel = By.id("accordion__heading-6");
    private final By seventhAnswerText = By.xpath("//*[@id='accordion__panel-6']/p");
    // Восьмой вопрос и текст ответа
    private final By eighthAccordionPanel = By.id("accordion__heading-7");
    private final By eighthAnswerText = By.xpath("//*[@id='accordion__panel-7']/p");
    // Кнопка Заказать вверху страницы
    private final By upperOrderButton = By.xpath("//div[@class='Header_Nav__AGCXC']/button[text()='Заказать']");
    // Кнопка Заказать внизу страницы
    private final By lowerOrderButton = By.xpath("//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    // Прокрутка
    public void scrollToFAQ() {
        WebElement element = driver.findElement(homeFAQ);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void scrollToOrderButton() {
        WebElement element = driver.findElement(lowerOrderButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    // Нажатия
    public void clickOnFirstQuestion() {
        driver.findElement(firstAccordionPanel).click();
    }

    public void clickOnSecondQuestion() {
        driver.findElement(secondAccordionPanel).click();
    }

    public void clickOnThirdQuestion() {
        driver.findElement(thirdAccordionPanel).click();
    }

    public void clickOnFourthQuestion() {
        driver.findElement(fourthAccordionPanel).click();
    }

    public void clickOnFifthQuestion() {
        driver.findElement(fifthAccordionPanel).click();
    }

    public void clickOnSixthQuestion() {
        driver.findElement(sixthAccordionPanel).click();
    }

    public void clickOnSeventhQuestion() {
        driver.findElement(seventhAccordionPanel).click();
    }

    public void clickOnEighthQuestion() {
        driver.findElement(eighthAccordionPanel).click();
    }

    public void clickUpperOrderButton() {
        driver.findElement(upperOrderButton).click();
    }

    public void clickLowerOrderButton() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(lowerOrderButton));
        driver.findElement(lowerOrderButton).click();
    }

    // Геттеры
    public String getFirstAnswerText() {
        return driver.findElement(firstAnswerText).getText();
    }

    public String getSecondAnswerText() {
        return driver.findElement(secondAnswerText).getText();
    }

    public String getThirdAnswerText() {
        return driver.findElement(thirdAnswerText).getText();
    }

    public String getFourthAnswerText() {
        return driver.findElement(fourthAnswerText).getText();
    }

    public String getFifthAnswerText() {
        return driver.findElement(fifthAnswerText).getText();
    }

    public String getSixthAnswerText() {
        return driver.findElement(sixthAnswerText).getText();
    }

    public String getSeventhAnswerText() {
        return driver.findElement(seventhAnswerText).getText();
    }

    public String getEighthAnswerText() {
        return driver.findElement(eighthAnswerText).getText();
    }

}
