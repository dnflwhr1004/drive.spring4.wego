package com.wego.web.controllers;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wego.web.domains.UserDTO;
import com.wego.web.serviceimpl.UserServiceImpl;
	
	@Controller
	@RequestMapping("/user/*")
	public class UserController {
		private static final Logger logger = LoggerFactory.getLogger(UserController.class);
		@Autowired Map<String, Object> map;
		@Autowired UserDTO user;
		@Autowired UserServiceImpl userService;
		
		@PostMapping("/join")
		public @ResponseBody Map<?, ?> join(@RequestBody UserDTO param){
			logger.info("AJAX가 보낸 아이디와 비번{}", param.getUid()+", "+param.getPwd()+","+param.getUname());
			Map<String, Object> map2 = new HashMap<>();
			map2.put("uid", param.getUid());
			map2.put("pwd", param.getPwd());
			map2.put("uname", param.getUname());
			logger.info("map에 담긴아이디와 비번{}", map2.get("uid")+","+map2.get("pwd")+","+map2.get("uname"));
			userService.join(param);
			
			return map2;
		}
			
		
		@PostMapping("/login")
		public @ResponseBody UserDTO login(@RequestBody UserDTO param){
			logger.info("AJAX 로그인 {}", param.getUid()+", "+param.getPwd()+","+param.getUname());
			user.setUid(param.getUid());
			user.setPwd(param.getPwd());
			user.setUname(param.getUname());
			user=userService.login(param);
			logger.info("user에 담긴 사용자 정보 {}+", user.toString());
			return user;
		}
		
		
		
}
