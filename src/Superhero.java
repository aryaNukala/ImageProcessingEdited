import processing.core.PApplet;
import processing.core.PImage;

public class Superhero extends Sprite {

    private int w;
    private int h;

    Superhero(PApplet _pApplet, int _x, int _y, int  _width, int _height, int _identifier){
        super(_pApplet, _x, _y, _width, _height, _identifier);
    }

    public void setup(){
        w = (int)random(getPApplet().width);
        h = (int)random(getPApplet().height);
        PImage superImage = loadImage("data/superPuppy.png");
    }


    public void draw(){
        image(superImage, w, h);
    }
}
