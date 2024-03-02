package org.baxter.model.report;

import java.util.Map;

public class IndividualWeatherReport {

    private final String name;
    private final Map<String, String> attributes;

    protected IndividualWeatherReport(
            final String name,
            final Map<String, String> attributes
    ) {
        this.name = name;
        this.attributes =  attributes;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }
}
