package com.vijay.rnd.time.controller;

import org.joda.time.DateTime;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {
	 @RequestMapping("/now")
	 public DateTime getNow(){
		 return new DateTime();
	 }
}
