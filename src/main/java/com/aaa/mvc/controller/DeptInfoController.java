package com.aaa.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * fileName:DeptInfoController
 * description:
 * author:zz
 * createTime:2019/11/2 11:15
 * version:1.0.0
 */
@Controller
@RequestMapping("/dept")
public class DeptInfoController {

    /**
     * 部门列表方法
     * @return
     */
    //method = RequestMethod.POST  该方法只允许post提交
    // value 可以映射多个地址
    @RequestMapping(value = {"/listDept","/list","listDeptInfo"},method = RequestMethod.GET)
    public ModelAndView list(){

        List<Map> deptMapList  = new ArrayList<>();
        Map  deptMap1 = new HashMap();
        deptMap1.put("deptNo",1);
        deptMap1.put("dname","开发1部");
        deptMap1.put("loc","1楼");
        deptMapList.add(deptMap1);
        Map  deptMap2 = new HashMap();
        deptMap2.put("deptNo",2);
        deptMap2.put("dname","开发2部");
        deptMap2.put("loc","2楼");
        deptMapList.add(deptMap2);
        Map  deptMap3 = new HashMap();
        deptMap3.put("deptNo",3);
        deptMap3.put("dname","开发3部");
        deptMap3.put("loc","3楼");
        deptMapList.add(deptMap3);

        ModelAndView modelAndView = new ModelAndView();
        //绑定数据
        modelAndView.addObject("deptList",deptMapList);
        //设置返回路径
        modelAndView.setViewName("dept/list");
        return modelAndView;
    }

    /**
     * 添加方法
     * @param map
     * @return
     */
    @RequestMapping("/addDept")
    public ModelAndView  add(Map map){
       return null;
    }
}
