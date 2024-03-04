package org.baxter.service;

import org.baxter.infrastructure.client.WeatherSourceClient;
import org.baxter.model.report.IndividualWeatherReport;
import org.baxter.model.source.WeatherSource;
import org.baxter.model.source.WeatherSourceAPIConfig;
import org.baxter.model.source.WeatherSourceStrategy;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class WeatherService {

    private final List<WeatherSource> weatherSources = new ArrayList<>();
    private final WeatherSourceClient client;

    WeatherService(
            final WeatherSourceClient client
    ) {
        this.client = client;
    }

    public void generateWeatherReport() {
        List<IndividualWeatherReport> individualWeatherReports = new ArrayList<>();
        Calendar today = Calendar.getInstance();
        today.set(Calendar.HOUR_OF_DAY, 0);
        Date todayDate = today.getTime();
        weatherSources.forEach(
                weatherSource -> {
                    WeatherSourceAPIConfig apiConfig = weatherSource.getApiConfig();
                    WeatherSourceStrategy strategy = weatherSource.getStrategy();
                    HttpRequest request = strategy.buildRequest(apiConfig, todayDate);
                    HttpResponse<String> response;
                    try {
                        response = client.callAPI(request);
                    } catch (IOException | InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    individualWeatherReports.add(strategy.parseResponse(response));
                }
        );
        // TODO construct weather report
        // TODO store report
        throw new UnsupportedOperationException("Not yet implemented");
    }

    void addWeatherSource(final WeatherSource weatherSource) {
        weatherSources.add(weatherSource);
    }


}
