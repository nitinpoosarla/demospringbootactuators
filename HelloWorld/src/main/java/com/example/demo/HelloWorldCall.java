package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldCall 
{

	@RequestMapping("/hello")	
public String getHello()
{

	return "helloworld";
}

}
