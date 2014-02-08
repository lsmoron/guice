package com.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import com.resteasy.*;
import com.resteasy.StringBuilder;
import com.serlvlet.HelloSerlvlet;

/**
 * Created by luke on 2/7/14.
 */
public class MyGuiceServletConfig extends GuiceServletContextListener {

    @Override
    protected Injector getInjector() {
        return Guice.createInjector(new ServletModule()
        {
            @Override
            protected void configureServlets() {
                serve("/a").with(HelloSerlvlet.class);
            }
        }
                , new GuiceModule());
    }
}
