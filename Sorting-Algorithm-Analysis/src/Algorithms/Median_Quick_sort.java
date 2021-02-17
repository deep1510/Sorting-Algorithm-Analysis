package Algorithms;

//Median Quick sort algorithm

public class Median_Quick_sort {
	public void quicksort( Comparable a[] ) {					//compares this object with the specified object for order
		quicksortmed( a, 0, a.length - 1 );
	}
	/*
	 * Compares this object with the specified object for order. Returns a negative
	 * integer, zero, or a positive integer as this object is less than, equal to,
	 * or greater than the specified object.
	 */
	private static final int A = 15;          //if array size is less than 15 then it will go to the insertion method. 

	private static void quicksortmed(Comparable a[], int b, int e) {		//passing array and two integers
		if( b + A > e )			//checking for the condition //b=begin and e=end
			insertionSort( a, b, e );
		else {
			// used for sorting the high, middle and low
			int middle = ( b + e ) / 2;                //get middle value
			if(a[middle].compareTo(a[b]) <0)   //check for the condition, if true then calling swap method
				swapping( a, b, middle);
			if(a[e].compareTo(a[b]) < 0)
				swapping( a, b, e );
			if(a[e].compareTo(a[middle]) < 0)
				swapping(a,middle,e);
			
			//middle to begin= swap 
			//end to begin= swap
			//end to middle= swap 

			// Place pivot at position high - 1
			swapping( a, middle, e - 1 );
			Comparable p_1 = a[ e - 1 ];				//placing the pivot on the position high-1
														//p_1= pivot				
			int i, j;
			for( i = b, j = e - 1; ; ) {
				while( a[++i].compareTo( p_1 ) < 0 );			//used compareTo and check condition
				while( p_1.compareTo( a[ --j ] ) < 0 );
					
				if( i >= j )
					break
					;
				Median_Quick_sort.swapping( a, i, j );
			}

			swapping( a, i, e - 1 );

			quicksortmed( a, b, i - 1 );
			quicksortmed( a, i + 1, e );
		}
	}


	//method used for the Insertion sort
	private static void insertionSort( Comparable a[], int l, int h ) {  //passing one array and two integers
		for (int p = l + 1; p <= h; p++) {
			Comparable x = a[p];
			int j;

			for (j = p; j > l && x.compareTo(a[j - 1]) < 0; j--)
				a[j] = a[j - 1];
			a[j] = x;
		}
	}
		
		//method used for swapping
	public static final void swapping( Object a[], int i_1, int i_2 ) {	//passing one array and two integers 
		Object x = a[ i_1 ];
		a[ i_1 ] = a[ i_2 ];
		a[ i_2 ] = x;
	}

}


