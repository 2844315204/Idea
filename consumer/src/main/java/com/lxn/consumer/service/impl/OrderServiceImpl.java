package com.lxn.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.lxn.gmallinterface.bean.UserAddress;
import com.lxn.gmallinterface.service.OrderService;
import com.lxn.gmallinterface.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import java.util.Arrays;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
//    @Autowired
    @Reference//他是引用，类似于@Autowired，是dubbo自己提供的远程调用，从注册中心发现
    UserService userService;
    @HystrixCommand(fallbackMethod = "hello")//服务容错
    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户Id"+userId);
        //查询用户收获地址
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        System.out.println(userAddressList);
        return userAddressList;
    }

    public  List<UserAddress> hello(String userId){
        return Arrays.asList(new UserAddress(10,"测试地址","1","测试","测试"));
    }
}
