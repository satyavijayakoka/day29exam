package packageexam;

public class day29exam {

	public static void main(String[] args) {
		SonA jathin = new SonA("Ratnam", "koka", "shiva", "jathin");
		System.out.println(jathin.firstname);
		System.out.println(jathin.lastname);
		System.out.println(jathin.fname);
		System.out.println(jathin.sname);
		jathin.displayFAname();
		jathin.displayGname();
		jathin.displaysname();

	}

}
class GrandfatherA {
	String firstname;
	String lastname;
	public GrandfatherA(String fn, String ln) {
		this.firstname = fn;
		this.lastname = ln;
	}
	public void displayGname() {
		System.out.println(this.firstname+this.lastname);
	}
}
class FatherA extends GrandfatherA{
	String fname;
	public FatherA(String fn, String ln, String Fn) {
		super(fn, ln);
		this.fname = Fn;
		
	}
	public void displayFAname() {
		System.out.println(this.fname+this.lastname);
	}
}
class SonA extends FatherA{
	String sname;
	public SonA(String fn, String ln,  String Fn, String sn ) {
		super(fn, ln, Fn);
		this.sname = sn;
	}
	public void displaysname() {
		System.out.println(this.sname+this.lastname);
	}
}



