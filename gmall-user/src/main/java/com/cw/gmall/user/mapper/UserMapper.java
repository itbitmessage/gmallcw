package com.cw.gmall.user.mapper;

import com.cw.gmall.bean.UmsMember;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author weicaiwang
 * @date 2020/2/3 14:55
 */
@Repository
public interface UserMapper extends Mapper<UmsMember> {

    List<UmsMember> getAllUser();
}
