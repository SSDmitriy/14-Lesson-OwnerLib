package ownerLib.myConfig;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:forApi.properties"})
public interface ForApiConfig extends Config {

    @DefaultValue("https://github.com/open")
    @Key("baseUrl")
    String baseUrl();

    @DefaultValue("123456")
    @Key("token")
    String token();
}
