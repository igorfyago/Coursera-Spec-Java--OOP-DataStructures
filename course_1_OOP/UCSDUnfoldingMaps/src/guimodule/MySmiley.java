package guimodule;

import processing.core.PApplet;

public class MySmiley extends PApplet {

    static int w = 400;
    static int h = 400;

    public void setup() {
        size(w,h);
        background(0,166,128);
    }

    public void draw() {

        fill(255,240,0);
        ellipse(200,200,390,390);

        fill(0,0,0);
        ellipse(100, 125, 50, 70);

        fill(0,0,0);
        ellipse(w-100, 125, 50, 70);

        arc(200,280,75,75,0,PI);

    }
}
