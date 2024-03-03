package org.baxter.service;

import org.baxter.model.report.WeatherReport;
import org.baxter.model.source.WeatherSource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WeatherService {

    private final List<WeatherSource> weatherSources = new ArrayList<>();

    public WeatherReport getWeatherReport() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void generateWeatherReport(final Date date) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    void addWeatherSource(final WeatherSource weatherSource) {
        weatherSources.add(weatherSource);
    }


}
