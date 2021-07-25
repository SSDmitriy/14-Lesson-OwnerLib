import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import ownerLib.myConfig.MyBaseSeleniumConfig;

import java.net.URL;

public class WebDriverTest {

    private MyBaseSeleniumConfig myBaseConfig = new MyBaseSeleniumConfig();

    @Test
    public void testWebDriver() throws Exception{
        final WebDriver driver = createWebDriver();
        driver.get("https://github.com");
        Thread.sleep(3000);
        driver.quit();
    }

    private WebDriver createWebDriver() {

        if (myBaseConfig.isRemote()) {
            return new RemoteWebDriver(
                    myBaseConfig.getRemoteUrl(),
                    DesiredCapabilities.chrome()
                    );
        } else {
            return new ChromeDriver();
        }

    }
}
