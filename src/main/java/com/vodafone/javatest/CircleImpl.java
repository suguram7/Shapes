package com.vodafone.javatest;

/**
 * This class represents the Circle implementation of the Shape.
 *
 */
public class CircleImpl implements Shape {

	private int x1;
	private int x2;
	private int y1;
	private int y2;
	private int r1;

	/**
	 * @param x1
	 * @param x2
	 * @param y1
	 * @param y2
	 * @param r1
	 */
	public CircleImpl(int x1, int x2, int y1, int y2, int r1) {
		super();
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.r1 = r1;
	}

	/**
	 * Implementation to get the center coordinates (a,b) of the circle. Returning
	 * the sum of the coordinates.
	 */
	@Override
	public double getCenter() {
		double a = (x1 + x2) / 2;
		double b = (y1 + y2) / 2;
		return a + b;
	}

	/**
	 * Method to check if a circle lies inside another circle or not.
	 */
	@Override
	public boolean contains(Shape c) {

		int distSq = (int) Math.sqrt(((x1 - c.x) * (x1 - c.x)) + ((y1 - c.y) * (y1 - c.y)));

		if ((distSq + r == r1) || (distSq + r < r1)) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Method to check if a circle intersects another circle provided in the input.
	 */
	@Override
	public boolean intersect(Shape c) {

		int distSq = (x1 - c.x) * (x1 - c.x) + (y1 - c.y) * (y1 - c.y);
		int radSumSq = (r1 + c.r) * (r1 + c.r);
		if (distSq == radSumSq || distSq > radSumSq) {
			return false;
		} else {
			return true;
		}

	}

}
