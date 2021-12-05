package nev30;



class Person{
	
	//1st problem++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

  // fields
  private String name;
  private String email;
  private String phoneNumber;

  // constructor
  public Person(String theName, String theemail,String phone_number)
  {
     this.name = theName;
     this.email=theemail;
     this.phoneNumber=phone_number; 
  }
  

  // methods - getters
  public String getName() { return this.name;}
  public String getEmail() { return this.email;}
  public String getPhoneNumber() { return this.phoneNumber;}

  // methods - setters
  public void setName(String theName) { this.name = theName;}
  public void setEmail(String theEmail) {this.email = theEmail;}
  public void setPhoneNumber(String thePhoneNumber) { this.phoneNumber = thePhoneNumber;}
  public String toString()
  {
     return this.name + " " + this.email + " " + this.phoneNumber;
  }
  //_____________________________________________________________________________________________________2nd problem

}


public class nev30 {
	public static void main(String[] args)
	   {
	      Person p1 = new Person("Sana","pravi@gmail.com","224433556");
	      System.out.println(p1);
	      
	      p1.setEmail("jean@gmail.com");
	      p1.setPhoneNumber("404 899-9955");
	      System.out.println(p1);
	      
	      
	      
	    
}
	
	
}		
		
		
		
				
		
	      
	      
	      
	   
	
	


