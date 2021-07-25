import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import ownerLib.myConfig.MyBaseSeleniumConfig;

public class WebDriverTest {

    private MyBaseSeleniumConfig myBaseSeleniumConfig = new MyBaseSeleniumConfig();

    @Test
    public void testWebDriver() throws Exception{

        Configuration.browser = "chrome";
        Selenide.open("https://github.com/login");

        Thread.sleep(3000);
        //        final WebDriver driver = createWebDriver();
//        driver.get("https://github.com");
//        driver.quit();
    }

    private WebDriver createWebDriver() {

        if (myBaseSeleniumConfig.isRemote()) {
            return new RemoteWebDriver(
                    myBaseSeleniumConfig.getRemoteUrl(),
                    DesiredCapabilities.chrome()
                    );
        } else {
            return new ChromeDriver();
        }

    }
}
