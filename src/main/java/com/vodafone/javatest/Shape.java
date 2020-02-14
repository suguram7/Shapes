package com.vodafone.javatest;

public interface Shape {

	int width = 0;
	int height = 0;
	int x = 0;
	int y = 0;
	int r =0;
	
	double getCenter();

	boolean contains(Shape var1);

	boolean intersect(Shape var1);

}
