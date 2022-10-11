package Lecture16_Sorting;

import java.util.Scanner;

public class Quick_Sort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int idx=Index(arr,0,arr.length-1);
		System.out.println(idx);
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}

	}

	public static int Index(int[] arr, int lo, int hi) {
		// TODO Auto-generated method stub
		int last_element=arr[hi];
		int idx=lo;
		for(int i=lo;i<hi;i++) {
			if(arr[i]<=last_element) {
				int temp=arr[i];
				arr[i]=arr[idx];
				arr[idx]=temp;
				idx++;
			}
		}
		int temp=arr[idx];
		arr[idx]=arr[hi];
		arr[hi]=temp;
		return idx;
	}
	

}
