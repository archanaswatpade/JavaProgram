public class WhileLoop{
	
	public static void main(String args[])
	{
		//int i=1;
		int num1=Integer.parseInt(args[0]);

		int num2=Integer.parseInt(args[1]);
		
		
		while(num1>0 && num1<=num2){
			System.out.println(num1);
			num1=++num1;
		}
		System.out.println("Finished");
		

	}

}