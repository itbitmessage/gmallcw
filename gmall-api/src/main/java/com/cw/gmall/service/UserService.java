package com.cw.gmall.service;


import com.cw.gmall.bean.UmsMember;
import com.cw.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @author weicaiwang
 * @date 2020/2/3 14:51
 */
public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressById(String memberId);
}
