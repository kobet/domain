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
            SELECT("`id`, `punycode`, `suffix`, `prefix`, `registrar`, `price`, `register_date` AS registerDate");
            SELECT("`qq_status` AS qqStatus, `wx_status` AS wxStatus, `expire_date` AS expireDate");
            SELECT("`icp_nature` AS icpNature, `icp_no` AS icpNo");
            FROM("domain_info");
        }}.toString();
    }

    public String queryById() {
        return new SQL() {{
            SELECT("`id`, `punycode`, `suffix`, `prefix`, `registrar`, `price`, `register_date` AS registerDate");
            SELECT("`qq_status` AS qqStatus, `wx_status` AS wxStatus, `expire_date` AS expireDate");
            SELECT("`icp_nature` AS icpNature, `icp_no` AS icpNo");
            FROM("domain_info");
            WHERE("`id` = #{id}");
        }}.toString();
    }
}
