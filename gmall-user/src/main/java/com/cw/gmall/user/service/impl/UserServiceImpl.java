package com.cw.gmall.user.service.impl;

import com.cw.gmall.user.bean.UmsMember;
import com.cw.gmall.user.bean.UmsMemberReceiveAddress;
import com.cw.gmall.user.mapper.UserAddressMapper;
import com.cw.gmall.user.mapper.UserMapper;
import com.cw.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author weicaiwang
 * @date 2020/2/3 14:52
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserAddressMapper userAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userMapper.selectAll();
        return umsMembers;
    }

    @Override
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressById(String memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId( memberId );
        //List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userAddressMapper.selectByExample( umsMemberReceiveAddress );
        List<UmsMemberReceiveAddress> select = userAddressMapper.select( umsMemberReceiveAddress );
        return select;
    }
}
