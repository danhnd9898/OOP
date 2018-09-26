package unit4;

public class Ship{
private  double x=1.0, y=1.0;
private  double speed=1.0, direction=0.0;
public  String name;
public Ship(String name) {
this.name = name;
}
public Ship(String name, double x, double y) {
this(name); this.x = x; this.y = y;
}
public Ship(String name, double x, double y,
double speed, double direction) {
this(name, x, y);
this.speed = speed;
this.direction = direction;
}
private double degreeToRadian(double degrees) {
return(degrees * Math.PI / 180.0);
}
public void move() {
move(1);
}
public void move(int steps) {
double angle = degreeToRadian(direction);
x = x + (double)steps*speed*Math.cos(angle);
y = y + (double)steps*speed*Math.sin(angle);
}
public  void printLocation() {
System.out.println(name + " is at ("+ x + "," + y + ").");
}
public static void main(String []args)
{
	// Ship sh = new Ship("Name");
	Ship sh1 = new Ship("a", 4 , 5 , 6 , 7);
	//System.out.println(sh1.name +" " + sh1.speed+ " " + sh1.direction+ " " + sh1.x+ " "+ sh1.y+" ");
//	int steps = 60;
	sh1.move(60);
	sh1.printLocation();
}
}