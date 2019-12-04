package com.lxm.gmall.user.service;

import com.lxm.gmall.user.bean.UmsMember;

import java.util.List;

public interface UserService {




    List<UmsMember>  getAllUser();

    List<UmsMember> ts(String id);

//    UmsMember ts(String id);


}



