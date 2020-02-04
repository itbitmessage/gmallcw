package com.cw.gmall.user.controller;

import com.cw.gmall.user.bean.UmsMember;
import com.cw.gmall.user.bean.UmsMemberReceiveAddress;
import com.cw.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author weicaiwang
 * @date 2020/2/3 14:50
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;


    @ResponseBody
    @GetMapping("getUmsMemberReceiveAddressByIdUser")
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressById( String memberId){

        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getUmsMemberReceiveAddressById(memberId);

        return umsMemberReceiveAddresses;
    }

    @ResponseBody
    @GetMapping("searchAllUser")
    public List<UmsMember> searchAllUser(){

        List<UmsMember> umsMembers = userService.getAllUser();

        return umsMembers;
    }

    @ResponseBody
    @GetMapping("index")
    public String index(){
        return "hello user";
    }
}
