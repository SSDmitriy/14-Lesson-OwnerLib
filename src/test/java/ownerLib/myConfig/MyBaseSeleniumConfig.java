package ownerLib.myConfig;

import java.net.MalformedURLException;
import java.net.URL;

public class MyBaseSeleniumConfig implements MyInterfaceSeleniumConfig {

    @Override
    public URL getRemoteUrl() {
        try {
            return new URL("http://selenoid:4444/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean isRemote() {
        return false;
    }
}
