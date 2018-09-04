package cn.jxufe.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jxufe.web.pojo.BaseWeixinPlatformRequest;
import cn.jxufe.web.pojo.BaseWeixinPlatformResponse;

@Controller
@RequestMapping(value = "/localTest")
public class SimpleXmlTrans {
	
	@RequestMapping(value="/receiveTextMsg" , consumes = "application/xml" , produces ="application/xml" , method = RequestMethod.POST)
	public @ResponseBody BaseWeixinPlatformResponse response4Post(@RequestBody BaseWeixinPlatformRequest xml) {
		System.out.println("-----请求xml数据--------");
//		String content = xml.getContent();
		String toUserName = xml.getToUserName();
		String fromUserName = xml.getFromUserName();
		String createTime = xml.getCreateTime();
		String msgType = xml.getMsgType();
		BaseWeixinPlatformResponse respon = new BaseWeixinPlatformResponse(xml);
		return respon;
 
	}
	
	@RequestMapping(value="/kfc/{name}", method = RequestMethod.GET)
	public @ResponseBody Shop response4Get(@PathVariable String name) {
		System.out.println("-----请求json数据--------");
		Shop shop = new Shop();
		shop.setName(name);
		shop.setStaffName(new String[]{"mkyong1", "mkyong2"});
 
		return shop;
 
	}


}
