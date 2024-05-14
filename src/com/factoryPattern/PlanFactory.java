package com.factoryPattern;

public class PlanFactory {

	public Plan getPlan(String planName) {
		
		if(planName==null) {
			return null;
		}
		
		else if (planName.equalsIgnoreCase("DOMESTICPLAN")) {
			return new DomesticPlan();
		}
		
		else if (planName.equalsIgnoreCase("COMMERCIALPLAN")) {
			return new CommercialPlan();
		}
		
		else if (planName.equalsIgnoreCase("INSTITUTIONALPLAN")) {
			return new InstitutionalPlan();
		}
		
		return null;
	}
}
