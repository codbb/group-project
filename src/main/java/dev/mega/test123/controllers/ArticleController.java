package dev.mega.test123.controllers;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/article")
public class ArticleController {

    @RequestMapping(value = "/list")
    public ModelAndView getList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("article/list");
        return modelAndView;
    }
}
