package com.lxn.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lxn.gmallinterface.bean.UserAddress;
import com.lxn.gmallinterface.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Service//暴露服务
@Component
public class UserServiceImpl implements UserService {

    @HystrixCommand//出现异常，就可以开启容错
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress addressd1 = new UserAddress(1, "郑州市科技园三号楼", "1", "赵老师", "132715897");
        UserAddress addressd2 = new UserAddress(2, "郑州市科技园四号楼", "1", "李老师", "182715897");

        //用于测试服务容错
        if (Math.random()<0.5){
            throw new RuntimeException();
        }

        return Arrays.asList(addressd1,addressd2);
    }
}
