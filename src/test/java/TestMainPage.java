import locator.ListOfLocators;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pageObjectPackage.MainPageScooter;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TestMainPage extends BaseTest {
    private final String answer;
    private final By question;
    private final By questionText;

    // Конструктор класса
    public TestMainPage(By question, By questionText, String answer) {
        this.question = question;
        this.questionText = questionText;
        this.answer = answer;
    }

    // Параметры теста
    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {ListOfLocators.firstQuestion, ListOfLocators.firstQuestionText, ListOfLocators.firstAnswer},
                {ListOfLocators.secondQuestion, ListOfLocators.secondQuestionText, ListOfLocators.secondAnswer},
                {ListOfLocators.thirdQuestion, ListOfLocators.thirdQuestionText, ListOfLocators.thirdAnswer},
                {ListOfLocators.fourthQuestion, ListOfLocators.fourthQuestionText, ListOfLocators.fourthAnswer},
                {ListOfLocators.fifthQuestion, ListOfLocators.fifthQuestionText, ListOfLocators.fifthAnswer},
                {ListOfLocators.sixthQuestion, ListOfLocators.sixthQuestionText, ListOfLocators.sixthAnswer},
                {ListOfLocators.seventhQuestion, ListOfLocators.seventhQuestionText, ListOfLocators.seventhAnswer},
                {ListOfLocators.eighthQuestion, ListOfLocators.eighthQuestionText, ListOfLocators.eighthAnswer},
        };
    }

    @Test
    public void checkQuestion() {

        MainPageScooter objMainPage = new MainPageScooter(driver);
        // Скролл до элемента
        WebElement element = driver.findElement(question);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

        assertEquals(answer, objMainPage
                .findElement(question)
                .isHidden(questionText)
                .clickElement(question)
                .isNotHidden(questionText)
                .getElementText(questionText));
    }
}