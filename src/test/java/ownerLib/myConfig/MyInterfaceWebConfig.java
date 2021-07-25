package ownerLib.myConfig;

import org.aeonbits.owner.Config;

public interface MyInterfaceWebConfig extends Config {

    @Key("github.base.url")
    String getMyBaseUrl();

    @Key("github.username")
    String getUsername();

    @Key("github.password")
    String getPassword();
}
