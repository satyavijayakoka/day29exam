package packageexam;

public class day29q4 {

	public static void main(String[] args) {
		Calculator satya = new Calculator();
		satya.addition(15, 12);
		satya.addition(15, 12, 11);
		satya.addition(15, 12, 11, 10);

	}

}
class Calculator{
	public void addition(int x, int y) {
		System.out.println(x+y);
	}
	public void addition(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	public void addition(int x, int y, int z, int a) {
		System.out.println(x+y+z+a);
	}
}