void setup() {
  
  size(400,400);
fill (109, 69, 30);
ellipse (200,200,210,210);
fill (200, 10, 10);
ellipse (200,200,190,190);
fill (#F2E658);
ellipse (200,200,180,180);
}

void draw() {
  int x = mouseX;
  int y = mouseY;
  PImage pizza = loadImage("pizza.gif");
  pizza.resize(10,10);

 if (mousePressed) {
   
  
  image(pizza, x, y);
  
  
  
 }
  
}