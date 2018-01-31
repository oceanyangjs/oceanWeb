package com.ocean.controller;

import java.io.Console;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ocean.service.IndexService;

@Controller
@RequestMapping("")
public class IndexController {
	@Autowired
	IndexService indexService;
	
	@RequestMapping("test")
	public ModelAndView index() {
		System.out.println(indexService.test(1).getName());
		ModelAndView mav = new ModelAndView("testtest");
		mav.addObject("name",indexService.test(1).getName());
		return mav;
	}
}
