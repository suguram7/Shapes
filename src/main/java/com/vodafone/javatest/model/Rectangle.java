package com.vodafone.javatest.model;

import java.util.Arrays;

/**
 * Model class of rectangle.
 *
 */
public class Rectangle {
	private int[] coordinates;
	private String name;

	public Rectangle() {
		coordinates = new int[4];
	}

	public int[] getCoordinates() {
		return Arrays.copyOf(coordinates, coordinates.length);
	}

	public void setCoordinates(int[] coordinates) {
		this.coordinates = Arrays.copyOf(coordinates, coordinates.length);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
