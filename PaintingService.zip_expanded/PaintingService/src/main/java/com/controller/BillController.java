package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.PaintingBean;
import com.service.PaintingService;

//use appropriate annotation to configure BillController as Controller
@Controller
public class BillController {
	
	@Autowired
	private PaintingService paintingService;
	
	@ModelAttribute("serviceList")
	public Map<String,String> buildState(){
	    Map<String,String> pairs = new HashMap<>();
	    pairs.put("Interior","Interior");
	    pairs.put("Exterior","Exterior");
	    pairs.put("WholeBuilding","WholeBuilding");
	    return pairs;
	}
	
	@RequestMapping(value="/showPage", method=RequestMethod.GET)
	public String showPage(@ModelAttribute("painting") PaintingBean paintingBean) {
	    return "showpage";
	}

	//invoke the service class - calculateTotalCost method.
	@RequestMapping(value="/billDesk",method=RequestMethod.POST)
	public String calculateTotalCost(@ModelAttribute("painting") PaintingBean paintingBean, 
			ModelMap model) {
		double totalCost = paintingService.calculateTotalCost(paintingBean);
		model.put("cost", totalCost);
		
		return "billdesk";
	}
	
}
	 	  	    	    	     	      	 	
