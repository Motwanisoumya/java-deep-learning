package com.example.service;

import com.example.external.ExternalApi;

/**
 * Your business‐logic class that depends on ExternalApi.
 */
public class MyService {
    private final ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    /**
     * Fetches data via ExternalApi—could be an HTTP call, DB call, etc.
     */
    public String fetchData() {
        return api.getData();
    }
}