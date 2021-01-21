import processing.core.PApplet;
import processing.core.PImage;

public class ImageProcessing extends PApplet {

    Sprite[] sprites;

    public static void main(String[] args) {

        PApplet.main("ImageProcessing");
    }

    public void setup() {

        // make a new Sprite object and add it to the spirtes array
        sprites = new Sprite[18]; // allocating they array with one space available for a Sprite

        for (int i = 0; i < sprites.length; i++) {
            Sprite s;
            if (i % 6 == 0) {
                s = new Contrasting(this, (int) random(width), (int) random(height), 276, 283, i);
            } else if (i % 6 == 1) {
                s = new Rotating(this, (int) random(width), (int) random(height), 276, 283, i);
            } else if (i % 6 == 2) {
                s = new Hopping(this, (int) random(width), (int) random(height), 276, 283, i);
            } else if (i % 6 == 3) {
                s = new Superhero(this, (int) random(width), (int) random(height), 276, 283, i);
            } else if (i % 6 == 4){
                s = new GrowUp(this, (int) random(width), (int) random(height), 276, 283, i);
            } else {
                s = new QuizClass(this, (int) random(width), (int) random(height), 276, 283, i);
            }
            s.setup();
            sprites[i] = s;
        }
    }

        public void settings(){
            super.settings();
            setSize(1000, 1000);
        }

        public void draw () {
            // substitute for background call
            fancyBackground();
            for (int i = 0; i < sprites.length; i++) {
                Sprite s = sprites[i];
                s.draw();
            }
        }

        public void mouseClicked(){
            for (int i = 0; i < sprites.length; i++) {
                Sprite s = sprites[i];
                s.mouseClicked(mouseX, mouseY);
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

