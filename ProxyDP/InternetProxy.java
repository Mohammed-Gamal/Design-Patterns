package ProxyDP;

import java.util.Arrays;
import java.util.List;

public class InternetProxy implements ISP {

    // Array of the blocked sites
    private List<String> blockedSites = Arrays.asList("facebook", "twitch", "instagram");

    @Override
    public String serverSite(String url) {
        // Print the Domain name of the URL
        logSite(url);

        // if the site is blocked, return a message
        if (blockedSites.contains(url)) {
            return "Alert, this site is blocked!\n";
        }

        // if not blocked, return the URL
        return new Etisalat().serverSite(url);
    }

    // logSite method to print the domain name of the URL
    private void logSite(String url) {
        System.out.printf("Domain: %s\n", url);
    }
    
}