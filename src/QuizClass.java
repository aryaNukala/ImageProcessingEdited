import processing.core.PApplet;

public class QuizClass extends Sprite {

    private int clicks;
    private int x;
    private int y;
    private int width;
    private int height;

    QuizClass(PApplet _pApplet, int _x, int _y, int  _width, int _height, int _identifier){
        super(_pApplet, _x, _y, _width, _height, _identifier);
        x = _x;
        y = _y;
        width = _width;
        height = _height;
    }

    public void setup(){
        super.setup();
    }

    public void mouseClicked(int mouseX, int mouseY) {
        super.mouseClicked(mouseX, mouseY);
        if (getPApplet().dist(mouseX, mouseY, getX(), getY()) < getWidth() / 2) {
            clicks++;
        }
    }

    public void draw(){
        if(clicks % 2 == 0) {
            getPApplet().fill(255);
        } else {
            getPApplet().fill(0);
        }
        getPApplet().ellipse(x, y, width, height );
    }
}
