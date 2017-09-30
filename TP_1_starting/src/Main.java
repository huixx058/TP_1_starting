
public class Main {

	public static void main(String[] args) {
		
		Patron p1 = new Patron("P47", "Eric");		
		Copy c1 = new Copy("C1", "Fun with Objects");
		Copy c2 = new Copy("C2", "More Fun with Objects");
		
		p1.patronInfo();
		System.out.println(" ");
		
		System.out.println("Patron Checks out 1st book");
		
		p1.checkCopyOut(c1);
		System.out.println(" ");
		
		p1.patronInfo();
		System.out.println(" ");
		
		System.out.println("Patron Checks out 2nd book");
		
		p1.checkCopyOut(c2);
		System.out.println(" ");
		
		p1.patronInfo();
		System.out.println(" ");
		
		System.out.println("Patron Checks in 1st book");
		
		p1.checkCopyIn(c1);
		System.out.println(" ");
		
		p1.patronInfo();
		System.out.println(" ");
		
		System.out.println("Patron Checks in 2nd book");
		
		p1.checkCopyIn(c2);
		
		System.out.println(" ");
		p1.patronInfo();
		System.out.println(" ");

	}

}
