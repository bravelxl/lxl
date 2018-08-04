package com.xiaobu.demo.com.xiaobu.demo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这里的@RestController   相当于@ResponseBody + @Controller
 */

@RestController
public class HelloController {
    /**
     * @GetMapping 组合注解，是@RequestMapping(method = RequestMethod.GET)的缩写
     * @return
     */
    @GetMapping("/hello")
    public String hello(){
        return  "Hello SpringBoot";
    }

    @GetMapping("getYg")
    public String  getYg(){
        return "勇敢";
    }

    @Value("${pageSize}")
    private Integer pageSize;
    @Value("${testName}")
    private String testName;
    @RequestMapping(value="/getTestName",method = RequestMethod.GET, produces="application/json;charset=UTF-8")
    public String getTestName(){
        //String str = new String(getTestName().getBytes(),"utf-8");
        return "pageSize:"+pageSize+",testName:"+getTestName();
    }

    @GetMapping("/test")
    public String test(){
        int k = 0;
        k++;
        System.out.print(k+"----------"+k++);
        return "Test";
    }
}
