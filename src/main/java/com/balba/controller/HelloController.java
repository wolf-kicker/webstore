package com.balba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.balba.model.Shoe;
import com.balba.service.HelloService;

@Controller
@RequestMapping("/")
public class HelloController {
	
	@Autowired
	private HelloService helloService;
	
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
	public Shoe getShoe(@PathVariable Integer id){
		return helloService.getShoe(id);
	}
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
	public Shoe addShoe(@RequestBody Shoe shoe){
		return helloService.addShoe(shoe);
	}
    
}
