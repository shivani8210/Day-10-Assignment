package com.shi.q4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Area area = new Area();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of rectangle: ");
		
		int len = sc.nextInt();
		
		System.out.println("Enter breadth of rectangle: ");
		
		int bre = sc.nextInt();
		
		area.rectangleArea(len, bre);
		
		System.out.println("Enter side of square: ");
		
		int s = sc.nextInt();
		
		area.squareArea(s * s);
		
		System.out.println("Enter radius of circle: ");
		
		int rad = sc.nextInt();
		
		area.circleArea(rad);
		
	}

}
