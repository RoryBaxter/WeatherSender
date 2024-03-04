package org.baxter.model.source;

import org.baxter.model.report.IndividualWeatherReport;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Date;
import java.util.function.BiFunction;
import java.util.function.Function;

public class WeatherSourceStrategy {

    private final BiFunction<WeatherSourceAPIConfig, Date, HttpRequest> constructionStrategy;
    private final Function<HttpResponse<String>, IndividualWeatherReport> readerStrategy;

    WeatherSourceStrategy(
            final BiFunction<WeatherSourceAPIConfig, Date, HttpRequest> constructionStrategy,
            final Function<HttpResponse<String>, IndividualWeatherReport> readerStrategy
    ) {
        this.constructionStrategy = constructionStrategy;
        this.readerStrategy = readerStrategy;
    }

    public HttpRequest buildRequest(final WeatherSourceAPIConfig weatherSourceAPIConfig, final Date date) {
        return constructionStrategy.apply(weatherSourceAPIConfig, date);
    }

    public IndividualWeatherReport parseResponse(final HttpResponse<String> response) {
        return readerStrategy.apply(response);
    }
}
