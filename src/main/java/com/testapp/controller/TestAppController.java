package com.testapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAppController {
	@GetMapping(value="/getMsg")
public String getMsg() {
	return "Good Morning";
}


}
