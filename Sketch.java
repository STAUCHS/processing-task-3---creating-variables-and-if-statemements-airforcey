import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);

    // show current time on screen
    int hr = hour();
    int min = minute();

    fill(0);
    textSize(30);
    text(hr, 0, 100);
    text(min, 0, 130);

    // Drawing an eclipse in random locations
    float ellipseX = random(0, 200);
    float ellipseY = random(0,200);
    float ellipseWidth = random(10, 50);
    float ellipseHeight = random(10, 50);
    ellipse(ellipseX, ellipseY, ellipseWidth, ellipseHeight);

    float randomX = random(0, 400);
    float randomY = random(90, 400);
    if (randomX < 200 && randomY < 200){
      ellipse(randomX, randomY, ellipseWidth, ellipseHeight);
    }
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	
  // triangle (house roof)
  triangle(110,250, 200, 100, 315, 250);


  //rectangle (base for house)
  fill(200,125, 100);
  size(600, 800);
  stroke(153);
  rect(110, 250, 200, 200);
  
  // define other methods down here.}

}

}