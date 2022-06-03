package com.shi.q4;

public class Area extends Shape {

	@Override
	public int rectangleArea(int length, int breadth) {
		System.out.println(length * breadth);
		return 0;
		
	}

	@Override
	public int squareArea(int side) {
		System.out.println(side);
		return side;
	}

	@Override
	public int circleArea(int radius) {
		System.out.println(Math.PI * (radius * radius));
		return radius;
		
	}
	
	
	
}
