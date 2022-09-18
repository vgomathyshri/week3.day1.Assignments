package week3.day1.assignments;

public class Automation extends MultipleLanguage implements Language, TestTool{

	public static void main(String[] args) {
		
		Automation auto = new Automation();
		
		auto.selenium();
		auto.java();
		auto.ruby();
		auto.python();

	}

	public void selenium() {
		System.out.println("Selenium is implemented in Automation Class from TestTool Interface ");		
	}

	public void java() {
		System.out.println("Java is implemented in Automation Class from Language Interface ");	
		
	}

	@Override
	public void ruby() {
		System.out.println("Rubby overridden from MultipleLanguage class is implemented in Automation Class ");	
		
	}

	public void python()
	{
		System.out.println("Python overridden from MultipleLanguage class is implemented in Automation Class ");	
	}

}
