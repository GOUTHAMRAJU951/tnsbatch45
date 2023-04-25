package dayfive;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		base b1=new base();
		b1.methoddefault();
		b1.methodprotected();
		b1.methodpublic();
		
		
		b1.vardefault=11;
		b1.methoddefault();
		//private member accessing
		/*b1.varprivate=21;
		 b1.methodprivate();*/
		
		b1.varprotected=31;
		b1.methodprotected();
		
		b1.varpublic=41;
		b1.methodpublic();
	}

}
