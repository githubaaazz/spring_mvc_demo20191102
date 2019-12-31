package com.aaa.mvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * fileName:DeptController
 * description:
 * author:zz
 * createTime:2019/11/2 10:09
 * version:1.0.0
 */
public class DeptController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        //设值逻辑视图名
        modelAndView.setViewName("dept");
        //绑定数据
        modelAndView.addObject("myParam","hello springmvc!!!");
        return modelAndView;
    }
}
