package packageexam;

public class day294 {

	public static void main(String[] args) {
		
 CPU c = new CPU();
 System.out.println(c.price);
 int p =c.displayprice();
 System.out.println(p);
 
 CPU.Processor PRO = c.new Processor();
 System.out.println(PRO.manufacturer);
 String q = PRO.displaySpeed();
 System.out.println(q);
 
 
	}

}
class CPU{
	int price = 1000;
	public int displayprice() {
		return this.price;
	}
	class Processor {
		String manufacturer = "intel";
		public String displaySpeed() {
			return "faster";
		}
	}
}