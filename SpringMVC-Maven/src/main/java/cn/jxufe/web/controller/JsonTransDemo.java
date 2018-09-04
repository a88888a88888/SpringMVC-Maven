package cn.jxufe.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/kfc/brands")
public class JsonTransDemo {
	@RequestMapping(value="{name}", method = RequestMethod.GET)
	public @ResponseBody Shop response4Get(@PathVariable String name) {
		System.out.println("-----请求json数据--------");
		Shop shop = new Shop();
		shop.setName(name);
		shop.setStaffName(new String[]{"mkyong1", "mkyong2"});
 
		return shop;
 
	}
	@RequestMapping(value="{request}" , method = RequestMethod.POST)
	public @ResponseBody Shop response4Post(@RequestBody Object request) {
		Object debugger = request;
		System.out.println("-----请求json数据--------");
		Shop shop = new Shop();
		shop.setName("123aaa");
		shop.setStaffName(new String[]{"mkyong1", "mkyong2"});
 
		return shop;
 
	}

}
