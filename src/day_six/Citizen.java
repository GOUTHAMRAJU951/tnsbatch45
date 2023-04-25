package day_six;

public class Citizen {
	
	private String name;
	private String adhaarnumber;
	private String address;
	private long phno;
	
	public Citizen(){
		System.out.println("citizen object is created");
	}
	
	public Citizen(String name,String adhaarnumber,String address,long phno) {
		this.name=name;
		this.adhaarnumber=adhaarnumber;
		this.address=address;
		this.phno=phno;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdhaarnumber() {
		return adhaarnumber;
	}

	public void setAdhaarnumber(String adhaarnumber) {
		this.adhaarnumber = adhaarnumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}
	
	public String tostring() {
		return "Citizen [name=" + name + ", adhaarnumber=" + adhaarnumber + ", address=" + address + ", phno=" + phno + "]";
	}
}
	
	


