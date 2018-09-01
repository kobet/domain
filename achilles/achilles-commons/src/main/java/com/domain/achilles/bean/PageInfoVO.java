package com.domain.achilles.bean;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.Data;

import java.util.List;

@Data
public class PageInfoVO<T> {

    public static void startPage(PageQuery query) {
        PageHelper.startPage(query.getCurrent(), query.getPageSize());
    }

    public static <U> PageInfoVO<U> getInstance(List<U> list) {
        return new PageInfoVO<>(list);
    }

    public PageInfoVO() {
    }

    public PageInfoVO(List<T> list) {
        PageInfo<T> pageInfo = new PageInfo<>(list);
        this.current = pageInfo.getPageNum();
        this.pageSize = pageInfo.getPageSize();
        this.total = pageInfo.getTotal();
        this.pageData = pageInfo.getList();
    }

    public PageInfoVO(List<T> list, int current, int pageSize, long total) {
        PageInfo<T> pageInfo = new PageInfo<>(list);
        this.current = current;
        this.pageSize = pageSize;
        this.total = total;
        this.pageData = pageInfo.getList();
    }

    private int current;

    private int pageSize;

    private long total;

    private List<T> pageData;




}
