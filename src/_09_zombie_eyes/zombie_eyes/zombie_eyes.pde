PImage face;
void setup() {
size (1000, 1000);
face = loadImage("face.png");
}
int  value = #FF0000;
void draw() {
image(face, 50, 50);
ellipse (300, 260, 145, 145);
fill(value);
ellipse (420, 260, 105, 105);
fill(value);
   if (mousePressed) 
    value = #FFFFFF; 
}
//complete
