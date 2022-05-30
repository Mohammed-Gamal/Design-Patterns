package ProxyDP;

import java.util.Arrays;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        // Our sites array
        List<String> sites = Arrays.asList("facebook", "youtube", "twitter", "twitch", "instagram", "cnn");

        // Create our proxy
        ISP internet = new InternetProxy();

        // Print the sites
        for (String site : sites) {
            System.out.println(internet.serverSite(site));
        }

    }
    
}