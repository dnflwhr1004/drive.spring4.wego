package com.wego.web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wego.web.domains.UserDTO;



@Controller
@RequestMapping("/user/*")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	
	@PostMapping("/join")
	public @ResponseBody Map<?,?> join(@RequestBody UserDTO user){
		logger.info("ajax가 보낸 아이디{} ", user.getUid()+"," + user.getPwd());
		HashMap<String,String> map = new HashMap<>();
		map.put("uid", user.getUid());
		map.put("pwd", user.getPwd());
		logger.info("map에 담긴 Id, pw {} ", map.get("uid")+","+map.get("pwd"));
		return map;
	}
}
