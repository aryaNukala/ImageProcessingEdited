import processing.core.PImage;
import processing.core.PApplet;

public class Sprite {

    private PImage img;
    private PImage superImage;
    private int x;
    private int y;
    private int width;
    private int height;
    private int identifier;
    private PApplet pApplet;

    //constrctor: called to "instantiate" (aka "create") a Sprite "object"
    Sprite(PApplet _pApplet, int _x, int _y, int  _width, int _height, int _identifier){
        pApplet = _pApplet;
        x = _x;
        y = _y;
        width = _width;
        height = _height;
        _identifier = identifier;
    }

    // encapsulates its own specialized functionality
    public void setup(){
        img = getPApplet().loadImage("data/puppy.png");

    }

    public void draw(){
        pApplet.image(img, x, y, width, height);
    }

    public void mouseClicked(int mouseX, int mouseY){
        System.out.println("");
    }


    public PImage getImage(){
        return img;
    }

    public PApplet getPApplet(){
        return pApplet;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int _x){
        x = _x;
    }

    public void setY(int _y){
        y = _y;
    }
}

