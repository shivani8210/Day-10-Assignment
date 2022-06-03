package com.shi.q1;

public class Demo {
	
	public Hotel provideFood(int amount) {
		
		if(amount > 1000) {
			 return new TajHotel();
			 
		}
		
		else if(amount > 200 && amount <= 1000) {
			
			return new RoadSideHotel();
			
		}
		
		else {
		
			return null;
			
		}
		
	}

	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		
		Hotel hotel = d1.provideFood(600);
		
		if(hotel != null) {
		
			hotel.chickenBiryani();
		
			hotel.masalaDosa();
			
		}
		
		else {
			
			System.out.println("Amount should be greater than 600");
			
		}

	}

}
