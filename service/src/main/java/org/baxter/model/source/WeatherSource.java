package org.baxter.model.source;

public class WeatherSource {

    private final WeatherSourceAPIConfig apiConfig;
    private final WeatherSourceStrategy strategy;

    // TODO: content parser strat

    WeatherSource(
            final WeatherSourceAPIConfig apiConfig,
            final WeatherSourceStrategy requestConstructorStrategy
    ) {
        this.apiConfig = apiConfig;
        this.strategy = requestConstructorStrategy;
    }

    public WeatherSourceAPIConfig getApiConfig() {
        return apiConfig;
    }

    public WeatherSourceStrategy getStrategy() {
        return strategy;
    }

}
