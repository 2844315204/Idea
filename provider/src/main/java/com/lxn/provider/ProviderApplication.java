package com.lxn.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

import java.io.IOException;
//方法1
@EnableHystrix//开启服务容错
@EnableDubbo//开启基于dubbo功能
//@EnableDubbo(scanBasePackages = "com.lxn.provider") 方法2
@SpringBootApplication
public class ProviderApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(ProviderApplication.class, args);

    }

}
