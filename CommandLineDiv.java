public class CommandLineDiv{

 public static void main(String args[]){  
     System.out.println("Lenght of Argument is : "+args.length); 

	String fNumber=args[0];
	String sNumber=args[1];
 	int a=Integer.parseInt(fNumber); 
	int b=Integer.parseInt(sNumber);
	float c=a/b; 
	System.out.println("Division : "+c); 

    }
}