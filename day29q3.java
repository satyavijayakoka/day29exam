package packageexam;
interface WBA{
	public void methodsave();
	public void methodloan();
}

public class day29q3 {

	public static void main(String[] args) {
		SBIA hyd = new SBIA();
		hyd.methodloan();
		hyd.methodsave();
		
		PNBA pnj = new PNBA();
		pnj.methodloan();
		pnj.methodsave();

	}

}
class SBIA implements WBA{

	
	public void methodsave() {
	System.out.println("i am save method");	
		
	}
	public void methodloan() {
		System.out.println("i am loan method");
			
	}	
}
class PNBA implements WBA{

	
	public void methodsave() {
		System.out.println("i am save");
		
	}
	public void methodloan() {
		System.out.println("i am loan");
		
	}
	
}