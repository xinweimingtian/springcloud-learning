package com.ming.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@EnableDiscoveryClient
@SpringBootApplication
public class HystrixDashboardApplication {

    // 说明  如果jquery版本太高  那么页面将无法展示 会出现e.indexOf is not a function 错误
    // 需要修改spring-cloud-netflix-hystrix-dashboard-2.2.3.RELEASE
    // templates\hystrix\monitor.ftlh
    // 把 $(window).load(function() {
    // 改为 $(window).on('load', function(){
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardApplication.class, args);
    }

}
