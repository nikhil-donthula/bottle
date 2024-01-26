package com.cool.bottle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Yeeehaaaaaa its working...!!!!\n\n\nBottle";
	}

}