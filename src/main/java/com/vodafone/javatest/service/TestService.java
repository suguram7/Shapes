package com.vodafone.javatest.service;

import org.springframework.stereotype.Service;

import com.vodafone.javatest.RectangleImpl;

@Service
public class TestService {

	/**
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
	public boolean checkIntersection(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		RectangleImpl rect = new RectangleImpl();
		return (rect.intersection(x1, y1, x2, y2, x3, y3, x4, y4));
	}

}
