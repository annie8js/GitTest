
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//class A{
//	public A(int x) { System.out.print("A"+x); }
//}
//class B extends A{
//	public B() { System.out.print("B"); }
//	public B(int x) { System.out.print("B"+x); }
//}

class Shape{
	public void draw() { System.out.println("Shape"); }
}
class Circle extends Shape{
	public void paint() {
	}
	public void draw() { System.out.println("Circle"); }
}