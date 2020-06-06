package com.jijian.ppt.controller;


import com.jijian.ppt.POJO.DTO.TokenPO;
import com.jijian.ppt.POJO.FileDetail;
import com.jijian.ppt.service.UserService;
import com.jijian.ppt.annotation.PassToken;
import com.jijian.ppt.utils.response.UniversalResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户相关接口
 * @author 郭树耸
 * @version 1.0
 * @date 2020/2/8 11:20
 */
@RestController
public class UserController {

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;


    /**
     * 用户微信小程序登录
     * @param code
     * @return
     */
    @PassToken
    @PostMapping("/login/wx")
    public UniversalResponseBody<TokenPO> userWxLogin(String code){
        return userService.userWxLogin(code);
    }


    /**
     * 获取用户的文件
     * @param userId
     * @return
     */
    @GetMapping("/user/files")
    public UniversalResponseBody<List<FileDetail>> getUserFiles(Integer userId){
        return userService.getUserFiles(userId);
    }

    /**
     * 删除文件
     * @apiNote  删除后文件后，返回用户的所有文件
     * @param userId
     * @param fileId
     * @return
     */
    @GetMapping("/user/file/delete")
    public UniversalResponseBody<List<FileDetail>> deleteUserFile(Integer userId,Integer fileId){
        return userService.deleteUserFile(userId,fileId);
    }
}
