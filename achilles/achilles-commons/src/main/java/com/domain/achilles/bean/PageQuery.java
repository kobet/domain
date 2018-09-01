package com.domain.achilles.bean;

import lombok.Data;

/**
 * @Author: Administrator
 * @Date: 2018/9/1 0001 10
 * @Description:
 */
@Data
public class PageQuery {

    protected Integer pageSize = 20;

    protected Integer current = 1;
}
