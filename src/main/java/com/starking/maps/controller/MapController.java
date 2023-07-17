package com.starking.maps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author pedroRhamon
 */
@Controller
public class MapController {

	@GetMapping("/showMap")
	public String index() {
		return "index";
	}
}
