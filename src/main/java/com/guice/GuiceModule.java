package com.guice;

import com.google.inject.AbstractModule;
import com.resteasy.*;
import com.resteasy.StringBuilder;

/**
 * Created by luke on 2/7/14.
 */
public class GuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Builder.class).to(StringBuilder.class);
        bind(SampleService.class);
    }
}
