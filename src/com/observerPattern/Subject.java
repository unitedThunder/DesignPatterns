package com.observerPattern;

public interface Subject {

	 void subscribe(Observer ob);
	
	 void unsubscribe(Observer ob);
	
	 void newVideoUpload();
}
