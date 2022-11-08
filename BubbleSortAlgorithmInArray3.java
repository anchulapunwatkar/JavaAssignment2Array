public class BubbleSortAlgorithmInArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {77,54,26,35,13,40,68,99,88,77,55};
		System.out.println("sorted Array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j]<a[j-1])
				{
					int tempVar=a[j];
					a[j]=a[j-1];
					a[j-1]=tempVar;
				}
			}
		}
		
		for(int el:a)
		{
			System.out.print(el+" ");
			
		}
	}

}
