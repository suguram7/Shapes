Java Test:

POST /intersect - API to check whether the Rectangles provided in input intersect or not.

The application returns the response as below:

If the rectangles passed in input intersect each other -  200 "Result Yes - Rectangles intersect"
If the rectangles do not intersect each other - 200 "Result No - Rectangles do not intersect"
IF the input provided is not valid - 405 "Invalid Input"



Explanation - Two rectangles intersect or not:

A rectangle can be represented by two coordinates, bottom left and top right. 
(x1,y1) - Bottom Left coordinate of first rectangle.
(x2,y2) - Top Right coordinate of first rectangle.
(x3,y3) - Bottom Left coordinate of second rectangle.
(x4,y4) - Top Right coordinate of second rectangle.
 
 Given two rectangles do not intersect if any of the below condition is true.
1) First rectangle is placed above top edge of second rectangle.
2) First rectangle is placed on the left side of left edge of second rectangle.

The implementation is provided in the method - intersection() of the RectangleImpl.java


How to Run and test the API:

 1) Start the Spring boot application by running main method in TestApplicatin.java
 2) Submit a POST request with below JSON to the endpoint /intersect running in port 8080.
 
 {
    "shapes": [
        {
            "coordinates": [
                0,
                0,
                2,
                4
            ],
            "name": "RectA"
        },
        {
            "coordinates": [
                2,
                5,
                7,
                9
            ],
            "name": "RectB"
        }
    ]
}
