package org.baxter.infrastructure.client;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherSourceClient {

    private final HttpClient httpClient = HttpClient.newHttpClient();

    public HttpResponse<String> callAPI(final HttpRequest request) throws IOException, InterruptedException {
        return httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    }
}
