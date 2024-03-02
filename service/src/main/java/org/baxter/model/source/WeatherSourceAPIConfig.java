package org.baxter.model.source;

import java.util.Map;

public class WeatherSourceAPIConfig {

    private final String domainURL;
    private final Map<String, String> params;


    WeatherSourceAPIConfig(
            final String domainURL,
            final Map<String, String> params
    ) {
        this.domainURL = domainURL;
        this.params = params;
    }


    public String getDomainURL() {
        return domainURL;
    }

    public Map<String, String> getParams() {
        return params;
    }
}
