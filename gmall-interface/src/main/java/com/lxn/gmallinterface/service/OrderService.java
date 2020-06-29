package com.lxn.gmallinterface.service;

import com.lxn.gmallinterface.bean.UserAddress;

import java.util.List;

public interface OrderService {
    public List<UserAddress> initOrder(String userId);
}
