package Algorithms;

//Reverse sorting array
public class Reverse_sort {
    public int[] reversing(int[] Array)		//passing an integer array
    {
        for (int i = 1; i < Array.length; i++) {

            int key = Array[i];
            int j = i;
            while (j > 0 && Array[j - 1] < key) {
                Array[j] = Array[j - 1];
                j = j - 1;
            }
            Array[j] = key;


        }
            return Array;
    }
}

