package com.example.external;

/**
 * Represents some HTTP / remote service you cannot—or 
 * shouldn’t—call directly from a unit test.
 */
public interface ExternalApi {
    String getData();
}