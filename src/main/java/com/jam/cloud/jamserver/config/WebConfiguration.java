package com.jam.cloud.jamserver.config;

import com.jam.cloud.jamserver.filter.AppFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {

    @Bean
    public FilterRegistrationBean appFilterRegistration(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();

        filterRegistrationBean.setFilter(new AppFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setName("myfilter");
        filterRegistrationBean.setOrder(1);

        return filterRegistrationBean;
    }
}
