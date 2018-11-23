package com.data.generator;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.util.Timer;


public class DataGenerator {

    public static HttpClient initHttpClient() {
        HttpClient httpClient = HttpClientBuilder.create().build();
        return httpClient;
    }

    public static void main(String []args) {
        String url = "http://zuul-server:8762/vehicle-monitor/vehicle";
        int interval = 60;

        Timer timer = new Timer("Timer");
        long delay = 0;
        long period = interval * 1000;
        HttpClient httpClient = initHttpClient();
        timer.scheduleAtFixedRate(new SendDataTask(httpClient, url), delay, period);
    }
}

