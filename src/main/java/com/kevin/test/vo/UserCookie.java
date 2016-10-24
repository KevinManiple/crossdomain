package com.kevin.test.vo;

import javax.servlet.http.Cookie;

public class UserCookie {
    
    private String userName;
    
    private String uuid;
    
    private String token;
    
    private String openId;
    
    private String model;
    
    private String app_version;
    
    private String imei;
    
    private String elapsedtime;
    
    private String status;
    
    private String verifyKey;
    
    private String vaccsign;
    
    private String has;
    
    private String cs;
    
    private String an;
    
    private String av;
    
    private String newVerifyKey;
    
    private String emmc;
    
    private String ufsid;
    
    private String packageName;
    
    private String pointChannel;
    
    private Cookie[] cookies;
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getUuid() {
        return uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    
    public String getToken() {
        return token;
    }
    
    public void setToken(String token) {
        this.token = token;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getOpenId() {
        return openId;
    }
    
    public void setOpenId(String openId) {
        this.openId = openId;
    }
    
    public String getVerifyKey() {
        return verifyKey;
    }
    
    public void setVerifyKey(String verifyKey) {
        this.verifyKey = verifyKey;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public String getImei() {
        return imei;
    }
    
    public void setImei(String imei) {
        this.imei = imei;
    }
    
    public String getApp_version() {
        return app_version;
    }
    
    public void setApp_version(String app_version) {
        this.app_version = app_version;
    }
    
    public String getVaccsign() {
        return vaccsign;
    }
    
    public void setVaccsign(String vaccsign) {
        this.vaccsign = vaccsign;
    }
    
    public String getElapsedtime() {
        return elapsedtime;
    }
    
    public void setElapsedtime(String elapsedtime) {
        this.elapsedtime = elapsedtime;
    }
    
    public String getHas() {
        return has;
    }
    
    public void setHas(String has) {
        this.has = has;
    }
    
    public String getCs() {
        return cs;
    }
    
    public void setCs(String cs) {
        this.cs = cs;
    }
    
    public String getAn() {
        return an;
    }
    
    public void setAn(String an) {
        this.an = an;
    }
    
    public String getAv() {
        return av;
    }
    
    public void setAv(String av) {
        this.av = av;
    }
    
    public String getNewVerifyKey() {
        return newVerifyKey;
    }
    
    public void setNewVerifyKey(String newVerifyKey) {
        this.newVerifyKey = newVerifyKey;
    }
    
    public Cookie[] getCookies() {
        return cookies;
    }
    
    public void setCookies(Cookie[] cookies) {
        this.cookies = cookies;
    }
    
    public String getEmmc() {
        if (null == emmc || "".equals(emmc.trim())) {
            return ufsid;
        } else {
            return emmc;
        }
    }
    
    public void setEmmc(String emmc) {
        this.emmc = emmc;
    }
    
    public String getUfsid() {
        return ufsid;
    }
    
    public void setUfsid(String ufsid) {
        this.ufsid = ufsid;
    }
    
    public String getPackageName() {
        return packageName;
    }
    
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }
    
    public String getPointChannel() {
        return pointChannel;
    }
    
    public void setPointChannel(String pointChannel) {
        this.pointChannel = pointChannel;
    }
}
