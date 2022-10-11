package Lecture16_Sorting;

import java.util.Scanner;

public class Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		QuickSort(arr,0,arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void QuickSort(int[] arr, int lo, int hi) {
		// TODO Auto-generated method stub
		if(lo>=hi) {
			return;
		}
		int idx=partion(arr,lo,hi);
		QuickSort(arr,lo,idx-1);
		QuickSort(arr,idx+1,hi);
	}

	public static int partion(int[] arr, int lo, int hi) {
		// TODO Auto-generated method stub
		int pivote=arr[hi];
		int idx=lo;
		for(int i=lo;i<hi;i++) {
			if(arr[i]<=pivote) {
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


