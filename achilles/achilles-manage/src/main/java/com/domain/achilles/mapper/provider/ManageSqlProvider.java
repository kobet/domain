package com.domain.achilles.mapper.provider;

import org.apache.ibatis.jdbc.SQL;

/**
 * @Author: Administrator
 * @Date: 2018/9/1 0001 20
 * @Description:
 */
public class ManageSqlProvider {

    public String list() {
        return new SQL() {{
            SELECT("`id`, `punycode`, `suffix`, `prefix`, `registrar`");
            FROM("domain_info");
        }}.toString();
    }
}
