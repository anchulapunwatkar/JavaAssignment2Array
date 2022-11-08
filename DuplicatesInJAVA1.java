
public class DuplicatesInJAVA1 {
public static void main(String[]args){
	int[]a= {1,2,3,4,3,2,6,5,7,4};
	
	System.out.println("Duplicate values present in arrays are :");
	
	for (int i=0;i<a.length-1;i++)
	{ 
		for(int j=i+1;j<a.length;j++)
		{
			if((a[i]==a[j])&& i!=j)
			{
				System.out.print(a[j]+" ");
			}
		}
	}
}
}
