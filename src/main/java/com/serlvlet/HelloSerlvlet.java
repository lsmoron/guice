package com.serlvlet;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.resteasy.Builder;
import com.resteasy.SampleService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by luke on 2/7/14.
 */
@Singleton
public class HelloSerlvlet extends HttpServlet {

    @Inject
    private Builder builder;

//    @Inject
//    private SampleService sampleService;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(builder.build());
        req.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(req, resp);
    }


}
