package com.resteasy;

/**
 * Created by luke on 2/7/14.
 */
public class StringBuilder implements Builder {
    @Override
    public String build() {
        return "Hello";
    }
}
