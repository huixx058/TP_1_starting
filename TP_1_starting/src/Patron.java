
/**
 * 
 * Starting class for TP-1
 * 
 * Feel free to add, modify, or delete any of the following code: it's just a
 * possible starting implementation
 *
 * @author eric
 *
 */

import java.util.ArrayList;

public class Patron
{
	private String patronName;
	private String patronID;
	private ArrayList<Copy> copiesOut;

	public String getPatronName() {
		return patronName;
	}

	public void setPatronName(String patronName) {
		this.patronName = patronName;
	}

	public String getPatronID() {
		return patronID;
	}

	public void setPatronID(String patronID) {
		this.patronID = patronID;
	}

	public ArrayList<Copy> getCopiesOut() {
		return copiesOut;
	}

	public void setCopiesOut(ArrayList<Copy> copiesOut) {
		this.copiesOut = copiesOut;
	}

	public Patron(String id, String name)
	{
		patronID=id;
		patronName=name;
		copiesOut=new ArrayList<Copy>();
	}
	
	public void patronInfo() {
		System.out.println("Patron's information:\nStudent Name: "+ patronName + "\nPatron ID: " + patronID +
				"\nNum of Copies Checked Out: " + copiesOut.size());
	}
	
	public void checkCopyOut(Copy c)
	{	
			
			System.out.println(c.getCopyInfo());
			copiesOut.add(c);
	}

	public void checkCopyIn(Copy c)
	{
		System.out.println(c.getCopyInfo());
		copiesOut.remove(0);
	}

	@Override
	public boolean equals(Object o)
	{
		// finish this: two are equals iff same patron ID

		return false;
	}

	/*public String toString()
	{
		// finish this: return basic Patron info as String

		return "Patron's information:\nStudent Name: "+ patronName + "\nPatron ID: " + patronID +
				"\nNum of Copies Checked Out: " + copiesOut.size() ;
	}
*/
	// put test code in your main(), but realize it's not unit testing!

	public static void main(String[] args)
	{
		Patron p1 = new Patron("P47", "Eric");

		System.out.println(p1);

		Patron p2 = FakeDB.getPatron("P47");
		Copy c1 = FakeDB.getCopy("C1");
	}

}
