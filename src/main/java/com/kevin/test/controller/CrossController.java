package com.kevin.test.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.kevin.test.common.constants.HttpConstant;
import com.kevin.test.common.utils.MessageHandleUtil;
import com.kevin.test.vo.UserCookie;

/**
 * 跨域请求
 * 
 * @author: Kai.Zhao
 */
@RestController
@RequestMapping(value = "api", produces = HttpConstant.APPLICATION_JSON)
@CrossOrigin(origins = "http://img.kevin.com", allowedHeaders = "*", maxAge = 1800)
public class CrossController {
    
    private static final Logger LOG = LogManager.getLogger(CrossController.class);
    
    /**
     * 测试请求
     * 
     * @param cookie
     * @return
     */
    @RequestMapping("getMessage")
    public String getMessage(UserCookie cookie) {
        LOG.info("请求成功! 参数：{}", JSON.toJSONString(cookie));
        return MessageHandleUtil.buildSuccessResult();
    }
}
