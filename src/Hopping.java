 //import processing.sound.*;
 import processing.core.PImage;
 import processing.core.PApplet;

 public class Hopping extends Sprite {

    //private SoundFile munch;

    Hopping(PApplet _pApplet, int _x, int _y, int  _width, int _height, int _identifier){
        super(_pApplet, _x, _y, _width, _height, _identifier);
    }

    public void setup(){
        //munch = new SoundFile(getPApplet(), "munch.mp3");
        super.setup();
    }

    public void draw(){
        PImage img = getImage();
        getPApplet().tint(0, 100, 150, 150);
        super.draw();
        getPApplet().textSize(18);
        getPApplet().textAlign(getPApplet().CENTER, getPApplet().CENTER);
        getPApplet().text("food?", getX(), getY());
        getPApplet().tint(255, 255);
    }

    public void mouseClicked(int mouseX, int mouseY){
        super.mouseClicked(mouseX, mouseY);
        if(getPApplet().dist(mouseX, mouseY, getX(), getY()) < getWidth()/2){
            //munch.play();
            setX((int) getPApplet().random(getPApplet().width));
            setY((int) getPApplet().random(getPApplet().height));
        }
    }
}
