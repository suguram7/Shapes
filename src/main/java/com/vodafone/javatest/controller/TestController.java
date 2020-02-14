package com.vodafone.javatest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vodafone.javatest.model.Rectangle;
import com.vodafone.javatest.model.Shapes;
import com.vodafone.javatest.service.TestService;

@RestController
@RequestMapping("/")
public class TestController {
	@Autowired
	private TestService testService;

	/**
	 * @param shapes
	 *            - Holds the object to check
	 * @return response as Yes or No based on whether rectangles provided in input
	 *         is intersecting or not.
	 */
	@PostMapping("intersect")
	public ResponseEntity<String> checkIntersection(@RequestBody Shapes shapes) {

		if (shapes.getShapes().size() == 2) {

			Rectangle rect1 = shapes.getShapes().get(0);
			Rectangle rect2 = shapes.getShapes().get(1);

			if (testService.checkIntersection(rect1.getCoordinates()[0], rect1.getCoordinates()[1],
					rect1.getCoordinates()[2], rect1.getCoordinates()[3], rect2.getCoordinates()[0],
					rect2.getCoordinates()[1], rect2.getCoordinates()[2], rect2.getCoordinates()[3])) {
				return new ResponseEntity<>("Result Yes - Rectangles intersect", HttpStatus.OK);
			} else {
				return new ResponseEntity<>("Result No - Rectangles do not intersect", HttpStatus.OK);
			}
		} else {
			return new ResponseEntity<>("Invalid Input", HttpStatus.METHOD_NOT_ALLOWED);
		}

	}

}
