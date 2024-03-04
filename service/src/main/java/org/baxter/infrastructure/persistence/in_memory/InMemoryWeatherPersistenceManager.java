package org.baxter.infrastructure.persistence.in_memory;

import org.baxter.infrastructure.persistence.WeatherPersistenceManager;
import org.baxter.model.report.WeatherReport;

import java.util.Date;
import java.util.Optional;

public class InMemoryWeatherPersistenceManager implements WeatherPersistenceManager {

    @Override
    public void storeWeatherReport(final WeatherReport weatherReport) {
        throw new UnsupportedOperationException("NYI");
    }

    @Override
    public Optional<WeatherReport> getWeatherReport(final Date date) {
        throw new UnsupportedOperationException("NYI");
    }
}
