package com.observerPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Subject channel = new YoutubeChannel();
		
		Observer observer1 = new Subscriber("Hemant");
		channel.subscribe(observer1);
		
		channel.newVideoUpload();
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("Press 1 If you wnat to Subscribe the channel");
			System.out.println("Press 2 If you wnat to Unsubscribe the channel");
			System.out.println("Press 3 If you wnat to add videos");
			System.out.println("Press 4 If you wnat to Exit");
			
			int c = Integer.parseInt(br.readLine());
			
			
			if( c==1) {
				System.out.println("Enter your name");
				String name = br.readLine();
				Observer observer2 = new Subscriber(name);
				channel.subscribe(observer2);
			}
			
			else if(c==2) {
				System.out.println("Enter your name");
				String name = br.readLine();
				Observer observer2 = new Subscriber(name);
				channel.unsubscribe(observer2);
			}
			
			else if(c==3) {
				channel.newVideoUpload();
			}
			
			else if(c==4) {
				System.out.println("Thank you for using app");
				break;
			}
			
			else {System.out.println("You have entered wrong input");}
		}
		
	}

}
