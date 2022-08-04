import locator.ListOfLocators;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pageObjectPackage.MainPageScooter;
import pageObjectPackage.OrderPageScooter;

import static org.junit.Assert.assertTrue;

public class TestOrderPage extends BaseTest {

    @Test
    public void newOrderFirstButton() {

        MainPageScooter objMainPage = new MainPageScooter(driver);
        objMainPage.clickElement(ListOfLocators.firstButtonOrder);

        OrderPageScooter objOrderPage = new OrderPageScooter(driver);
        assertTrue("Ожидаем модальное окно успешного заказа", objOrderPage
                .setName("Женя")
                .setSurname("Курочкин")
                .setAddress("Кострома")
                .setPhone("+79206484852")
                .choseStation()
                .clickNext()
                .setDate("05.08.2022")
                .setUntilDate()
                .choseColor()
                .writeComment("Test comment")
                .orderCreate()
                .orderConfirm()
                .modal());
    }
    @Test
    public void newOrderSecondButton() {

        MainPageScooter objMainPage = new MainPageScooter(driver);

        WebElement element = driver.findElement(ListOfLocators.secondButtonOrder);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

        objMainPage.clickElement(ListOfLocators.secondButtonOrder);

        OrderPageScooter objOrderPage = new OrderPageScooter(driver);
        assertTrue("Ожидаем модальное окно успешного заказа", objOrderPage
                .setName("Женя")
                .setSurname("Курочкин")
                .setAddress("Кострома")
                .setPhone("+79206484852")
                .choseStation()
                .clickNext()
                .setDate("05.08.2022")
                .setUntilDate()
                .choseColor()
                .writeComment("Test comment")
                .orderCreate()
                .orderConfirm()
                .modal());
    }
    @Test
    public void newOrderFirstButtonSecondScenario() {

        MainPageScooter objMainPage = new MainPageScooter(driver);
        objMainPage.clickElement(ListOfLocators.firstButtonOrder);

        OrderPageScooter objOrderPage = new OrderPageScooter(driver);
        assertTrue("Ожидаем модальное окно успешного заказа", objOrderPage
                .setName("Рита")
                .setSurname("Иванова")
                .setAddress("Москва, ул.Советская, д.15, кв.5")
                .setPhone("+79632171553")
                .choseStation()
                .clickNext()
                .setDate("06.08.2022")
                .setUntilDate()
                .choseColor()
                .writeComment("Test comment 2")
                .orderCreate()
                .orderConfirm()
                .modal());
    }
    @Test
    public void newOrderSecondButtonSecondScenario() {

        MainPageScooter objMainPage = new MainPageScooter(driver);

        WebElement element = driver.findElement(ListOfLocators.secondButtonOrder);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

        objMainPage.clickElement(ListOfLocators.secondButtonOrder);

        OrderPageScooter objOrderPage = new OrderPageScooter(driver);
        assertTrue("Ожидаем модальное окно успешного заказа", objOrderPage
                .setName("Рита")
                .setSurname("Иванова")
                .setAddress("Москва, ул.Советская, д.15, кв.5")
                .setPhone("+79632171553")
                .choseStation()
                .clickNext()
                .setDate("06.08.2022")
                .setUntilDate()
                .choseColor()
                .writeComment("Test comment 2")
                .orderCreate()
                .orderConfirm()
                .modal());
    }
}