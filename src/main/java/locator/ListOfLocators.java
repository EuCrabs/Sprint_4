package locator;

import org.openqa.selenium.By;

public class ListOfLocators {

    // Локатор первого вопроса
    public static By firstQuestion = By.id("accordion__heading-0");
    // Локатор ответа на первый вопрос
    public static By firstQuestionText = By.xpath(".//div[@id='accordion__panel-0']/p");
    // Локатор второго вопроса
    public static By secondQuestion = By.id("accordion__heading-1");
    // Локатор ответа на второй вопрос
    public static By secondQuestionText = By.xpath(".//div[@id='accordion__panel-1']/p");
    // Локатор третьего вопроса
    public static By thirdQuestion = By.id("accordion__heading-2");
    // Локатор ответа на третий вопрос
    public static By thirdQuestionText = By.xpath(".//div[@id='accordion__panel-2']/p");
    // Локатор четвертого вопроса
    public static By fourthQuestion = By.id("accordion__heading-3");
    // Локатор ответа на четвертый вопрос
    public static By fourthQuestionText = By.xpath(".//div[@id='accordion__panel-3']/p");
    // Локатор пятого вопроса
    public static By fifthQuestion = By.id("accordion__heading-4");
    // Локатор ответа на пятый вопрос
    public static By fifthQuestionText = By.xpath(".//div[@id='accordion__panel-4']/p");
    // Локатор шестого вопроса
    public static By sixthQuestion = By.id("accordion__heading-5");
    // Локатор ответа на шестой вопрос
    public static By sixthQuestionText = By.xpath(".//div[@id='accordion__panel-5']/p");
    // Локатор седьмого вопроса
    public static By seventhQuestion = By.id("accordion__heading-6");
    // Локатор ответа на седьмой вопрос
    public static By seventhQuestionText = By.xpath(".//div[@id='accordion__panel-6']/p");
    // Локатор восьмого вопроса
    public static By eighthQuestion = By.id("accordion__heading-7");
    // Локатор ответа на восьмой вопрос
    public static By eighthQuestionText = By.xpath(".//div[@id='accordion__panel-7']/p");
    // Верхняя кнопка заказать
    public  static By firstButtonOrder = By.xpath(".//button[@class='Button_Button__ra12g' and text()='Заказать']");
    // Нижняя кнопка заказать
    public static By secondButtonOrder = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    // Поле имя
    public static  By name = By.cssSelector("input[placeholder='* Имя']");
    // Поле фамилия
    public static By surname = By.cssSelector("input[placeholder='* Фамилия']");
    // Поле адрес
    public static By deliveryAddress = By.cssSelector("input[placeholder='* Адрес: куда привезти заказ']");
    // Поле станция метро
    public static By station = By.className("select-search__input");
    public static By stationPoint = By.xpath(".//button[@value='1']");
    // Поле телефон
    public static By phoneNumber = By.cssSelector("input[placeholder='* Телефон: на него позвонит курьер']");
    // Кнопка "Далее"
    public static By buttonNext = By.xpath(".//button[text()='Далее']");
    // Дата доставки самоката
    public static By date = By.cssSelector("input[placeholder='* Когда привезти самокат']");
    // Срок аренды
    public static By untilDate = By.className("Dropdown-arrow");
    public static By untilDatePoint = By.xpath(".//div[@class='Dropdown-option' and text()='сутки']");
    // Цвет самоката
    public static By label = By.xpath((".//label[@for='black']"));
    // Комментарий
    public static By comment = By.cssSelector("input[placeholder='Комментарий для курьера']");
    // Кнопка "Заказать"
    public static By buttonOrder = By.xpath(".//button[2][text()='Заказать']");
    // Кнопка подтверждения заказа
    public static By buttonYes = By.xpath(".//button[text()='Да']");
    // Окно успешного заказа
    public static By modal = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ' and text()='Заказ оформлен']");
}