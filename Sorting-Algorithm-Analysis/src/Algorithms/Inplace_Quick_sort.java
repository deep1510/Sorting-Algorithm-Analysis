package Algorithms;

import java.util.Random;

//Inplace quick sort
public class Inplace_Quick_sort {
	// method used for swap 
	public static void swap(int arr[], int f, int l) //passing array and two integer value 
	{
		int x = arr[f];				
		arr[f] = arr[l];
		arr[l] = x;
	}
	public int[] QuickSort(int[] array, int b, int e) {

		if (e > b) {						//checking for the condition
			Random random = new Random();			//using Random package and create random object		
			int index_p = b + random.nextInt(e - b + 1);        
			swap(array, index_p, e);
			int pivot = array[e];                //choose end index as a pivot
			int index = divide(array, b, e, pivot);
			QuickSort(array, b, index - 1);
			QuickSort(array, index + 1, e);
		}
		
		/*
		 * QuickSort(array, begin, indexing - 1); QuickSort(array, indexing + 1, end);
		 */
		
		return array;    //return array
	}
	
		//used this method for partition
	public static int divide(int arr_2[], int b, int e, long p) {	 	//passing array two integers and pivot
		int pointer_start = b - 1;    								//consider p =pivot			                                         	
		int pointer_end = e;
		while (true)
		{				//if it's true
			while (arr_2[++pointer_start] < p);	
			while (pointer_end > 0 && arr_2[--pointer_end] > p); 
			if (pointer_start >= pointer_end)
				break;
			else
				swap(arr_2, pointer_start, pointer_end);
		}
		swap(arr_2, pointer_start, pointer_end);
		return pointer_start;
	}
}



