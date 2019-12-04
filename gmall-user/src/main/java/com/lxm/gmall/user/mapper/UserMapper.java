package com.lxm.gmall.user.mapper;

import com.lxm.gmall.user.bean.UmsMember;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface UserMapper {

    List<UmsMember> selectAllUser();
}
