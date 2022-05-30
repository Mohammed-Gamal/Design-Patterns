package ProxyDP;

public class Etisalat implements ISP {

    // represents the browsing speed in MBs
    private int browsingSpeed = 10;

    @Override
    public String serverSite(String url) {
        return String.format("URL: https://www.%s.com\n", url);
    }


    // Setter & Getter
    public int getBrowsingSpeed() {
        return browsingSpeed;
    }

    public void setBrowsingSpeed(int browsingSpeed) {
        this.browsingSpeed = browsingSpeed;
    }
    
}