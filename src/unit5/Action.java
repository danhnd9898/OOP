/*package unit5;
import java.awt.Graphics;
import javax.swing.JPanel;
public abstract class Action {
 public int  x,y;
  Action(int x, int y)
 {
	 this.x=x;
	 this.y=y;
 }
 public void moveTo(Graphics g)
 {
	 erase(g);
	 //x = x1; y = y1;
	 draw(g);
	 }
	 abstract public void erase(Graphics g);
	 abstract public void draw(Graphics g);
}
class Circle extends Action {
int radius;
public Circle(int x, int y, int r) {
super(x, y); 
radius = r;
}
public void draw(Graphics g) {
System.out.println("Draw circle at ("
+ x + "," + y + ")");
g.drawOval(x-radius, y-radius,
2*radius, 2*radius);
}
public void erase(Graphics g) {
System.out.println("Erase circle at ("
+ x + "," + y + ")");
// paint the circle with background color...
}
} */