package com.singletone;

public class SingletoneDP {

	
		private SingletoneDP() {}
		private static SingletoneDP obj;
		
		public static SingletoneDP getObj() {
			if(obj==null) {
				synchronized (SingletoneDP.class) {
					if(obj==null) {
						obj= new SingletoneDP();
					}
				}
			}
			return obj;
		}
		
		public void greet() {
			System.out.println("welcome");
		}
	
	public static void main(String[] args) {
		
		SingletoneDP sdp = SingletoneDP.getObj();
		sdp.greet();
		
	}
	
}
