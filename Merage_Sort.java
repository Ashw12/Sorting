package Lecture16_Sorting;

import java.util.Scanner;

public class Merage_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int[]ans=MergeSort(arr,0,arr.length-1);
		for (int k = 0; k < ans.length; k++) {
			System.out.print(ans[k]+" ");
		}
	}

	public static int[] MergeSort(int[] arr,int low,int high) {
		// TODO Auto-generated method stub
		if(low==high){
			int[] a=new int[1];
			a[0]=arr[low];
			return a;
		}
		int mid=(low+high)/2;
		int[] fs=MergeSort(arr,low,mid);
		int[] Ss=MergeSort(arr,mid+1,high);
		return MergeSortArray(fs,Ss);
	}
	public static int[] MergeSortArray(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		 int n=arr1.length;
		 int m=arr2.length;
		 int[]ans=new int[m+n];
		 int i=0;
		 int j=0;
		 int k=0;
		 while(i<n &&j<m) {
			 if(arr1[i]<=arr2[j]) {
				 ans[k]=arr1[i];
				 i++;
				 k++;
			 }else {
				 ans[k]=arr2[j];
				 j++;
				 k++;
			 }
		 }
		 while(i<n) {
			 ans[k]=arr1[i];
			 i++;
			 k++;
		 }
		 while(j<m) {
			 ans[k]=arr2[j];
			 j++;
			 k++;
		 }
		return ans;
	}

}
