package com.domain.achilles.service.impl;

import com.domain.achilles.bean.DomainInfo;
import com.domain.achilles.bean.ManageQuery;
import com.domain.achilles.bean.PageInfoVO;
import com.domain.achilles.mapper.ManageMapper;
import com.domain.achilles.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018/9/1 0001 14:20
 * @Description:
 */
@Service
public class ManageServiceImpl implements ManageService {

    @Autowired
    private ManageMapper manageMapper;

    @Override
    public List<DomainInfo> listByPage(ManageQuery query) {

        PageInfoVO.startPage(query);

        List<DomainInfo> domainInfos = manageMapper.list();

        return domainInfos;
    }

    @Override
    public DomainInfo queryById(Long id) {

        return manageMapper.queryById(id);
    }
}



