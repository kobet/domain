package com.domain.achilles.mapper;

import com.domain.achilles.bean.DomainInfo;
import com.domain.achilles.mapper.provider.ManageSqlProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
 * @Author: Administrator
 * @Date: 2018/9/1 0001 54
 * @Description:
 */
@Mapper
public interface ManageMapper {

    @SelectProvider(type = ManageSqlProvider.class, method = "list")
    List<DomainInfo> list();

    @SelectProvider(type = ManageSqlProvider.class, method = "queryById")
    DomainInfo queryById(Long id);
}
