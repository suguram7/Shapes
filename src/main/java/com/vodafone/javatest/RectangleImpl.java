package com.vodafone.javatest;

/**
 * This class represents the Rectangle implementation of the Shape.
 *
 */
public class RectangleImpl implements Shape {

	private int x;
	private int y;
	private int width;
	private int height;

	/**
	 * Default constructor
	 */
	public RectangleImpl() {
		this(0, 0, 0, 0);
	}

	/**
	 * 
	 * @param x
	 *            - x coordinate
	 * @param y
	 *            - Y coordinate
	 * @param width
	 *            - Width of rectangle
	 * @param height
	 *            - Height of rectangle
	 */
	public RectangleImpl(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	/**
	 * Implementation to get the center coordinates (a,b) of the rectangle.
	 * Returning the sum of the coordinates.
	 */
	@Override
	public double getCenter() {
		double a = x + width / 2;
		double b = y + height / 2;
		return a + b;
	}

	/**
	 * Method to check if a rectangle lies inside another rectangle or not.
	 */
	@Override
	public boolean contains(Shape r) {

		if ((Shape.x + Shape.width) < (this.x + this.width) && (Shape.x) > (this.x) && (Shape.y) > (this.y)
				&& (Shape.y + Shape.height) < (this.y + this.height)) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Method to check if a rectangle intersects another rectangle provided in the
	 * input.
	 */
	@Override
	public boolean intersect(Shape r) {
		int tw = this.width;
		int th = this.height;
		int rw = Shape.width;
		int rh = Shape.height;
		if (rw <= 0 || rh <= 0 || tw <= 0 || th <= 0) {
			return false;
		}
		int tx = this.x;
		int ty = this.y;
		int rx = Shape.x;
		int ry = Shape.y;
		rw += rx;
		rh += ry;
		tw += tx;
		th += ty;
		return ((rw < rx || rw > tx) && (rh < ry || rh > ty) && (tw < tx || tw > rx) && (th < ty || th > ry));
	}

	/**
	 * Method to check if two rectangles are intersecting each other provided the
	 * coordinates of the rectangle.
	 * 
	 * @param x1
	 *            - x coordinate of bottomLeft of first rectangle
	 * @param y1
	 *            - y coordinate of bottomLeft of first rectangle
	 * @param x2
	 *            - x coordinate of topRight of first rectangle
	 * @param y2
	 *            - y coordinate of topRight of first rectangle
	 * @param x3
	 *            - x coordinate of bottomLeft of second rectangle
	 * @param y3
	 *            - y coordinate of bottomLeft of second rectangle
	 * @param x4
	 *            - x coordinate of topRight of second rectangle
	 * @param y4
	 *            - y coordinate of topRight of second rectangle
	 * @return boolean value
	 */
	public boolean intersection(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {

		if (y2 < y3 || y1 > y4) {
			return false;
		}
		if (x2 < x3 || x1 > x4) {
			return false;
		}
		return true;

	}

}
