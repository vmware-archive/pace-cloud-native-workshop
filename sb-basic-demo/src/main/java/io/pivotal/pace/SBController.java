package io.pivotal.pace;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SBController {

	@Value("${greetingLanguage}")
	private String language;
	
	@RequestMapping("/")
	public String greetingLanguage() {
		return "Greeting language is " + language;
	}
}
