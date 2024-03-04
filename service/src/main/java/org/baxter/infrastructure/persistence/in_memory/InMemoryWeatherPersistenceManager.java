package org.baxter.infrastructure.persistence.in_memory;

import org.baxter.infrastructure.persistence.WeatherPersistenceManager;
import org.baxter.model.report.WeatherReport;

import java.util.Date;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryWeatherPersistenceManager implements WeatherPersistenceManager {

    private final ConcurrentHashMap<Date, WeatherReport> weatherReportMap =
            new ConcurrentHashMap<>();

    @Override
    public void storeWeatherReport(final WeatherReport weatherReport) {
        weatherReportMap.put(weatherReport.getDate(), weatherReport);
    }

    @Override
    public Optional<WeatherReport> getWeatherReport(final Date date) {
        return Optional.ofNullable(weatherReportMap.get(date));
    }
}
