package net.kdigital.jquery1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JQueryController {
    @GetMapping("/selector")
	public String selector() {
		return "selector";
		
	}
	
	@GetMapping("/filter")
	public String filter() {
		return "filter";
		
	}
	
	
	@GetMapping("/filter_method")
	public String filter_method() {
		return "filter_method";
		
	}
	
	@GetMapping("/manipulation")
	public String manipulation() {
		return "manipulation";
		
	}
	
	@GetMapping("/classTest")
	public String classTest() {
		return "classTest";
		
	}
	@GetMapping("/exam1")
	public String exam1() {
		return "exam1";
	}

	@GetMapping("/traversing")
	public String traversing() {
		return "traversing";
	}
	
	@GetMapping("/each")
	public String each() {
		return "each";
	}

	@GetMapping("/customer")
	public String customer() {
		return "customer";
	}
}
