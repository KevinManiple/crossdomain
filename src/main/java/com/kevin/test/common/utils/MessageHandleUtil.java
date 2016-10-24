package com.kevin.test.common.utils;

import com.alibaba.fastjson.JSONObject;
import com.kevin.test.common.constants.HttpConstant;
import com.kevin.test.common.constants.HttpConstant.ReturnCode;
import com.kevin.test.common.constants.HttpConstant.ReturnMessage;

public class MessageHandleUtil {
    
    public static String buildResult(int status, String msg, Object data) {
        JSONObject json = new JSONObject();
        json.put(HttpConstant.STATUS, status);
        json.put(HttpConstant.MSG, msg);
        json.put(HttpConstant.DATA, data);
        return json.toJSONString();
    }
    
    public static String buildSuccessResult(Object data) {
        JSONObject json = new JSONObject();
        json.put(HttpConstant.STATUS, ReturnCode.SUCCESS);
        json.put(HttpConstant.MSG, ReturnMessage.SUCCESS);
        json.put(HttpConstant.DATA, data);
        return json.toJSONString();
    }
    
    public static String buildResult(int status, String msg) {
        JSONObject json = new JSONObject();
        json.put(HttpConstant.STATUS, status);
        json.put(HttpConstant.MSG, msg);
        return json.toJSONString();
    }
    
    public static String buildServiceErrorResult() {
        JSONObject json = new JSONObject();
        json.put(HttpConstant.STATUS, ReturnCode.SERVICE_ERROR);
        json.put(HttpConstant.MSG, ReturnMessage.SERVICE_ERROR);
        return json.toJSONString();
    }
    
    public static String buildSuccessResult() {
        JSONObject json = new JSONObject();
        json.put(HttpConstant.STATUS, ReturnCode.SUCCESS);
        json.put(HttpConstant.MSG, ReturnMessage.SUCCESS);
        return json.toJSONString();
    }
}