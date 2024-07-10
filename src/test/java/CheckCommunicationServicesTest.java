import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckCommunicationServicesTest extends BaseTest {

    @Test
    @Description("Проверка:  Услуги связи")
    public void communicationServicesTest(){
        WebElement communicationService = waitService.waitForElementClickable(By.xpath("//ul[@class='select__list']//li[1]"));
        communicationService.click();

        WebElement phoneNumberField = waitService.waitForVisibilityLocatedBy(By.id("connection-phone"));
        String actualPhoneText = phoneNumberField.getAttribute("placeholder");
        Assert.assertEquals(actualPhoneText, "Номер телефона", "Текст поля \"Номер телефона\" не совпадает");

        WebElement sumField = waitService.waitForVisibilityLocatedBy(By.id("connection-sum"));
        String actualSumText = sumField.getAttribute("placeholder");
        Assert.assertEquals(actualSumText, "Сумма", "Текст поля \"Сумма\" не совпадает");

        WebElement emailField = waitService.waitForVisibilityLocatedBy(By.id("connection-email"));
        String actualEmailText = emailField.getAttribute("placeholder");
        Assert.assertEquals(actualEmailText, "E-mail для отправки чека", "Текст поля \"Email\" не совпадает");
    }
}

