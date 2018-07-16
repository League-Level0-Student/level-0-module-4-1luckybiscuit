void setup() {
  size(1000,1000);
  PImage face = loadImage("face.jpg");
  image(face, -240, -160, 1450, 1400);
}
void draw() {
  //background(0);
  fill(#FFFFFF);
  ellipse(300,500,250,200);
  ellipse(660,500,250,200);
  fill(0,0,0);
  if(mouseX<225) {
    mouseX = 225;
  }
  if(mouseX>375) {
    mouseX = 375;
  }
  if(mouseY>550) {
    mouseY = 550;
  }
  if(mouseY<450) {
    mouseY = 450;
  }
  int mx = mouseX + 360;
  ellipse(mouseX,mouseY,50,50);
  ellipse(mx,mouseY,50,50);
}