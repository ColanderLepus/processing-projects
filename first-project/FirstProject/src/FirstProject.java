import processing.core.*;

public class FirstProject extends PApplet {
    public void settings() {
        size(400, 400);
    }

    public void setup() {
        // Setup code here
    }

    public void draw() {
        background(0);

        float x = (float) width / 2;
        float y = (float) height / 2;
        float w = x * 1;
        float h = y * 1;

        translate(x,y);
        ellipse(0,0, w, h);
    }

    public static void main(String[] args) {
        PApplet.main("FirstProject");
    }
}