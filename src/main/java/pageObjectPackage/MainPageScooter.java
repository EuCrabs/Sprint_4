package pageObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageScooter {

    WebDriver driver;
    public String pageURL = "https://qa-scooter.praktikum-services.ru/";

    // конструктор класса
    public MainPageScooter(WebDriver driver){
        this.driver = driver;
        driver.get(pageURL);
    }

    public MainPageScooter findElement(By locator) {
        driver.findElement(locator);
        return this;
    }

    // метод клика по элементу
    public MainPageScooter clickElement(By locator) {
        driver.findElement(locator).click();
        return this;
    }

    // метод проверки невидимости текста ответа
    public MainPageScooter isHidden(By locator) {
        driver.findElement(locator).isDisplayed();
        return this;
    }

    // метод проверки видимости текста ответа
    public MainPageScooter isNotHidden(By locator) {
        driver.findElement(locator).isDisplayed();
        return this;
    }

    // метод получения текста ответа
    public String getElementText(By locator) {
        return driver.findElement(locator).getText();
    }
}