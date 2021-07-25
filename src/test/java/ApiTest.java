import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import ownerLib.myConfig.ForApiConfig;

public class ApiTest {

    private ForApiConfig myApiConfig = ConfigFactory
            .create(ForApiConfig.class, System.getProperties());

    @Test
    public void testApi(){
        System.out.println(myApiConfig.baseUrl());
        System.out.println(myApiConfig.token());
    }
}
