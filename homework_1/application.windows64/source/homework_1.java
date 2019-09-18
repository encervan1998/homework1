import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class homework_1 extends PApplet {

PFont f;
int c = color(235);

public void setup(){
  
}

public void draw(){
  background(0);
  fill(c);
  rect(125, 50, 80, 80);
  rect(125, 175, 80, 80);
  rect(125, 300, 80, 80);
  rect(125, 425, 80, 80);
  rect(125, 550, 80, 80);
  rect(125, 675, 80, 80);
  rect(325, 50, 80, 80);
  rect(325, 175, 80, 80);
  rect(325, 300, 80, 80);
  rect(325, 425, 80, 80);
  rect(325, 550, 80, 80);
  rect(325, 675, 80, 80);
  rect(225, 800, 80, 80);
  rect(325, 925, 80, 80);
  rect(325, 1050, 80, 80);
  rect(125, 925, 80, 80);
  rect(125, 1050, 80, 80);
  fill(102);
  textSize(52);
  text(11,133,110);
  text(12,333,110);
  text(9,145,233);
  text(10,333,233);
  text(8,345,360);
  text(7,145,360);
  text(6,343,480);
  text(5,145,480);
  text(3,145,610);
  text(4,343,610);
  text(1,145,733);
  text(2,350,733);
  text("B",250,855);
  textSize(42);
  text("<|>",123,975);
  text(">|<",325,975);
}

public void mouseClicked() {
  if(mouseX<125&&mouseY<50)
  if (c == color(235))
  c= color(87);
  else
  c= color(235);
}
  public void settings() {  size(500,1280); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "homework_1" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
