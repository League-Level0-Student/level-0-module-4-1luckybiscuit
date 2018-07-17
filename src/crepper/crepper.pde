PImage creeper;     //at the top of your program
void setup() {
  size(1200,800);
  PImage minecraft = loadImage("guac.jpg");     //in setup method
  minecraft.resize(width, height);          //in setup method
  background(minecraft);          //in setup method
  creeper=loadImage("creeper.png");     //in setup method
  creeper.resize(20, 20);
  image(creeper, 786, 437); 
}
boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}
void draw() {
  if(mousePressed) {
    if(isNear(mouseX, 786) == true) {
      if(isNear(mouseY, 437) == true) {
      fill(#2DFF00); 
      textSize(80);
      text("You found the creeper!",100,400);
      }
    }else{
    fill(#FF0004);
    }
  }
}