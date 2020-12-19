package com.hjb.springboot.web.springbootweb.config;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        System.out.println("this is my Filter:" + httpServletRequest.getRequestURI());
        chain.doFilter(httpServletRequest, response);
    }

    @Override
    public void destroy() {

    }
}
