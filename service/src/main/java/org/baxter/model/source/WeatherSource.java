package org.baxter.model.source;

import org.baxter.client.constructor_strategies.WeatherSourceRequestConstructorStrategy;

public class WeatherSource {

    private final WeatherSourceAPIConfig apiConfig;
    private final WeatherSourceRequestConstructorStrategy requestConstructorStrategy;

    // TODO: content parser strat

    WeatherSource(
            final WeatherSourceAPIConfig apiConfig,
            final WeatherSourceRequestConstructorStrategy requestConstructorStrategy
    ) {
        this.apiConfig = apiConfig;
        this.requestConstructorStrategy = requestConstructorStrategy;
    }

    public WeatherSourceAPIConfig getApiConfig() {
        return apiConfig;
    }

    public WeatherSourceRequestConstructorStrategy getRequestConstructorStrategy() {
        return requestConstructorStrategy;
    }

}
