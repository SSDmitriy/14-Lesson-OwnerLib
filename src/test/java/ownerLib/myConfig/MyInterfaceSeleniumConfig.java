package ownerLib.myConfig;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface MyInterfaceSeleniumConfig extends Config {

    @Key("webdriver.remote.url")
    URL getRemoteUrl();

    @Key("webdriver.remote")
    boolean isRemote();
}
