package gettyimages.api;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Slf4j
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class GettyImagesWebDriverTest {

    private GettyImagesWebDriver driver;

    @BeforeAll
    public void setUp() {
        driver = new GettyImagesWebDriver();
    }

    @DisplayName("Test 1: Authorization to the https://www.gettyimages.com/")
    @Test
    @Order(1)
    public void authorizationTest() {
        log.info("Authorization test has been started...");
        driver.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button")));
        driver.getDriver().findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button")).click();
        log.info("step 1 has passed");
        driver.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"site-top-header-wrapper\"]" +
                "/header-side-panels/div[6]/div[4]/a")));
        driver.getDriver().findElement(By.xpath("//*[@id=\"site-top-header-wrapper\"]" +
                "/header-side-panels/div[6]/div[4]/a")).click();
        log.info("step 2 has passed");
        driver.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"site-top-header-wrapper\"]" +
                "/header-side-panels/div[3]/div[2]/div[4]/div/a[1]")));
        driver.getDriver().findElement(By.xpath("//*[@id=\"site-top-header-wrapper\"]" +
                "/header-side-panels/div[3]/div[2]/div[4]/div/a[1]")).click();
        log.info("step 3 has passed");
        driver.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"new_new_session\"]/gi-text-field[1]")));
        driver.getDriver().findElement(By.xpath("//*[@id=\"new_session_username\"]")).click();
        driver.getDriver().findElement(By.xpath("//*[@id=\"new_session_username\"]")).
                sendKeys("vika.dolgikh@mail.ru");
        log.info("step 4 has passed");
        driver.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"new_new_session\"]/gi-text-field[2]")));
        driver.getDriver().findElement(By.xpath("//*[@id=\"new_session_password\"]")).click();
        driver.getDriver().findElement(By.xpath("//*[@id=\"new_session_password\"]")).
                sendKeys("19072014Vika");
        log.info("step 5 has passed");
        driver.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"new_new_session\"]/div[1]")));
        String buttonSignIn = driver.getDriver().findElement(By.xpath("//*[@id=\"new_new_session\"]/div[1]")).getText();
        String expectedButtonSignIn = "SIGN IN";
        assertEquals(expectedButtonSignIn, buttonSignIn);
        driver.getDriver().findElement(By.xpath("//*[@id=\"new_new_session\"]/div[1]")).click();
        log.info("step 6 has passed");
        log.info("Authorization test result: Success!");
    }

    @DisplayName("Test 2: Add photos to the cart")
    @Test
    @Order(2)
    public void addPhotosToCart() {
        log.info("Add photos to cart test has been started...");
        driver.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"customer_notifications_application\"]/div/div/div[2]")));
        driver.getDriver().findElement(By.xpath("//*[@id=\"customer_notifications_application\"]/div/div/div[2]")).click();
        log.info("step 1 has passed");
        driver.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/section/div/ul/li[1]/a")));
        String buttonCreative = driver.getDriver().findElement(By.xpath("/html/body/div[2]/section/div/ul/li[1]/a")).getText();
        String expectedButtonCreative = "CREATIVE";
        assertEquals(expectedButtonCreative, buttonCreative);
        driver.getDriver().findElement(By.xpath("/html/body/div[2]/section/div/ul/li[1]/a")).click();
        log.info("step 2 has passed");
        driver.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/section/div/div[2]/div[1]/a")));
        driver.getDriver().findElement(By.xpath("/html/body/div[2]/section/div/div[2]/div[1]/a")).click();
        log.info("step 3 has passed");
        driver.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"comp\"]"))); //*[@id="XS"]
        driver.getDriver().findElement(By.xpath("//*[@id=\"comp\"]")).click();
        log.info("step 4 has passed");
        driver.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/section/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div/div[2]")));
        String buttonAddToCart = driver.getDriver().findElement(By.xpath("/html/body/div[2]/section/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div/div[2]")).getText();
        String expectedButtonAddToCart = "ADD TO CART";
        assertEquals(expectedButtonAddToCart, buttonAddToCart);
        driver.getDriver().findElement(By.xpath("/html/body/div[2]/section/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div/div[2]")).click();
        log.info("step 5 has passed");
        driver.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"site-top-header-wrapper\"]/header-side-panels/div[4]/div[1]/button")));
        driver.getDriver().findElement(By.xpath("//*[@id=\"site-top-header-wrapper\"]/header-side-panels/div[4]/div[1]")).click();
        log.info("step 6 has passed");
        driver.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"site-top-header-wrapper\"]/header-side-panels/div[2]/ul/li[1]/a")));
        driver.getDriver().findElement(By.xpath("//*[@id=\"site-top-header-wrapper\"]/header-side-panels/div[2]/ul/li[1]/a")).click();
        log.info("step 7 has passed");
        driver.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/section/div/div[2]/div[2]"))); //change
        driver.getDriver().findElement(By.xpath("/html/body/div[2]/section/div/div[2]/div[2]")).click(); // /html/body/div[2]/section/div/div[2]/div[3]
        log.info("step 8 has passed");
        driver.getWait().until((ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"comp\"]")))); //*[@id="XS"]
        driver.getDriver().findElement(By.xpath("//*[@id=\"comp\"]")).click();
        log.info("step 9 has passed");
        driver.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/section/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div/div[2]")));
        String buttonAddToCart2 = driver.getDriver().findElement(By.xpath("/html/body/div[2]/section/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div/div[2]")).getText();
        String expectedButtonAddToCart2 = "ADD TO CART";
        assertEquals(expectedButtonAddToCart2, buttonAddToCart2);
        driver.getDriver().findElement(By.xpath("/html/body/div[2]/section/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div/div[2]")).click();
        log.info("step 10 has passed");
        driver.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"site-top-header-wrapper\"]/header-side-panels/div[6]/div[2]")));
        driver.getDriver().findElement(By.xpath("//*[@id=\"site-top-header-wrapper\"]/header-side-panels/div[6]/div[2]")).click();
        log.info("step 11 has passed");
        log.info("Add photos to cart test result: Success!");
    }

    @DisplayName("Test 3: Remove photos from the cart")
    @Test
    @Order(3)
    public void removePhotos() {
        log.info("Remove photos from the cart test has been started...");
        driver.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cart-item-list\"]/div[2]/div/div/figure/ul/li[2]/a")));
        driver.getDriver().findElement(By.xpath("//*[@id=\"cart-item-list\"]/div[2]/div/div/figure/ul/li[2]/a")).click();
        log.info("step 1 has passed");
        driver.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cart-item-list\"]/div/div/div/figure/ul/li[2]/a")));
        driver.getDriver().findElement(By.xpath("//*[@id=\"cart-item-list\"]/div/div/div/figure/ul/li[2]/a")).click();
        log.info("step 2 has passed");
        log.info("Remove photos from the cart test result: Success!");
    }

    @DisplayName("Test 4: Find pictures with cats and then add to cart/remove")
    @Test
    @Order(4)
    public void catsSearch() {
        log.info("Cats search has been started...");
        driver.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"gix-search-phrase\"]")));
        driver.getDriver().findElement(By.xpath("//*[@id=\"gix-search-phrase\"]")).click();
        driver.getDriver().findElement(By.xpath("//*[@id=\"gix-search-phrase\"]")).sendKeys("cats");
        driver.getDriver().findElement(By.xpath("//*[@id=\"header-wrapper\"]/header-search-bar/div[2]/div/form/div[1]/button")).click();
        String buttonAll = driver.getDriver().findElement(By.xpath("/html/body/div[2]/section/div/main/div/div/div[3]/div/div/div[2]/ul/li[1]")).getText();
        String expectedButtonAll = "All";
        assertEquals(expectedButtonAll, buttonAll);
        log.info("step 1 has passed");
        String originalWindow = driver.getDriver().getWindowHandle();
        driver.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/section/div/main/div/div/div[4]/div[2]/div[2]/div[1]/article")));
        driver.getDriver().findElement(By.xpath("/html/body/div[2]/section/div/main/div/div/div[4]/div[2]/div[2]/div[1]/article")).click();
        log.info("step 2 has passed");
        for (String windowHandle : driver.getDriver().getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.getDriver().switchTo().window(windowHandle);
                break;
            }
        }
        log.info("step 3 has passed");
        driver.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/section/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div/div[2]"))); //*[@id="react_buy_card"]/div/div/div[3]/div[2]/div/button
        driver.getDriver().findElement(By.xpath("/html/body/div[2]/section/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div/div[2]")).click();
        log.info("step 4 has passed");
        driver.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/section/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div/div[2]")));
        driver.getDriver().findElement(By.xpath("/html/body/div[2]/section/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div/div[2]")).click();
        log.info("step 5 has passed");
        driver.getDriver().switchTo().window(originalWindow);
        driver.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"site-top-header-wrapper\"]/header-side-panels/div[6]/div[2]")));
        driver.getDriver().findElement(By.xpath("//*[@id=\"site-top-header-wrapper\"]/header-side-panels/div[6]/div[2]")).click();
        log.info("step 6 has passed");
        driver.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cart-item-list\"]/div/div/div/figure/ul/li[2]/a")));
        driver.getDriver().findElement(By.xpath("//*[@id=\"cart-item-list\"]/div/div/div/figure/ul/li[2]/a")).click();
        log.info("step 7 has passed");
    }

    @DisplayName("Test 5: Sign out")
    @Test
    @Order(5)
    public void signOut() {
        driver.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"site-top-header-wrapper\"]/header-side-panels/div[6]/div[3]/button")));
        driver.getDriver().findElement(By.xpath("//*[@id=\"site-top-header-wrapper\"]/header-side-panels/div[6]/div[3]/button")).click();
        log.info("step 1 has passed");
        String buttonSignOut = driver.getDriver().findElement(By.xpath("//*[@id=\"site-top-header-wrapper\"]/header-side-panels/div[3]/div[2]/div[1]/div[3]/a[5]")).getAttribute("innerText");
        String expectedButtonSignOut = "SIGN OUT";
        assertEquals(expectedButtonSignOut, buttonSignOut);
        driver.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"site-top-header-wrapper\"]/header-side-panels/div[3]/div[2]/div[1]/div[3]/a[5]")));
        driver.getDriver().findElement(By.xpath("//*[@id=\"site-top-header-wrapper\"]/header-side-panels/div[3]/div[2]/div[1]/div[3]/a[5]")).click();
        log.info("step 2 has passed");
    }

    @AfterAll
    public void closeChromeTab() {
        driver.getDriver().quit();
    }
}
