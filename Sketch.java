import processing.core.PApplet;

/**
 * Draws stickman and hearts
 * @author J. Lau
 */
public class Sketch extends PApplet {


  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
    size(800, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // color 
    stroke(230, 8, 7);
    rowOfFigure(0);
    stroke(245, 140, 17);
    rowOfFigure(50);
    stroke(234, 227, 5);
    rowOfFigure(100);
    stroke(64, 178, 50);
    rowOfFigure(150);
    stroke(0, 100, 165);
    rowOfFigure(200);
    stroke(0, 20, 220);
    rowOfFigure(250);
    stroke(140, 0, 220);
    rowOfFigure(300);

  // hearts
  for (int x = 1; x < 7; x++) {
    int yBalance = (x % 2) * 50; 
    for (int y = 50; y < 700; y += 100) {
        drawHeart(y + yBalance, x * 50);
    }
  }
}

  private void rowOfFigure(int y) {
    for(int x = 0; x < 750; x += 50){
      drawMan(x, y);
    }
  }

   private void drawMan(int x, int y) {
    int baseX = x + 50;
    int baseY = y;

    fill(200, 250, 170); 
    line(baseX, 45 + baseY, baseX, 60 + baseY); 
    ellipse(baseX, 35 + baseY, 17, 17); 
    line(baseX, 60 + baseY, 65 + x, 70 + baseY); 
    line(baseX, 60 + baseY, 35 + x, 70 + baseY); 
    line(baseX, 55 + baseY, 65 + x, 45 + baseY); 
    line(baseX, 55 + baseY, 35 + x, 45 + baseY); 
}

  private void drawHeart(int x, int y) {
    stroke(0); 
    fill(0); 
    triangle(17 + x, 10 + y, 25 + x, 20 + y, 33 + x, 10 + y);
    triangle(17 + x, 10 + y, 21 + x, 5 + y, 25 + x, 10 + y);
    triangle(25 + x, 10 + y, 29 + x, 5 + y, 33 + x, 10 + y);
  }
}