class SelectionSortAlgorithmInArray5
{
void sort(int array[])
{
int n = array.length;
for (int i = 0; i < n-1; i++)
{
int min_element = i;
for (int j = i+1; j < n; j++)
if (array[j] < array[min_element])
min_element = j;
int temp = array[min_element];
array[min_element] = array[i];
array[i] = temp;
}
}
//Method to print the elements of an array
void printarrayay(int array[])
{
int n = array.length;
for (int i=0; i<n; ++i)
System.out.print(array[i]+" ");
System.out.println();
}
//Main Method
public static void main(String args[])
{
SelectionSortAlgorithmInArray5 ob = new SelectionSortAlgorithmInArray5();
int array[] = {15, 10, 99, 53, 36,88,22,11};
ob.sort(array);
System.out.println("Sorted array");
ob.printarrayay(array);
}
}