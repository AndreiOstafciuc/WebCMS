package com.cms.security;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by andre on 03/03/17.
 */
public class PermissionCheckerFilter implements Filter{

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest,servletResponse);
    }

    public void destroy() {

    }
}
