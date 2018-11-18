// MergeSort.java

public class MergeSort {

public static void main(String[] args) {

MergeSort ms = new MergeSort();


//int[] arr = {8,3,2,9,7,1,5,4};
//int[] arr = {8};

int[] arr = {54, 26, 93, 17, 77, 31, 44, 55, 20};

//ms.merge(new int[] {3,4}, new int[] {1, 7, 9});

System.out.print("Input Array ");
for (int c : arr)
System.out.print(c + " ");
System.out.println("");

ms.mSort(arr);



} // end method main


public void mSort(int[] a) {

	// int[] B = new int[a.length];
 	if (a.length > 1) {

	int middle = a.length / 2;

	int[] left_half = new int[middle];
	int[] right_half = new int[a.length - middle];

	for (int i = 0; i < middle; i++)
		left_half[i] = a[i];

	for (int j = 0, i = middle; i < a.length; i++, j++)
		right_half[j] = a[i];

	 
	 mSort(left_half);
	 mSort(right_half);

	 int[] B = merge(left_half,right_half);
	  for (int i = 0; i < B.length; i++)
		a[i] = B[i];
	}

	//for (int c : B)
	//System.out.print(c + " ");
	//System.out.println("");

	//return new int[] {};

	

} // end method mSort


public int[] merge(int[] x, int[] y){

	int i = 0; // track x -array
	int j = 0; // track y - array
	int k = 0;

	int[] c = new int[x.length + y.length];  // create a new array to hold result of merge

while (i < x.length && j < y.length){
	if (x[i] <= y[j]) {
	c[k] = x[i];
	i++;
	k++;
	} else {
	c[k] = y[j];
	j++;
	k++;
}

}// end while loop

	while (i < x.length) {
	c[k] = x[i];
	i++;
	k++;

	} 

while (j < y.length) {
	c[k] = y[j];
	j++;
	k++;

	} 

	System.out.print("Sorted Merged ");
	for (int c2 : c)
	System.out.print(c2 + " ");
	System.out.println(" ");
	return c;

}// end method merge



} // end class MergeSort
