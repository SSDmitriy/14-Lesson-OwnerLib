package ownerLib.myConfig;

public class MyPrereleaseWebConfig implements MyInterfaceWebConfig {

    public String getMyBaseUrl(){
        return "https://prerelease.github.com";
    }

    public String getUsername(){
        return "user-test";
    }

    public String getPassword(){
        return "123456-test";
    }
}
