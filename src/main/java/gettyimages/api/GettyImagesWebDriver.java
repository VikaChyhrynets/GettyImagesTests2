package gettyimages.api;

//import jdk.internal.net.http.common.SubscriptionBase;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GettyImagesWebDriver {

    private WebDriver driver;
    private Wait wait;
    private int timeOutSec = 10;

    public GettyImagesWebDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(this.driver, timeOutSec);
        driver.get("https://www.gettyimages.com/");
        driver.manage().window().setSize(new Dimension(748, 824));
    }
    public WebDriver getDriver() {
        return driver;
    }
    public Wait getWait() {
        return wait;
    }

}
