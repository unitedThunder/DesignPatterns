package com.builderPattern;

public class Phone {

	private final String os;
	private final int ram;
	private final int battery;
	private final String processor;

	private Phone(PhoneBuilder builder) {

		this.os= builder.os;
		this.ram= builder.ram;
		this.battery= builder.battery;
		this.processor= builder.processor;
	}

	public String getOs() {
		return os;
	}

	public int getRam() {
		return ram;
	}

	public int getBattery() {
		return battery;
	}

	public String getProcessor() {
		return processor;
	}
	
	

	@Override
	public String toString() {
		return "Phone [os=" + this.os + ", ram=" + this.ram + ", battery=" + this.battery + ", processor=" + this.processor + "]";
	}


	static class PhoneBuilder{
		private String os;
		private int ram;
		private int battery;
		private String processor;
		
		public PhoneBuilder() {
			
		}
		
		public static PhoneBuilder builder() {
			return new PhoneBuilder();
			
		}
		
		public PhoneBuilder setOs(String os) {
			this.os = os;
			return this;
		}
		public PhoneBuilder setRam(int ram) {
			this.ram = ram;
			return this;
		}
		public PhoneBuilder setBattery(int battery) {
			this.battery = battery;
			return this;
		}
		public PhoneBuilder setProcessor(String processor) {
			this.processor = processor;
			return this;
		}
		
		public Phone build() {
			return new Phone(this);
		}
		
		
	}

}
