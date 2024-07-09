import config.Systems;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import base.ChromeDriver;
import base.WaitBlock;

public class BaseTest {
    protected ChromeDriver simpleDriver;
    protected WebDriver driver;
    protected WaitBlock waitService;

    @BeforeMethod
    public void beforeMethod() {
        simpleDriver = new ChromeDriver();
        driver = simpleDriver.getDriver();
        waitService = new WaitBlock(driver);

        driver.get(Systems.getUrl());
        waitService.waitForVisibilityLocatedBy(By.id("cookie-agree")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
