public class FullNameConcat{

 public static void main(String args[]){  
     System.out.println("Lenght of Argument is : "+args.length); 

	String fName =args[0];
	String lName =args[1];
 	 
	System.out.println("Full name using Concat function : "+fName.concat(" ").concat(lName));

    }
}