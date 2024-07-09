import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CheckPaymentSystemLogoTest extends BaseTest {

    @Test
    public void logoTest() {
        WebElement logoVisa = waitService.waitForVisibilityLocatedBy(By.xpath("//img[@alt='Visa']"));
        WebElement logoVisaVerified = waitService.waitForVisibilityLocatedBy(By.xpath("//img[@alt='Verified By Visa']"));
        WebElement logoMasterCard = waitService.waitForVisibilityLocatedBy(By.xpath("//div[@class='pay__partners']//img[@alt='MasterCard']"));
        WebElement logoMasterCardSC = waitService.waitForVisibilityLocatedBy(By.xpath("//img[@alt='MasterCard Secure Code']"));
        WebElement logoBelCard = waitService.waitForVisibilityLocatedBy(By.xpath("//div[@class='pay__partners']//img[@alt='Белкарт']"));

        Assert.assertTrue(logoVisa.isDisplayed());
        Assert.assertTrue(logoVisaVerified.isDisplayed());
        Assert.assertTrue(logoMasterCard.isDisplayed());
        Assert.assertTrue(logoMasterCardSC.isDisplayed());
        Assert.assertTrue(logoBelCard.isDisplayed());

    }
}
