import processing.core.PApplet;
import java.util.*;

public class ImageProcessing extends PApplet {

    java.util.ArrayList<Sprite> sprites;
    private int i;
    private Sprite s;
    private int spritess;

    public static void main(String[] args) {

        PApplet.main("ImageProcessing");
    }

    public void setup() {

        // make a new Sprite object and add it to the sprites array
        spritess = 15;
        sprites = new ArrayList<Sprite>(); // allocating they array with one space available for a Sprite
        i = 0;
        for (i = 0; i < spritess; i++)
        if(spritess % 5 == 0){
            s = new Contrasting(this, (int) random(width), (int) random(height), 276, 283, i);
        } else if(spritess % 5 == 1){
            s = new Rotating(this, (int) random(width), (int) random(height), 276, 283,i);
        } else if(spritess % 5 == 2){
            s = new Hopping(this, (int) random(width), (int) random(height), 276, 283, i);
        } else if(spritess % 5 == 3){
            s = new Superhero(this, (int) random(width), (int) random(height), 276, 283, i);
        } else if(spritess % 5 == 4){
            s = new GrowUp(this, (int) random(width), (int) random(height), 276, 283, i);
        }
        sprites.add(s);
        s.setup();
    }

        public void settings(){
            super.settings();
            setSize(1000, 1000);
        }

        public void draw () {
            // substitute for background call
            fancyBackground();
            for (int i = 0; i < sprites.size(); i++) {
                Sprite s = sprites.get(i);
                s.draw();
            }
        }

        public void mouseClicked(){
            for (int i = 0; i < sprites.size(); i++) {
                Sprite s = sprites.get(i);
                s.mouseClicked(mouseX, mouseY);
            }
        }

        public void keyPressed(){
            if((Character.toString(key)).equals("a")){
                spritess ++;
                if(spritess % 5 == 0){
                    s = new Contrasting(this, (int) random(width), (int) random(height), 276, 283, i);
                } else if(spritess % 5 == 1){
                    s = new Rotating(this, (int) random(width), (int) random(height), 276, 283,i);
                } else if(spritess % 5 == 2){
                    s = new Hopping(this, (int) random(width), (int) random(height), 276, 283, i);
                } else if(spritess % 5 == 3){
                    s = new Superhero(this, (int) random(width), (int) random(height), 276, 283, i);
                } else if(spritess % 5 == 4){
                    s = new GrowUp(this, (int) random(width), (int) random(height), 276, 283, i);
                }
                sprites.add(s);
                s.setup();
            }

            if((Character.toString(key)).equals("s")){
                sprites.remove(sprites.get(sprites.size()-1));
                spritess--;
            }
        }

        private void fancyBackground(){
            // this is where you can manipulate pixels array in interesting ways

            loadPixels();

            for (int x = 0; x < width; x++) {
                // Loop through every pixel row
                for (int y = 0; y < height; y++) {

                    // Use the formula to find the 1D location
                    int loc = x + y * width;
                    // If even column
                    if (x % 3 == 0) {
                        pixels[loc] = color(230, 138, 0);
                        // If odd column
                    } else if (x % 3 == 1) {
                        pixels[loc] = color(0);
                    } else {
                        pixels[loc] = color(255);
                    }
                }
            }
            updatePixels();
        }

    }

