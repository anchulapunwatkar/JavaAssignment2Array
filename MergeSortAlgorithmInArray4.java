import java.util.Arrays;
class MergeSortAlgorithmInArray4 {
// Merge two sub arrays N and M into array
void merge(int array[], int a, int b, int c) {

    int n1 = b - a + 1;
    int n2 = c - b;

    int N[] = new int[n1];
    int M[] = new int[n2];

    // fill the left and right array
    for (int i = 0; i < n1; i++)
      N[i] = array[a + i];
    for (int j = 0; j < n2; j++)
      M[j] = array[b + 1 + j];

    // Maintain current index of sub-arrays and main array
    int i, j, k;
    i = 0;
    j = 0;
    k = a;

    // Until we reach either end of either N or M, pick larger among
    // for sorting in descending
    // use if(L[i] >= <[j])
    while (i < n1 && j < n2) {
      if (N[i] <= M[j]) {
        array[k] = N[i];
        i++;
      } else {
        array[k] = M[j];
        j++;
      }
      k++;
    }

    while (i < n1) {
      array[k] = N[i];
      i++;
      k++;
    }

    while (j < n2) {
      array[k] = M[j];
      j++;
      k++;
    }
  }

  // Divide the array into two sub arrays, sort them and merge them
  void mergeSort(int array[], int left, int right) {
    if (left < right) {

      // m is the point where the array is divided into two sub arrays
      int mid = (left + right) / 2;

      // recursive call to each sub arrays
      mergeSort(array, left, mid);
      mergeSort(array, mid + 1, right);

      // Merge the sorted sub arrays
      merge(array, left, mid, right);
    }
  }

  public static void main(String args[]) {

    // created an unsorted array
    int[] array = { 6, 5, 12, 10, 9, 13,14,99 };

    MergeSortAlgorithmInArray4 ob = new MergeSortAlgorithmInArray4();

    // call the method mergeSort()
    // pass argument: array, first index and last index
    ob.mergeSort(array, 0, array.length - 1);

    System.out.println("Sorted Array:");
    System.out.println(Arrays.toString(array));
  }
}
