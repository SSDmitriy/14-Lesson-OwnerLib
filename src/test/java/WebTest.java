import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import ownerLib.myConfig.ForWebConfig;

public class WebTest {

    private ForWebConfig myWebConfig = ConfigFactory
            .create(ForWebConfig.class, System.getProperties());

    @Test
    public void testWeb(){
        System.out.println(myWebConfig.browser());
        System.out.println(myWebConfig.browserVersion());
        System.out.println(myWebConfig.isRemote());
    }
}
