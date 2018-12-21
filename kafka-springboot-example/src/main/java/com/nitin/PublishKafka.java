package com.nitin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class PublishKafka {
	
	@Autowired
	KafkaTemplate<String,String> kt;
	private static final String topic ="demo";

	@GetMapping("/publish/{message}")
	public String post(@PathVariable("message") final String message)
	{
		kt.send(topic,1,message, message);
		return "published succefully";
		
		
	}
}
