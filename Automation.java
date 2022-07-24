package week3.day1.Bank;

public class Automation extends MultipleLangauge implements Language,TestTool{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Automation at=new Automation();
			at.Selenium();
			at.Java();
			at.python();
			at.ruby();
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Automation-Selenium");
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Automation-Java");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Automation-Ruby");
	}

	
}
