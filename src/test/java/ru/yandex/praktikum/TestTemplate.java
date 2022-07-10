package ru.yandex.praktikum;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Before;
import org.junit.After;

public class TestTemplate {

    protected WebDriver driver;

    @Before
    public void setUp() {
        // Инициализировать WebDriverManager для chrome
        WebDriverManager.chromedriver().setup();
        // Создать объект драйвера chrome
        driver = new ChromeDriver();
        /*
        // Инициализировать WebDriverManager для firefox
        WebDriverManager.firefoxdriver().setup();
        // Создать объект драйвера firefox
        driver = new FirefoxDriver();
         */
    }

    @After
    public void TearDown() {
        // Закрыть браузер
        driver.quit();
    }
}
