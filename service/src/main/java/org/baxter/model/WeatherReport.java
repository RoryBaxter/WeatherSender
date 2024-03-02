package org.baxter.model;

import java.util.List;

public class WeatherReport {

    private final WeatherReportState state;
    private final List<IndividualWeatherReport> weatherReports;

    protected WeatherReport(
            final WeatherReportState state,
            final List<IndividualWeatherReport> weatherReports
    ) {
        this.state = state;
        this.weatherReports = weatherReports;
    }

    public WeatherReportState getState() {
        return state;
    }

    public List<IndividualWeatherReport> getWeatherReports() {
        return weatherReports;
    }
}
