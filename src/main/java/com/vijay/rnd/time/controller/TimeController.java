package com.vijay.rnd.time.controller;

import java.util.Set;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/*
 * Author: Vijay Jaiswal (victory_ja100@yahoo.com) 
 */
@RestController
public class TimeController {
	 @RequestMapping("/now")
	 public DateTime getNow(){
		 return new DateTime();
	 }

	 @RequestMapping("/timeZonesIDs")
	 public Set<String> getTimeZonesIDs(){
		 return DateTimeZone.getAvailableIDs();
	 }
	 
	 @RequestMapping("/timeForZonesIDs")
	 public DateTime getTimeForZonesIDs(@RequestParam String timeZonesID){
		 if(timeZonesID!=null){
			 return new DateTime().withZone(DateTimeZone.forID(timeZonesID));
		 }
		 return new DateTime().withZone(DateTimeZone.getDefault());
	 }
	 
}
