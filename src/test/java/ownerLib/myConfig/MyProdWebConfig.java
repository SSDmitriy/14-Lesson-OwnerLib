package ownerLib.myConfig;

public class MyProdWebConfig implements MyInterfaceWebConfig {

    public String getMyBaseUrl(){
        return "https://github.com";
    }

    public String getUsername(){
        return "user0";
    }

    public String getPassword(){
        return "123456";
    }
}
