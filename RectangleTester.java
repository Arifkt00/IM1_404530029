/*
 * [A]98
 * [TA's advise]
 * 1.You don't need to use the class Random in this homework.
 * 2.Your homework is good, but you can calculate area and perimeter from height and width,
 * so you don't need to declare variables to store them, but it doesn't matter.
 * 3.You don't use the methods: getWidth() and getHeight(), -2.
 * */

//import java.util.Random;

class Rectangle {
	int x, y;
	double height, width;

	// the value below can be calculated from Height and Width.
	double area, perimeter;

	Rectangle() {
		// please use the code to initial the object.
		// this(-1,-1,-1,-1); //it will be better if you add this line to your hw.
	}

	Rectangle(int _x, int _y, double _height, double _width) {
		this.x = _x;
		this.y = _y;
		this.height = _height;
		this.width = _width;

		// Both of line below is neccessary?
		this.area = _width * _height;
		this.perimeter = (_height + _width) * 2;

	}

	int getx() {
		return this.x;
	}

	int gety() {
		return this.y;
	}

	double getheight() {
		return this.height;
	}

	double getwidth() {
		return this.width;
	}

	double getarea() {
		return this.area;
	}

	double getperimeter() {
		return this.perimeter;
	}

	public String toString() {
		return "java.Rectangle[x=" + this.x + ",y=" + this.y + ",width=" + this.width + ",height=" + this.height + "]"
				+ "\nArea=" + this.area + "\nPerimeter=" + this.perimeter;
	}
}

public class RectangleTester {

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(15, 25, 18, 57);
		Rectangle rectangle2 = new Rectangle(0, 12, 47, 60);
		System.out.println(rectangle1);
		System.out.println(rectangle2);
		System.out.println("End of Output");
	}

}
