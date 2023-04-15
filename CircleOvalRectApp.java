interface Shape3{
	final double PI = 3.14;
	void draw3();
	double getArea2();
	default public void redraw2() {
		System.out.print("---다시 그립니다.");
		draw3();
	}
}
class Circle3 implements Shape3 {
	private int r;
	Circle3(int r){
	this.r = r;
}
public void draw3() {
	System.out.println("반지름이"+r+"인 원입니다.");
}
public double getArea2() {
	return r*r*PI;
 	}
}
class Oval2 implements Shape3{
	private int width, height;
	Oval2(int width, int height){
		this.width=width;
		this.height=height;
	}
	public void draw3() {
		System.out.println(width+"X"+height+"에 내접하는 타원입니다.");
	}
	public double getArea2() {
		return(width/2)*(height/2)*PI;
	}
}
class Rect2 implements Shape3{
	private int width, height;
	
	Rect2(int width, int height){
		this.width = width;
		this.height = height;
	}
	public void draw3() {
		System.out.println(width+"X"+height+"크기의 사각형 입니다.");
	}
	public double getArea2() {
		return width*height;
	}
}
public class CircleOvalRectApp {
	public static void main(String[] args) {
		Shape3[] list = new Shape3[3];
		list[0] = new Circle3(10);
		list[1] = new Oval2(20,30);
		list[2] = new Rect2(10,40);
		
		for(int i=0; i< list.length; i++)
			list[i].redraw2();
		for(int i=0; i<list.length; i++)
			System.out.println("면적은"+list[i].getArea2());
	}
}
