package ownerLib.myConfig;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${conf}.properties"})
public interface ForWebConfig extends Config {

    @DefaultValue("https://github.com/open")
    @Key("browser")
    String browser();

    @DefaultValue("77")
    @Key("browser.version")
    String browserVersion();

    @DefaultValue("false")
    @Key("isRemote")
    Boolean isRemote();
}
