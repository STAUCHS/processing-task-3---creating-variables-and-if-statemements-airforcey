import processing.core.PApplet;

public class Sketch extends PApplet {
  float rectX;
  float rectY;
  float triangleX;
  float triangleY;
  float triangleZ;
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);

    rectX = random(0,600);
    rectY = random(0,800);
    

    triangleX = random(0, 600);
    triangleY = random(0, 800);
    triangleZ = random(0, 800);
    // Drawing an eclipse in random locations

    // float rectWidth = random(10, 50);
    // float rectHeight = random(10, 50);
    // ellipse(rectX, rectY, rectWidth, rectHeight);

  
    // float triangleWidth = random(30, 50);
    // float triangleHeight = random(30, 50);
    // if (triangleX < 200 && triangleY < 200){
    //   ellipse(triangleX, triangleY, triangleWidth, triangleHeight);
    // }
    // show current time on screen
    int hr = hour();
    int min = minute();

    fill(0);
    textSize(30);
    text(hr, 0, 100);
    text(min, 0, 130);

  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	
    // triangle (house roof)
    triangle(triangleX, triangleY, triangleX + 100, triangleY - 50, triangleX + 200, triangleY);

    //rectangle (base for house)
    fill(200, 125, 100);
    stroke(153);
    rect(triangleX, triangleY, 200, 200);
  
  // define other methods down here.

  }

}