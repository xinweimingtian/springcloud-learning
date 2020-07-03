package com.ming.cloud.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.springframework.stereotype.Component;

import com.netflix.hystrix.strategy.concurrency.HystrixRequestContext;

/**
 * @Description HystrixRequestContextFilter
 * @Author weihuiming
 * @Date 2020/7/3
 *
 * 在缓存使用过程中，我们需要在每次使用缓存的请求前后对HystrixRequestContext进行初始化和关闭
 * 通过使用过滤器，在每个请求前后初始化和关闭HystrixRequestContext来解决该问题
 * 否则容易出错
 * java.lang.IllegalStateException: Request caching is not available. Maybe you need to initialize the HystrixRequestContext?
 *
 */
@Component
@WebFilter(urlPatterns = "/*", asyncSupported = true)
public class HystrixRequestContextFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HystrixRequestContext context = HystrixRequestContext.initializeContext();
        try {
            chain.doFilter(request, response);
        } finally {
            context.close();
        }
    }
}
