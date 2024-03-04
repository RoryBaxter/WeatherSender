package org.baxter.infrastructure.persistence;

import org.baxter.model.report.WeatherReport;

import java.util.Date;
import java.util.Optional;

public interface WeatherPersistenceManager {

    void storeWeatherReport(WeatherReport weatherReport);

    Optional<WeatherReport> getWeatherReport(Date date);

}
