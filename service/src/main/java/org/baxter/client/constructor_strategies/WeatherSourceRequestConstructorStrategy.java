package org.baxter.client.constructor_strategies;

import org.baxter.model.source.WeatherSourceAPIConfig;

import java.net.http.HttpRequest;
import java.util.Date;
import java.util.function.BiFunction;

public class WeatherSourceRequestConstructorStrategy {

    BiFunction<WeatherSourceAPIConfig, Date, HttpRequest> constructionStrategy;

    WeatherSourceRequestConstructorStrategy(final BiFunction<WeatherSourceAPIConfig, Date, HttpRequest> constructionStrategy) {
        this.constructionStrategy = constructionStrategy;
    }

    protected HttpRequest buildURI(final WeatherSourceAPIConfig weatherSourceAPIConfig, final Date date) {
        return constructionStrategy.apply(weatherSourceAPIConfig, date);
    }
}
