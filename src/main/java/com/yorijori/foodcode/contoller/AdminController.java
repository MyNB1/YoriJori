package com.yorijori.foodcode.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	

	@RequestMapping("/adminpage")
	public String getAdminPage() {
		return "thymeleaf/admin/main";
	}

}
