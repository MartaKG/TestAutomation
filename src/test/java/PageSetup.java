import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSetup {

    String projectLocation = System.getProperty("user.dir");
    String ultimateQAURL = "https://ultimateqa.com/simple-html-elements-for-automation/";
    WebDriver driver;

    @BeforeEach
    public void setup() {
        //biblioteka WebdriverManager - io.github.bonigarcia
        //System.out.println(projectLocation);
        System.setProperty("webdriver.chrome.driver", projectLocation + "/resources/chromedriver113.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ultimateQAURL);

    }

    @AfterEach
    public void teardown() {
        // różnica pomiędzy driver.close() a driver.quit()
        driver.quit();

    }
}
