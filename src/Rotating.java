import processing.core.PImage;
import processing.core.PApplet;

public class Rotating extends Sprite {
    private float degrees;

    Rotating(PApplet _pApplet, int _x, int _y, int _width, int _height, int _identifier){
        super(_pApplet, _x, _y, _width, _height, _identifier);
    }

    public void draw(){
        PImage img = getImage();
        getPApplet().imageMode(getPApplet().CENTER);
        int x = getX();
        int y = getY();
        setX(0);
        setY(0);

        getPApplet().push();
        getPApplet().translate(x, y); //moving the origin to the center of the image
        getPApplet().rotate(getPApplet().radians(degrees));
        degrees+=10;
        super.draw();
        getPApplet().pop();

        setX(x);
        setY(y);
    }
}
