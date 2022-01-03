package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.pages.HomePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DriverSetUp {
    private static final Logger logger = LogManager.getLogger();
    WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/tomasbrainovich/Documents/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.gsmarena.com/");
        homePage = new HomePage(driver);
        logger.info(driver.getTitle());

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }


}
