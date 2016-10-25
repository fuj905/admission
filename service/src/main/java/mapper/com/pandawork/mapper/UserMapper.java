package com.pandawork.mapper;

import com.pandawork.common.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * UserMapper
 *
 * @author: zhangteng
 * @time: 2015/3/24 17:02
 */
public interface UserMapper {
    public void newUser(User user) throws Exception;
}
