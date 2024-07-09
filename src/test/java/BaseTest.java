import config.Systems;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import base.ChromeDriver;
import base.WaitBlock;

public class BaseTest {
    protected WebDriver driver;
    protected WaitBlock waitService;

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver().getDriver();
        waitService = new WaitBlock(driver);

        driver.get(Systems.getUrl());
        waitService.waitForVisibilityLocatedBy(By.id("cookie-agree")).click();

        WebElement selector = waitService.waitForVisibilityLocatedBy(By.xpath("//button[@class='select__header']"));
        selector.click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
