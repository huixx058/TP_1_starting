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
public class Copy
{
	private String copyID;
	private String copyTitle;
	private Patron outTo;

	public Copy(String id, String title)
	{
		copyID=id;
		copyTitle=title;
	}
	

	public String getCopyID() {
		return copyID;
	}

	public void setCopyID(String copyID) {
		this.copyID = copyID;
	}

	public String getCopyTitle() {
		return copyTitle;
	}

	public void setCopyTitle(String copyTitle) {
		this.copyTitle = copyTitle;
	}

	public Patron getOutTo() {
		return outTo;
	}

	public void setOutTo(Patron outTo) {
		this.outTo = outTo;
	}
	
	public String getCopyInfo() {
		return "Copy's information:\nCopy ID :"+ copyID +"\nCopy Title: " + copyTitle;
	}



	/*public String toString()
	{
		
		return "Copy's information:\nCopy ID :"+ copyID +"\nCopy Title: " + copyTitle;
	}*/

	@Override
	public boolean equals(Object o)
	{
		// finish this: two are equals iff same copy ID

		return false;
	}

	// put test code in your main(), but realize it's not unit testing!

	public static void main(String[] args)
	{
		Copy c1 = new Copy("C1", "Fun with Objects");
		
		//Patron p1 = new Patron("Eric", "P47");

		System.out.println(c1);
		//System.out.println(p1);

		Copy c2 = FakeDB.getCopy("C2");
	}
}
