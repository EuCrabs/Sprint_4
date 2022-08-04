package pageObjectPackage;

import locator.ListOfLocators;
import org.openqa.selenium.WebDriver;

public class OrderPageScooter {
    WebDriver driver;

    public String pageURL = "https://qa-scooter.praktikum-services.ru/order";

    // конструктор класса
    public OrderPageScooter(WebDriver driver){
        this.driver = driver;
        driver.get(pageURL);
    }

    public OrderPageScooter setName(String name) {
        driver.findElement(ListOfLocators.name).sendKeys(name);
        return this;
    }

    public OrderPageScooter setSurname(String surname) {
        driver.findElement(ListOfLocators.surname).sendKeys(surname);
        return this;
    }

    public OrderPageScooter setAddress(String address) {
        driver.findElement(ListOfLocators.deliveryAddress).sendKeys(address);
        return this;
    }

    public OrderPageScooter choseStation() {
        driver.findElement(ListOfLocators.station).click();
        driver.findElement(ListOfLocators.stationPoint).click();
        return this;
    }

    public OrderPageScooter setPhone(String phone) {
        driver.findElement(ListOfLocators.phoneNumber).sendKeys(phone);
        return this;
    }

    public OrderPageScooter clickNext() {
        driver.findElement(ListOfLocators.buttonNext).click();
        return this;
    }

    public OrderPageScooter setDate(String date) {
        driver.findElement(ListOfLocators.date).sendKeys(date);
        return this;
    }

    public OrderPageScooter setUntilDate() {
        driver.findElement(ListOfLocators.untilDate).click();
        driver.findElement(ListOfLocators.untilDatePoint).click();
        return this;
    }

    public OrderPageScooter choseColor() {
        driver.findElement(ListOfLocators.label).click();
        return this;
    }

    public OrderPageScooter writeComment(String comment) {
        driver.findElement(ListOfLocators.comment).sendKeys(comment);
        return this;
    }

    public OrderPageScooter orderCreate() {
        driver.findElement(ListOfLocators.buttonOrder).click();
        return this;
    }

    public OrderPageScooter orderConfirm() {
        driver.findElement(ListOfLocators.buttonYes).click();
        return this;
    }

    public boolean modal() {
        return driver.findElement(ListOfLocators.modal).isDisplayed();
    }
}