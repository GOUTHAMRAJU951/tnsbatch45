package dayfive;

public class base {
	//declaring default,public,protected,pvt & protected types
	
	int vardefault=10;
	public int varpublic=20;
	private int varprivate;
	protected int varprotected=40;
	
	void methoddefault() {
		System.out.println("default aceess base class");
		System.out.println("default variable: "+vardefault);
		
	}
	public void methodpublic() {
		System.out.println("public access base class");
		System.out.println("public variable: "+varpublic);
	}
	private void methodprivate() {
		System.out.println("private acees base class");
		System.out.println("private variable: "+varprivate);
	}
	protected void methodprotected() {
		System.out.println("protected access base class");
		System.out.println("protected variable: "+varprotected);
	}

}
