package ownerLib.myConfig;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${conf}.properties"})
public interface ForWebConfig extends Config {

    @DefaultValue("Chrome")
    @Key("browser")
    String browser();

    @DefaultValue("77")
    @Key("browser.version")
    String browserVersion();

    @DefaultValue("true")
    @Key("isRemote")
    Boolean isRemote();

    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub/")
    @Key("remoteUrl")
    String remoteUrl();
}
