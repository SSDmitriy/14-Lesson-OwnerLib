import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import ownerLib.myConfig.MyProdWebConfig;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GithubTest {

    //для пререлиза указать тип MyPrereleaseWebConfig
    private MyProdWebConfig myWebConfig = new MyProdWebConfig();

    @Test
    public void authByUsernameAndPass(){
        Configuration.baseUrl = myWebConfig.getMyBaseUrl();
        open("/login");
        $("#login_field").sendKeys(myWebConfig.getUsername());
        $("#password").sendKeys(myWebConfig.getPassword());

    }

}
