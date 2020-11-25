package lehigh;

import processing.core.PApplet;

public class MovingBalls extends PApplet{

    public float circleXA;
    public float circleYA;
    public float xspeedA = random(-10, 10);
    public float yspeedA = random(-10, 10);
    public float circleXB;
    public float circleYB;
    public float xspeedB = random(-10, 10);
    public float yspeedB = random(-10, 10);

    public void settings(){
        size(500, 500);
        circleXA = 0;
        circleYA = 0;
        circleXB = 0;
        circleYB = 0;
    }

    public void draw(){
        background(0);
        ellipse(circleXA, circleYA, 20, 20);
        ellipse(circleXB, circleYB, 20,20);
        circleXA = circleXA + xspeedA;
        circleYA = circleYA + yspeedA;
        circleXB = circleXB + xspeedB;
        circleYB = circleYB + yspeedB;

        if (circleXA > width) {    //prevents the ball from moving offscreen on right of x-axis
            xspeedA = -10;        //if ball is greater than width, it'll bounce off end screen and move in opposite direction
        }
        if (circleXA < 0){  //prevents ball from moving offscreen on left of axis
            xspeedA = 10;}    //if ball is less than 0, it'll bounce off end screen and move in opposite direction
        if (circleYA > height) { //prevents ball from moving offscreen at the top
            yspeedA = -10;}    //if ball is greater than height, it'll bounce off top of screen and move down
        if (circleYA < 0) {  //if ball is less than 0 in height, it'll bounce off bottom and move up
            yspeedA = 10;}
        
        if (circleXB > width) {    //prevents the ball from moving offscreen on right of x-axis
            xspeedB = -10;        //if ball is greater than width, it'll bounce off end screen and move in opposite direction
        }
        if (circleXB < 0){  //prevents ball from moving offscreen on left of axis
            xspeedB = 10;}    //if ball is less than 0, it'll bounce off end screen and move in opposite direction
        if (circleYB > height) { //prevents ball from moving offscreen at the top
            yspeedB = -10;}    //if ball is greater than height, it'll bounce off top of screen and move down
        if (circleYB < 0) {  //if ball is less than 0 in height, it'll bounce off bottom and move up
            yspeedB = 10;}
    }

    public static void main(String[] args) {
        String[] processingArgs = {"MovingBalls"};
        MovingBalls movingBalls = new MovingBalls();
        PApplet.runSketch(processingArgs, movingBalls);
    }
}
