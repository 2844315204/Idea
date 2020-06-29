//package com.lxn.provider.config;
//
//import com.alibaba.dubbo.config.*;
//import com.lxn.gmallinterface.service.UserService;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class MyDubboConfig {
//    @Bean
//    public ApplicationConfig applicationConfig(){
//        ApplicationConfig config = new ApplicationConfig();
//        config.setName("providers");
////        config.setId("provider");
//        return config;
//    }
//
//    @Bean
//    public RegistryConfig registryConfig(){
//        RegistryConfig config = new RegistryConfig();
//        config.setProtocol("zookeeper");
//        config.setAddress("127.0.0.1:2181");
//        return config;
//    }
//    @Bean
//    public ProtocolConfig protocolConfig(){
//        ProtocolConfig config = new ProtocolConfig();
//        config.setName("dubbo");
//        config.setPort(20881);
//        return config;
//    }
//    //配置扫描服务的配置
//    @Bean
//    public ServiceConfig<UserService> serviceServiceConfig(UserService userService){
//        ServiceConfig<UserService> config = new ServiceConfig<>();
//        //扫描泛型接口的类
//        config.setInterface(UserService.class);
//        //扫描接口暴露的对象，从容器中拿
//        config.setRef(userService);
//        //设置版本
//        config.setVersion("1.0.0");
//        return config;
//    }
//    @Bean
//    public MonitorConfig monitorConfig(){
//        MonitorConfig config = new MonitorConfig();
//        config.setProtocol("registry");
//        return config;
//    }
//}
