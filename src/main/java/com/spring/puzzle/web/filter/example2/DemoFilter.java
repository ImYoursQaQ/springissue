package com.spring.puzzle.web.filter.example2;

import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

@Component
public class DemoFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        try {
            //模拟异常
            System.out.println("Filter处理中时发生异常");
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("catch Exception");
        }finally {
            chain.doFilter(request, response);
        }
    }

    /**
     * filter 未能正确处理异常，导致请求重复处理
     */

}

