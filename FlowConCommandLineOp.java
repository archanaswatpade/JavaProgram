
public class FlowConCommandLineOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String operation=args[0];
		String s1=args[1];
		String s2=args[2];
		
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		if(operation.equals("mul"))
		{
			System.out.println("Multiplication="+(n1*n2));
		}
		else 
		{
			System.out.println("Addition="+(n1+n2));
		}
	}

}
