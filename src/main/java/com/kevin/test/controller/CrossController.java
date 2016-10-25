package com.kevin.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.kevin.test.common.constants.HttpConstant;
import com.kevin.test.common.utils.MessageHandleUtil;

/**
 * 跨域请求
 * 
 * @author: Kai.Zhao
 */
@RestController
@RequestMapping(value = "api", produces = HttpConstant.APPLICATION_JSON)
@CrossOrigin(origins = "http://img.kevin.com", allowedHeaders = "*", methods = RequestMethod.POST, allowCredentials = "true", maxAge = 1800)
public class CrossController {
    
    private static final Logger LOG = LogManager.getLogger(CrossController.class);
    
    @RequestMapping("getMessage")
    public String getMessage(HttpServletRequest request) {
        LOG.info("请求成功! 参数：{}", JSON.toJSONString(request.getCookies()));
        return MessageHandleUtil.buildSuccessResult();
    }
}
