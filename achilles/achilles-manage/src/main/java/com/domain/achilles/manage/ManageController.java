package com.domain.achilles.manage;

import com.domain.achilles.bean.DomainInfo;
import com.domain.achilles.bean.ManageQuery;
import com.domain.achilles.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: Administrator
 * @Date: 2018/9/1 0001 10:30
 * @Description:
 */
@Controller
@RequestMapping("/manage")
public class ManageController {

    @Autowired
    private ManageService manageService;

    @GetMapping
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://blog.didispace.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "manage/list";
    }

    @GetMapping("/list")
    public String list(ManageQuery query, ModelMap map) {

        List<DomainInfo> domainInfos = manageService.listByPage(query);

        map.put("domainInfos", domainInfos);

        return "manage/list";
    }

}
