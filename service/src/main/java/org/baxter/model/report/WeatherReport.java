package org.baxter.model.report;

import java.util.Date;
import java.util.List;

public class WeatherReport {

    private final Date date;
    private final WeatherReportState state;
    private final List<IndividualWeatherReport> weatherReports;

    protected WeatherReport(
            final Date date,
            final WeatherReportState state,
            final List<IndividualWeatherReport> weatherReports
    ) {
        this.date = date;
        this.state = state;
        this.weatherReports = weatherReports;
    }

    public Date getDate() {
        return date;
    }

    public WeatherReportState getState() {
        return state;
    }

    public List<IndividualWeatherReport> getWeatherReports() {
        return weatherReports;
    }
}
