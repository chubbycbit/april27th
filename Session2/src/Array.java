
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10,20,30,40,50};
		
		//System.out.println("Numbers are  "+numbers);
		/*System.out.println(">> numbers[0] is: "+numbers[0]);
		System.out.println(">> numbers[0] is: "+numbers[1]);
		System.out.println(">> numbers[0] is: "+numbers[2]);
		System.out.println(">> numbers[0] is: "+numbers[3]);
		System.out.println(">> numbers[0] is: "+numbers[4]);
		*/
		
		for(int i=0;i<=4;i++)
		{
			System.out.println("Numbers are "+numbers[i]);
		}
		
		numbers[0]=111;
		numbers[1]=211;
		System.out.println(">> numbers[0] is: "+numbers[0]);
		System.out.println(">> numbers[1] is: "+numbers[1]);
		

	}

}
