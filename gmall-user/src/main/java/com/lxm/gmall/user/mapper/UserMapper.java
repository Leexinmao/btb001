package com.lxm.gmall.user.mapper;

import com.lxm.gmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


public interface UserMapper extends Mapper<UmsMember> {

    List<UmsMember> selectAllUser();
}
