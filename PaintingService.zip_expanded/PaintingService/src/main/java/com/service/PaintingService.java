package com.service;

import org.springframework.stereotype.Service;

import com.model.PaintingBean;


//use appropriate annotation to configure PaintingService as a Service
@Service
public class PaintingService {

	//calculate the totalCost and return the cost.
	public double calculateTotalCost(PaintingBean paintingBean) {
	    String serviceType = paintingBean.getServiceType();
	    int area = paintingBean.getArea();
	    float cost = 0.0f;
		double totalCost=0.0;
		
		if(serviceType.equals("Interior")){
		    if(area<=10000 && area>=1)
		        cost = 10000.0f;
		    else if(area<10000)
		        cost = 20000.0f;
		    
		}
		else if(serviceType.equals("Exterior")){
		    if(area<=10000 && area>=1)
		        cost = 20000.0f;
		    else if(area>10000)
		        cost=40000.0f;
		   
		}
		else if(serviceType.equals("WholeBuilding")){
		    if(area<=10000 && area>=1)
		        cost = 40000.0f;
		    else if(area>10000)
		        cost = 50000.0f;
		    
		}
		// fill the code
		paintingBean.setServiceCost(cost);
		totalCost = cost+(cost*0.1);
		return totalCost;
	}

}
