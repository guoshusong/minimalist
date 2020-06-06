package com.jijian.ppt.service;

import com.jijian.ppt.POJO.DTO.TokenPO;
import com.jijian.ppt.POJO.FileDetail;
import com.jijian.ppt.utils.response.UniversalResponseBody;

import java.util.List;


/**
 * @author 郭树耸
 * @version 1.0
 * @date 2020/2/2 14:35
 */
public interface UserService {

    /**
     * 用户微信登录
     *
     * @param code
     * @return
     * @throws Exception
     */
    UniversalResponseBody<TokenPO> userWxLogin(String code);

    /**
     * 获取用户的文件
     * @param userId
     * @return
     */
    UniversalResponseBody<List<FileDetail>> getUserFiles(Integer userId);


    /**
     * 删除用户文件
     * @param userId
     * @param fileId
     * @return
     */
    UniversalResponseBody<List<FileDetail>> deleteUserFile(Integer userId,Integer fileId);
}
