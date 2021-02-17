package Algorithms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Run this class to execute the program

public class Main_sort {
	public static void main(String[] args)    //main method 
	{
		int inputarray_Sizes[] = {100, 1000, 10000, 20000, 30000, 40000, 50000};  //predefined input sizes array 
		//int inputarray_Sizes[] = {1000, 2000, 30000, 40000, 50000, 60000, 70000};
		int length = inputarray_Sizes.length;
			double insertionsort_t[] = new double[length];		//creating array object with the size of length
			double mergesort_t[] = new double[length];			//creating array object with the size of length		
			double medianquicksort_t[] = new double[length];			//creating array object with the size of length
			double quicksort_t[] = new double[length];		//creating array object with the size of length
			double heapsort_t[] = new double[length];				//creating array object with the size of length
			double insertionsort_time;
			double mergesort_time;
			double medianquicksort_time;
			double quicksort_time;
			double heapsort_time;
		
			
		/*
		 * int insertionsort_t[] = new int[length]; //creating array object with the
		 * size of length int mergesort_t[] = new int[length]; //creating array object
		 * with the size of length int medianquicksort_t[] = new int[length]; //creating
		 * array object with the size of length int quicksort_t[] = new int[length];
		 * //creating array object with the size of length int heapsort_t[] = new
		 * int[length]; //creating array object with the size of length int
		 * insertionsort_time; int mergesort_time; int medianquicksort_time; int
		 * quicksort_time; int heapsort_time;
		 */
		
			
		int[] array = null;   //initialize null array
		Random random = new Random();
		Comparable match[] = null;
		
		//Comparable match[] = null;
		Scanner scan= new Scanner(System.in);
		int loops = 3;									//it will iterate for 3 times
																	
		Insertion_sort insert = new Insertion_sort();		//creating object of class Insertion_sort
		Merge_sort merge = new Merge_sort();					//creating object of class Merge_sort
		Median_Quick_sort quick = new Median_Quick_sort();		//creating object of class Median_Quick_sort		
		Inplace_Quick_sort ran = new Inplace_Quick_sort();		//creating object of class Inplace_Quick_sort
		Reverse_sort reverse = new Reverse_sort();			//creating object of class Reverse_sort
		Heap_sort heap = new Heap_sort();             //creating object of class Heap_sort
		
		
		System.out.println("Please select any option from below [related to array]");
		System.out.println();
		System.out.println("Available options: \n 1. Array which is not sorted \n 2. Array which is sorted  \n 3. Array which is reversly sorted" );
		int user_input= scan.nextInt();				//getting input from user in integer formate
		
		for(int j = 0 ; j < length; j++) {
			insertionsort_time = 0;
			 mergesort_time = 0;
			quicksort_time = 0;
			medianquicksort_time = 0;
			heapsort_time = 0;
			array = new int[inputarray_Sizes[j]];
			match = new Comparable[inputarray_Sizes[j]];
			
			for(int l = 0; l < loops;  l++) {
				
				for (int i = 0; i < array.length; i++) 
				{
					array[i] = random.nextInt(4000) + 1;
					match[i]=array[i];
					
				}
				if(user_input==2)       //check for user input is 2
				{
					
					insert.insertionsort(array);					//used for sorting the array 			
					for (int i = 0; i < array.length; i++)
					{
						match[i]=array[i];
						
					}

				}

				if(user_input==3)		//check for user input is 3
				{
					
					reverse.reversing(array);					//used for reverse sorting the array
					for (int i = 0; i < array.length; i++)
					{
						match[i]=array[i];
						
					}
				}
				
				System.out.println(" Size of the array :" + inputarray_Sizes[j]);
				System.out.println(" Repetation :"  +(l+1)); //	k will iterate upto 3 times
				
				
				
				System.out.println();

				double startTime = System.currentTimeMillis();			//getting the current time
				insert.insertionsort(array);										//calling sorting algorithm				
				double endTime = System.currentTimeMillis();			//getting time after the algorithm	
				double used_Time =endTime - startTime;			//get difference of both the time		
				System.out.println("Time used during insertion sort  : " + used_Time);
				insertionsort_time += used_Time;
			
				System.out.println();

				startTime = System.currentTimeMillis();				//getting the current time
				merge.divide(array);								//calling sorting algorithm						
				endTime= System.currentTimeMillis();				//getting time after the algorithm
				used_Time =endTime - startTime; 				//get difference of both the time			
				System.out.println("Time used during merge sort :" + used_Time);
				mergesort_time += used_Time;
				
				System.out.println();

				startTime = System.currentTimeMillis();				//getting the current time
				ran.QuickSort(array, 0, array.length -1);			//calling sorting algorithm
				endTime= System.currentTimeMillis();				//getting time after the algorithm	
				used_Time =endTime - startTime; 				//get difference of both the time	
				System.out.println("Time used during quick sort :" + used_Time );
				quicksort_time += used_Time;
				
				System.out.println();
				
				startTime = System.currentTimeMillis();				//getting the current time
				quick.quicksort(match);								//calling sorting algorithm	
				endTime= System.currentTimeMillis();				//getting time after the algorithm	
				used_Time =endTime - startTime;                //get difference of both the time
				System.out.println("Time used during median merge sort :" + used_Time);
				medianquicksort_time += used_Time;
				
				System.out.println();
				
				startTime = System.currentTimeMillis();				//getting the current time					
				heap.heap_sort(array);								//calling sorting algorithm			
				endTime= System.currentTimeMillis();				//getting time after the algorithm
				used_Time =endTime - startTime; 				//get difference of both the time	
				System.out.println("Time used during heap sort "+ used_Time );
				System.out.println();
				heapsort_time += used_Time;
				
				
				
			}
			
			insertionsort_t[j] = (insertionsort_time / loops);			//dividing time by 3 iteration for taking an average.
			mergesort_t[j] = (mergesort_time / loops);
			quicksort_t[j] = (quicksort_time / loops);
			medianquicksort_t[j] = (medianquicksort_time / loops);
			heapsort_t[j] = (heapsort_time / loops);
			
			/*
			 * insertionsort_t[j] = (insertionsort_time / loops); //dividing time by 3
			 * iteration for taking an average. mergesort_t[j] = (mergesort_time / loops);
			 * quicksort_t[j] = (quicksort_time / loops); medianquicksort_t[j] =
			 * (medianquicksort_time / loops); heapsort_t[j] = (heapsort_time / loops);
			 */
			
			System.out.println("****************************************************************************************************************************");
			
		}	
		System.out.println();
		System.out.println("SUMMARY");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("TIME TAKEN BY ISERTION SORT FOR CURRENT INPUT ARRAYS "); 
		System.out.println(	Arrays.toString(insertionsort_t));
		System.out.println("*********************************************************************************************************************************");
		System.out.println("TIME TAKEN BY MEDIAN QUICK SORT FOR CURRENT INPUT ARRAYS"); 
		System.out.println( Arrays.toString(medianquicksort_t));
		System.out.println("*********************************************************************************************************************************");
		System.out.println("TIME TAKEN BY QUICK SORT FOR CURRENT INPUT ARRAYS ");
		System.out.println( Arrays.toString(quicksort_t));
		System.out.println("*********************************************************************************************************************************");
		System.out.println("TIME TAKEN BY HEAP SORT FOR CURRENT INPUT ARRAYS"); 
		System.out.println( Arrays.toString(heapsort_t));
		System.out.println("*********************************************************************************************************************************");
		System.out.println("TIME TAKEN BY MERGE SORT FOR CURRENT INPUT ARRAYS"); 
		System.out.println( Arrays.toString(mergesort_t));
		
		
	}

}
