package org.csu.layui_demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(ModelMap modelMap) {

        // 加入一个属性，用来在模板中读取
//        modelMap.addAttribute("msg", "Thymeleaf示例消息");

        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }
    @RequestMapping("/home")
    public String home(ModelMap modelMap) {

        // 加入一个属性，用来在模板中读取
//        modelMap.addAttribute("msg", "Thymeleaf示例消息");

        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "home";
    }
}
