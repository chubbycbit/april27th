
public class NDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1= {10,20,30,40,50};
		
		int[][] a2= { 
			//	 0  1  2  3  4
				{10,20,30},      //0
				{10,20,30,40,50},//1
				{10,20},         //2
				{10,20,30,40},   //3
				{10}             //4
		};
		System.out.println(">> a1 length is: "+a1.length);
		System.out.println(">> a2 length is: "+a2.length);
		
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2[i].length;j++)
			{
				System.out.println(a2[i][j]+"\t ");
			}
			System.out.println();
		}

	}

}
