package com.factoryPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactoryDP {

	public static void main(String[] args) throws IOException {
		
		PlanFactory planFactory= new PlanFactory();
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the name of plan for which you want bill");
		String planName= br.readLine();
		
		System.out.println("enter the units ");
		int units = Integer.parseInt(br.readLine());
		
		Plan plan = planFactory.getPlan(planName);
		
		System.out.println("Bill amount for "+planName+" of "+units+" units is : ");
		
		plan.getRate();
		plan.CalculateBill(units);
	}
}
