package com.thepracticaldeveloper.devgame.util;

import org.apache.commons.codec.binary.Base64;
import org.springframework.http.HttpHeaders;

public final class ApiHttpUtils {

    private ApiHttpUtils() {
    }

    public static HttpHeaders getHeaders(String token) {
        HttpHeaders headers = new HttpHeaders();
        String creds = new String(Base64.encodeBase64((token + ":").getBytes()));
        headers.add("Authorization", "Basic " + creds);
        headers.add("Accept", "application/json");
        return headers;
    }

}
