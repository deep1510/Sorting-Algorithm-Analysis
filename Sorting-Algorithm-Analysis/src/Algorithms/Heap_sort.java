package Algorithms;

import java.util.Vector;

//Heap Sort Algorithm

public class Heap_sort {
			//used for the swapping the values
		void valueswapping(Vector<Integer> v, int i) {         //passing Vector and one integer value 
	        int temp_1 = (int) v.get(i);
	        v.set(i, v.get(i / 2));
	        v.set(i / 2, temp_1);
	    }
			//Used for the swapping
	      void swapping(Vector<Integer> v_2, int j, int k){
	        int temp= v_2.get(j);
	        v_2.set(j,v_2.get(k));
	        v_2.set(k,temp);

	    }
	     void heap(Vector<Integer> arr_1, int t, int i)
	    {
	        int small = i; 
	        int l = 2 * i ; 
	        int r = 2 * i + 1; 

		/*
		 * int low = i; int left = 2 * i ; int right = 2 * i + 1;
		 */
	        
	        if (l < t && arr_1.get(l) < arr_1.get(small))
	            small = l;

	        
	        if (r < t && arr_1.get(r) < arr_1.get(small))
	            small = r;

	        
	        if (small != i) {
	            swapping(arr_1,i,small);

	            
	            heap(arr_1, t, small);
	        }
	    }
	     	
	    void heap_sort(int[] arr_2){		//passing an array here
	        Vector<Integer> v = new Vector<>(arr_2.length);

	        int k;
	        v.add(0,null);
	        int t=0,n=0;
	        for (int i = 0; i < arr_2.length; i++) {
	            t = t + 1;
	            v.add(t, arr_2[i]);								//public void add(int index, E element) {
	            												//insertElementAt(element, index);				
	            k = t;
	            while (k > 1 && v.get(k) < v.get(k / 2)) {
	                valueswapping(v, k);
	                k = k / 2;
	            }
	        }


	        for(int i=v.size()-1; i>=1; i-- ){
	            arr_2[n++]=v.get(1);                   //sum[m] =vec.get(1) ;
	            swapping(v,1,i);						//m = m + 1;
	            heap(v,i,1);
	        }
	    }
	}

