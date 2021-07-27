package ownerLib.myConfig;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class WebTest {

    private ForWebConfig myWebConfig = ConfigFactory
            .create(ForWebConfig.class, System.getProperties());

    @Test
    public void testWeb() {

        System.out.println(myWebConfig.browser());
        System.out.println(myWebConfig.browserVersion());

        //запуск, если выбрано удаленное соединение: isRemote==true
        if (myWebConfig.isRemote()) {
            System.out.println("Удалённый запуск: " + myWebConfig.isRemote());
            open(myWebConfig.remoteUrl());
        } else { //иначе - локально
            System.out.println("Локальный запуск");
        }
    }
}
