import processing.core.PImage;
import processing.core.PApplet;

public class GrowUp extends Sprite {

    private int w;
    private int h;
    private boolean young;
    //private SoundFile magic;

    GrowUp(PApplet _pApplet, int _x, int _y, int  _width, int _height, int _identifier){
        super(_pApplet, _x, _y, _width, _height, _identifier);
    }

    public void setup(){
        //magic = new SoundFile(getPApplet(), "magic.mp3");
        super.setup();
        w = (int)(getPApplet().width);
        h = (int)getPApplet().random(getPApplet().height);
        young = true;
    }

    public void draw(){
        if(young == true){
            getPApplet().tint(230, 230, 250);
            super.draw();
            getPApplet().textSize(18);
            getPApplet().textAlign(getPApplet().CENTER, getPApplet().CENTER);
            getPApplet().text("grow me!", getX(), getY());
            getPApplet().tint(255, 255);
        } else if(young == false){
            PImage grownUp = getPApplet().loadImage("data/grownup.png");
            getPApplet().tint(230, 230, 250);
            getPApplet().image(grownUp, h, w);
        }
    }

    public void mouseClicked(int mouseX, int mouseY){
        super.mouseClicked(mouseX, mouseY);
        if(getPApplet().dist(mouseX, mouseY, getX(), getY()) < getWidth()/2){
            //magic.play();
            young = !young;
        }
    }
}

