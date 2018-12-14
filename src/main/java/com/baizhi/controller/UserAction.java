package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/test")
public class UserAction {
  
    
		@Autowired
		private UserMapper userService;
		
		@RequestMapping("/queryAll")

		public String queryAll(){
			List<User> list=userService.selectAll();
			return "redirect:/index.jsp";
		}

}
