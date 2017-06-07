package com.ocado.devops;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Map;

@Controller
public class RootController {
    @GetMapping("/")
    @ResponseBody
    public ModelAndView welcome() {
        return new ModelAndView("index_en");
    }
}
