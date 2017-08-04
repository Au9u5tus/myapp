package com.yuhao.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("modern/life")
public class LoginController {
	@RequestMapping("login")
	@ResponseBody
	public String login(HttpServletRequest request) {
		JSONObject json=new JSONObject();
		json.put("name", "yuhao");
		json.put("age", "18");
		return json.toJSONString();
	}

}
