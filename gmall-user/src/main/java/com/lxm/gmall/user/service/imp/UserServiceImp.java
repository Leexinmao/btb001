package com.lxm.gmall.user.service.imp;

import com.lxm.gmall.user.bean.UmsMember;
import com.lxm.gmall.user.mapper.UserMapper;
import com.lxm.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userMapper.selectAllUser();


        return umsMembers;
    }
}
