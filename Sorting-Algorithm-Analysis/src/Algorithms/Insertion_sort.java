package Algorithms;
//Insertion sort Algorithm

public class Insertion_sort {
	//returning array of integers
		public int[] insertionsort(int Array[]) {		//sort method with reference of array	
			for (int i = 1; i < Array.length; i++) { 	//itrate upto lenght of an array
				int k = Array[i];				//k= key					
				int j = i;
				while (j > 0 && Array[j - 1] > k) {	//check both the condition
					Array[j] = Array[j - 1];
					j = j - 1;
				}
				Array[j] = k;
			}
			return Array;		//return the array
		}
	}


