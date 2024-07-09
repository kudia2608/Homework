import config.Systems;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CheckFormTest extends BaseTest {

    @Test
    public void continueButtonTest() {
        WebElement serviceSelector = waitService.waitForExists(By.id("pay"));
        Select service = new Select(serviceSelector);
        service.selectByValue("Услуги связи");

        WebElement inputNumber = waitService.waitForVisibilityLocatedBy(By.id("connection-phone"));
        inputNumber.sendKeys(Systems.phoneNumber());

        WebElement inputSum = waitService.waitForVisibilityLocatedBy(By.id("connection-sum"));
        inputSum.sendKeys(Systems.sum());

        WebElement continueButton = waitService.waitForElementClickable(By.xpath("//form[@id='pay-connection']/button"));
        continueButton.submit();

        WebElement checkWindow = waitService.waitForVisibilityLocatedBy(By.xpath("//iframe[@class='bepaid-iframe']"));
        checkWindow.isDisplayed();
    }
}