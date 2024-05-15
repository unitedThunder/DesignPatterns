package com.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{

	List<Observer> subscriber = new ArrayList<>();
	
	@Override
	public void subscribe(Observer ob) {
		subscriber.add(ob);
		System.out.println("You have subscribed to the channel");
	}

	@Override
	public void unsubscribe(Observer ob) {
		subscriber.remove(ob);
		System.out.println("Channel unsubscribed");
	}

	@Override
	public void newVideoUpload() {
		for(Observer ob:subscriber) {
			ob.notified();
		}
	}

}
