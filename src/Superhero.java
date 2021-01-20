import processing.core.PApplet;
import processing.core.PImage;

public class Superhero extends Sprite {

    private int w;
    private int h;
    private PImage superImage;

    Superhero(PApplet _pApplet, int _x, int _y, int  _width, int _height, int _identifier){
        super(_pApplet, _x, _y, _width, _height, _identifier);
    }

    public void setup(){
        w = (int)getPApplet().random(getPApplet().width);
        h = (int)getPApplet().random(getPApplet().height);
        superImage = getPApplet().loadImage("data/superPuppy.png");
    }


    public void draw(){
        getPApplet().image(superImage, w, h);
    }
}
