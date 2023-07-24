package packageexam;

public class day26exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Son jathin = new Son("ratnam", "koka", "shiva", "jathin");

		System.out.println(jathin.firstname);

		System.out.println(jathin.lastname);
		System.out.println(jathin.fname);
		System.out.println(jathin.sname);

		jathin.displayfname();
		jathin.displayname();
		jathin.displaysname();

	}

}

class Grandfather {
	String firstname;
	String lastname;

	public Grandfather(String fn, String ln) {
		this.firstname = fn;
		this.lastname = ln;
	}

	public void displayname() {
		System.out.println(this.firstname + this.lastname);
	}
}

class Father extends Grandfather {
	String fname;

	public Father(String fn, String ln, String fnm) {
		super(fn, ln);
		this.fname = fnm;
	}

	public void displayfname() {
		System.out.println(this.fname + this.lastname);
	}
}

class Son extends Father {

	String sname;

	public Son(String fn, String ln, String fnm, String snm) {
		super(fn, ln, fnm);
		this.sname = snm;
	}

	public void displaysname() {
		System.out.println(this.sname + this.lastname);
	}
}
