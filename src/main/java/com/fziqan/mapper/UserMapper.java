package com.fziqan.mapper;

import com.fziqan.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @PackageName:com.fziqan.mapper
 * @ClassName:UserMapper
 * @Description:
 * @author:FziqAn
 * @date 2019/5/27 16:53
 */
@Mapper
public interface UserMapper {
    /**
     * 查询所有
     *
     * @return
     */
    List<User> findAll();
}
