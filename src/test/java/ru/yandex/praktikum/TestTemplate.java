package ru.yandex.praktikum;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestTemplate {

    protected static  WebDriver driver;

    @BeforeClass
    public static void setUp() {
        /*
        // Инициализировать WebDriverManager для chrome
        WebDriverManager.chromedriver().setup();
        // Создать объект драйвера chrome
        driver = new ChromeDriver();
        */
        // Инициализировать WebDriverManager для firefox
        WebDriverManager.firefoxdriver().setup();
        // Создать объект драйвера firefox
        driver = new FirefoxDriver();
    }

    @AfterClass
    public static void tearDown() {
        // Закрыть браузер
        driver.quit();
    }
}
