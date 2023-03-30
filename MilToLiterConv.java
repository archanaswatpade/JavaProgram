public class MilToLiterConv{
	
	public static void main(String args[])
	{
		String operation=args[0];
		int num1=Integer.parseInt(args[1]);
		//int num2=Integer.parseInt(args[2]);
		
		switch(operation){

		case "mil":{
			float m1=(num1/1000);
			System.out.println("millilitres to Liter : "+m1);
			break;
		}
		case "lit":{
			System.out.println("Liter to millilitres  : "+(num1*1000));
			break;
		}
		default :{
			System.out.println("In Default");
		}
		}

	}

}