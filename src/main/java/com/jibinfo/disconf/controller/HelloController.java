package com.jibinfo.disconf.controller;

/**
 * Created by admin on 2017/1/17.
 */
import com.jibinfo.disconf.config.SimpleConfig;
import com.jibinfo.disconf.config.TestConfig;
import com.jibinfo.disconf.service.AutoService;
import com.jibinfo.disconf.utils.DisconfPropertiesUtils;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;



@Controller
@Log4j
public class HelloController {

    @Resource
    private SimpleConfig simpleConfig;

    @Resource
    private TestConfig testConfig;

    @Resource
    private AutoService autoService;


    @RequestMapping("/index/{name}")
    public String index(HttpServletRequest request,@PathVariable("name") String name, Model model){
        this.setValue(request,simpleConfig.toString());
        return "index";
    }

    @RequestMapping("/json")
    @ResponseBody
    public Map<String,Object> json(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name","Ryan");
        map.put("age","18");
        map.put("sex","man");
        return map;
    }


    @RequestMapping("/simple")
    public String testSimpleConfig(HttpServletRequest request) throws InterruptedException {
        log.info(simpleConfig.toString());
        this.setValue(request,simpleConfig.toString());
        return "index";
    }

    /**
     * @throws InterruptedException
     */

    @RequestMapping("/disconfupdate")
    public String testInterfaceConfig(HttpServletRequest request) throws InterruptedException {
        log.info(testConfig.toString());
        this.setValue(request,testConfig.toString());

        return "index";
    }



    @RequestMapping("/auto")
    public String autoService(HttpServletRequest request) throws InterruptedException {
        log.info(autoService.toString());
        this.setValue(request,autoService.toString());
        return "index";
    }

    @RequestMapping("/disconf")
    public String disconf1(HttpServletRequest request) throws InterruptedException {

        String appName = DisconfPropertiesUtils.getPropertiesValue("test.properties","app.name1","defaultValue");

        this.setValue(request,appName);
        return "index";
    }


    @RequestMapping("/properties")
    public String properties(HttpServletRequest request) throws InterruptedException {

        String propertiesValue = DisconfPropertiesUtils.getPropertiesValue("autoconfig.properties","auto","defaultValue");
        this.setValue(request,propertiesValue);
        return "index";
    }


    /**
     *
     * @param request
     * @param value
     */
    protected void setValue(HttpServletRequest request,String value){
        log.info("value is :"+value.toString());
        request.setAttribute("value",value);
    }

}
