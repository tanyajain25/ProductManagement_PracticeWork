package com.capg.assign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capg.assign.bean.Product;
import com.capg.assign.service.ProductService;

@Controller
public class ProductController 
{
	@Autowired
	private ProductService service;
	
	@GetMapping("/register")
    public ModelAndView register() {
        ModelAndView mv = new ModelAndView("RegisterProduct");
        return mv;
    }
	
	@GetMapping("/processregister")
//@RequestMapping(method=RequestMethod.GET)
	public ModelAndView process(@RequestParam("pid") int pid,
                                        @RequestParam("pname") String pname){
        Product p=new Product(pid,pname);
      
        service.toSaveDetails(p);
        System.out.println(p);
        ModelAndView mv=new ModelAndView("ProductDetails","p",p);
        System.out.println("----------");
        return mv;
    }
}
