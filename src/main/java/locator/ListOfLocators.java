package locator;

import org.openqa.selenium.By;

public class ListOfLocators {

    // Локатор первого вопроса
    public static By firstQuestion = By.id("accordion__heading-0");
    // Локатор ответа на первый вопрос
    public static By firstQuestionText = By.xpath(".//div[@id='accordion__panel-0']/p");
    // Текст первого ответа
    public static String firstAnswer = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";

    // Локатор второго вопроса
    public static By secondQuestion = By.id("accordion__heading-1");
    // Локатор ответа на второй вопрос
    public static By secondQuestionText = By.xpath(".//div[@id='accordion__panel-1']/p");
    // Текст второго ответа
    public static String secondAnswer = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";

    // Локатор третьего вопроса
    public static By thirdQuestion = By.id("accordion__heading-2");
    // Локатор ответа на третий вопрос
    public static By thirdQuestionText = By.xpath(".//div[@id='accordion__panel-2']/p");
    // Текст третьего ответа
    public static String thirdAnswer = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";

    // Локатор четвертого вопроса
    public static By fourthQuestion = By.id("accordion__heading-3");
    // Локатор ответа на четвертый вопрос
    public static By fourthQuestionText = By.xpath(".//div[@id='accordion__panel-3']/p");
    // Текст четвертого ответа
    public static String fourthAnswer = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";

    // Локатор пятого вопроса
    public static By fifthQuestion = By.id("accordion__heading-4");
    // Локатор ответа на пятый вопрос
    public static By fifthQuestionText = By.xpath(".//div[@id='accordion__panel-4']/p");
    // Текст пятого ответа
    public static String fifthAnswer = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";

    // Локатор шестого вопроса
    public static By sixthQuestion = By.id("accordion__heading-5");
    // Локатор ответа на шестой вопрос
    public static By sixthQuestionText = By.xpath(".//div[@id='accordion__panel-5']/p");
    // Текст шестого ответа
    public static String sixthAnswer = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";

    // Локатор седьмого вопроса
    public static By seventhQuestion = By.id("accordion__heading-6");
    // Локатор ответа на седьмой вопрос
    public static By seventhQuestionText = By.xpath(".//div[@id='accordion__panel-6']/p");
    // Текст седьмого ответа
    public static String seventhAnswer = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";

    // Локатор восьмого вопроса
    public static By eighthQuestion = By.id("accordion__heading-7");
    // Локатор ответа на восьмой вопрос
    public static By eighthQuestionText = By.xpath(".//div[@id='accordion__panel-7']/p");
    // Текст восьмого ответа
    public static String eighthAnswer = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

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