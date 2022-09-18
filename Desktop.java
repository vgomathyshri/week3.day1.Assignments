package week3.day1.assignments;

public class Desktop extends Computer{

	public void desktopSize()
	{
		System.out.println("Desktop size is 10 inch");
	}
	public static void main(String[] args) {
	
		Desktop deskobj = new Desktop();
		
		deskobj.computerModel();
		deskobj.desktopSize();

	}

}
