package com.narendra.dockerexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

	@GetMapping("/")
	public String message()
	{
		return "this is my docker example";
	}
}
