package daythree;

public class foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		for(int i:a)
		{
			System.out.print(i+ " ");
		}
		System.out.println();
		
		char ch[]= {'j','a','v','a'};
		for(char c:ch)
		{
			System.out.print(c + " ");
			
		}
		System.out.println();
		
		String s1[]= {"java","is","a","programming","language"};
		for(String s:s1)
		{
			System.out.print(s + " ");
		}

	}

}
