
public class Overloading {
	
	void addNumbers(int num1,int num2)
	{
		int result=num1+num2;
		System.out.println(" >> result is: "+result);
		
	}
	
	/*void addNumbers(int n1,int n2)
	{
		int result=num1+num2;
		System.out.println(" >> result is: "+result);
		
	}*/
	
	/*void addNumbers(int num1,int num2)
	{
		int result=num1+num2;
		System.out.println(" >> result is: "+result);
		
	}
	*/
	
	void addNumbers(int num1,int num2,int num3)
	{
		int result=num1+num2;
		System.out.println(" >> result is: "+result);
		
	}
	
	void addNumbers(double num1,double num2)
	{
		double result=num1+num2;
		System.out.println(" >> result is: "+result);
		
	}
	
	void addNumbers(int...inputs)
	{
		System.out.println(">> inpputs is: "+inputs);
		int sum=0;
		for(int num:inputs) {
			sum+=num;
		}
		System.out.println(">> sum is: "+sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overloading oRef = new Overloading();
		oRef.addNumbers(10, 20);
		oRef.addNumbers(10, 20,30);
		oRef.addNumbers(2.2, 3.3);
		oRef.addNumbers(10,20,30,40,50);
		

	}

}
