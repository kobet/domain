package com.domain.achilles.bean;

import lombok.Data;

import java.sql.Date;

/**
 * @Author: Administrator
 * @Date: 2018/9/1 0001 14:32
 * @Description:
 */
@Data
public class DomainInfo {

    private Long id;

    /**
     * 域名
     */
    private String punycode;

    /**
     * 后缀
     */
    private String suffix;

    /**
     * 前缀
     */
    private String prefix;

    /**
     * 注册商
     */
    private String registrar;

    /**
     * 是否备案 1 已备案 2 未备案
     */
    private Integer isIcp;

    /**
     * 备案编号
     */
    private String icpNo;

    /**
     * 长度
     */
    private Integer length;

    /**
     * 备案性质
     */
    private String icpNature;

    /**
     * 网站标题
     */
    private String siteTitle;

    /**
     * 注册日期
     */
    private Date registerDate;

    /***
     * 过期日期
     */
    private Date expireDate;

    /**
     * QQ状态 1 正常 0 已拦截
     */
    private Integer qqStatus;

    /**
     * 微信状态 1 正常 0 已拦截
     */
    private Integer wxStatus;

    /**
     * 价格
     */
    private Integer price;

    /**
     * 代理站点出售url地址
     */
    private String soldUrl;

    /**
     *是否推荐 1 推荐 0 不推荐
     */
    private Integer isRecommend;

    /**
     * icp接入商
     */
    private String icpJoinUp;

    /**
     * 是否独立备案 1 独立 0 共享备案
     */
    private Integer icpIndependence;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 描述
     */
    private String description;




}
