package Algorithms;
//Merge sort algorithm
//it is used for merging the arrays
public class Merge_sort {
	public static int[] merging(int[] l, int[] r)  //passing two arrays
	{											// consider l=left array and r=right array					

		int t = l.length + r.length;		
		int arr_1[] = new int[t];							
		int i = 0, j = 0, k = 0;
		while (i < l.length || j < r.length)   //check for the both the condition
		{
			if (i < l.length && j < r.length) 
			{
				if (l[i] <= r[j]) 
				{
					arr_1[k] = l[i];
					i++;
					k++;
				} 
				else 
				{
					arr_1[k] = r[j];
					j++;
					k++;
				}
			} 
			else if (i < l.length) 
			{
				arr_1[k] = l[i];
				i++;
				k++;
			} 
			else if (j < r.length) 
			{
				arr_1[k] = r[j];
				j++;
				k++;
			}
		}
		return arr_1;
	}
	//it is used for the dividing purpose
	public int[] divide(int arr_2[]) {
		//long startTime = System.currentTimeMillis();
		int middle;
		if (arr_2.length <= 1) 
		{
			return arr_2;
		}
		int[] r;
		middle = arr_2.length / 2;									//get mid point with total length devide by 2
		int[] l = new int[middle];
		if (arr_2.length % 2 == 0)		//check for the even condition 
		{
			r = new int[middle];								//[check for the condition, here we get same number of array OR right array would be 1 more than the left one.			
		} else 
		{
			r = new int[middle + 1];
		}																		

		for (int i = 0; i < middle; i++) 
		{
			l[i] = arr_2[i];
		}
		int j = 0;
		for (int k = middle; k < arr_2.length; k++) 
		{
			if (j < r.length) 
			{
				r[j] = arr_2[k];
				j++;
			}
		}
		l = divide(l);
		r = divide(r);
		int final_result[] = new int[arr_2.length];  
		final_result = merging(l, r);
		return final_result;

}
}
