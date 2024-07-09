package base;

import config.Systems;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WaitBlock {
    private WebDriver driver;
    private Duration timeout;
    private WebDriverWait wait;

    public WaitBlock(WebDriver driver) {
        this.driver = driver;
        timeout = Duration.ofSeconds(Systems.timeout());
        wait = new WebDriverWait(driver, timeout);
    }

    public WebElement waitForExists(By by) {  //наличие в дом модели
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public WebElement waitForVisibilityLocatedBy(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public WebElement waitForElementClickable(By by) {  //кликабелен
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public List<WebElement> waitForAllExistElementsLocatedBy(By locator) {
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }
}
