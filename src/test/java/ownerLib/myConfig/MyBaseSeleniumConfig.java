package ownerLib.myConfig;

import java.net.MalformedURLException;
import java.net.URL;

public class MyBaseSeleniumConfig implements MyInterfaceSeleniumConfig {

    @Override
    public URL getRemoteUrl() {

        String remoteUrl = System.getProperty("webdriver.remote.url");
        try {
            return new URL(remoteUrl);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean isRemote() {
        String isRemote = System.getProperty("webdriver.remote");
        return Boolean.parseBoolean(isRemote);
    }
}
