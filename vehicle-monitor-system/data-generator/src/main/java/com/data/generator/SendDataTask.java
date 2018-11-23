package com.data.generator;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.TimerTask;

public class SendDataTask extends TimerTask {
    HttpClient httpClient;
    String url;
    String vids [] = {"YS2R4X20005399401", "VLUR4X20009093588","VLUR4X20009048066","YS2R4X20005388011", "YS2R4X20005387949","YS2R4X20005387055"};

    public SendDataTask(HttpClient httpClient, String url) {
        super();
        this.httpClient = httpClient;
        this.url = url;
    }

    public void run() {

        for (String vid : vids) {
            if (isConnected()) {sendRequest(vid);}
        }
    }

    public int sendRequest(String vid)  {
        try{
            HttpPost post = new HttpPost(url);
            post.setHeader("Content-type", "application/json");
            String contentStr = "{\"vehicleId\":\"" + vid + "\"}";
            StringEntity input = new StringEntity("{\"vehicleId\":\"" + vid + "\"}");
            post.setEntity(input);
            HttpResponse response = httpClient.execute(post);
            System.out.println("data-generation req >>>" + contentStr);
            System.out.println("data-generation resp <<< " +  EntityUtils.toString(response.getEntity()));
        }
        catch(IOException e) {
            System.out.println("Error in sending data, exception: " + e);
            return 0;
        }
        return 1;

    }

    public boolean isConnected () {
        Random random = new Random();
        boolean b = random.nextBoolean();
        return b;
    }

}