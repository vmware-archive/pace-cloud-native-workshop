package io.pivotal.pace.sbbasicdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SBController {

	@Value("${welcomeMessage}")
	private String msg;
	
	@RequestMapping("/")
	public String welcome() {
		return msg;
	}
}
