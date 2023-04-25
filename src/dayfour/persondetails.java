package dayfour;
import java.util.Scanner;

public class persondetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner ob=new Scanner(System.in);
			System.out.println("enter the name :");
			String name=ob.next();
			System.out.println("enter the age :");
			int age=ob.nextInt();
			System.out.println("enter the gender :");
			String gender=ob.next();
			System.out.println("enter the income :");
			int income=ob.nextInt();
			
			
			
			
			person person=new person();
			person.setName(name);
			person.setAge(age);
			person.setGender(gender);
			person.setIncome(income);
			
			
			System.out.println(person);
			
			Taxcaluculation calc = new Taxcaluculation();
			calc.Taxcaluculation(person);
			System.out.println("After calculation tax : ");
			System.out.println(person);
			ob.close();
			
		}


	}


