package com.lxn.gmallinterface.service;

import com.lxn.gmallinterface.bean.UserAddress;

import java.util.List;

public interface UserService {
    public List<UserAddress> getUserAddressList(String userId);
}
