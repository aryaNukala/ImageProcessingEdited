import processing.core.PImage;
import processing.core.PApplet;

public class Contrasting extends Sprite {

    Contrasting(PApplet _pApplet, int _x, int _y, int  _width, int _height, int _identifier){
        super(_pApplet, _x, _y, _width, _height, _identifier);
    }

    // overriding the Sprite version of draw()
    public void draw(){
        PImage img = getImage();
        img.loadPixels();
        for(int y = 0; y < getHeight(); y++){
            for(int x = 0; x < getWidth(); x++){
                int loc = x + y * getWidth();
                if (getPApplet().brightness(img.pixels[loc]) > 110){
                    img.pixels[loc] = getPApplet().color(255); // if very bright, then make it white
                } else {
                    img.pixels[loc] = getPApplet().color(0, 0); // if not very bright, make completlely transparent
                }
            }
        }  img.updatePixels();
        super.draw();
    }
}

