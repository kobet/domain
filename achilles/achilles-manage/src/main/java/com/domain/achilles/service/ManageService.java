package com.domain.achilles.service;

import com.domain.achilles.bean.DomainInfo;
import com.domain.achilles.bean.ManageQuery;

import java.util.List;

/**
 * @Author: Administrator
 * @Date: 2018/9/1 0001 14:20
 * @Description:
 */
public interface ManageService {

    List<DomainInfo> listByPage(ManageQuery query);

    DomainInfo queryById(Long id);
}
