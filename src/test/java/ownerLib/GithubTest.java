package ownerLib;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GithubTest {

    @Test
    public void authByUsernameAndPass(){
        open("https://github.com/login");
        $("#login_field").sendKeys("User0");
        $("#password").sendKeys("123456");

    }
}
