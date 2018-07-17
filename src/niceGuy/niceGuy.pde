PImage donkey;
PImage tail;
int x;
int y;
boolean bool = false;
import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch

// put these lines where you want the sound to play
void setup() {
  donkey = loadImage("niceguy.jpg");      //change the file name if you need to
  tail = loadImage("fedora.png");      //change the file name if you need to
  size(500, 328);
  Minim minim = new Minim(this);
  woohooSound = minim.loadSample("clap.wav");
}
void draw() {
  fill(255, 255, 255);
  if (dist(0, 0, mouseX, mouseY) > 30) {
    background(#F0752E);
  } else {
    background (donkey);
  }
  if (mousePressed) {
      background (donkey);
      bool = true;
      x = mouseX;
      y = mouseY;
      if(mouseX > 180 && mouseX < 245 && mouseY > 61 && mouseY < 105) {
        if (playSound) {
     woohooSound.trigger();
     playSound = false;
}
    }else{
      println("Whoops! You missed!");
    }}
    if (bool == true) {
    background (donkey);
    image(tail, x-175, y-200, 350, 300);
  } else {
    image(tail, mouseX-175, mouseY-200, 350, 300);
  }
  rect(0, 0, 30, 30);
  textSize(20);
  text("Put the fedora on\nthe nice guy!\nHe's been having\n a hard time...it's\nhis 107th rejection.",300,180);
}