package Lecture16_Sorting;

import java.util.Scanner;

public class Merge_Two_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		System.out.println("Enter the value of m");
		int m=sc.nextInt();
		int[]arr1=new int[n];
		int[]arr2=new int[m];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int j=0;j<arr2.length;j++) {
			arr2[j]=sc.nextInt();
		}
		int[]ans = MergeSort(arr1,arr2);
		 for (int k = 0; k < ans.length; k++) {
			System.out.print(ans[k]+" ");
		}

	}

	public static int[] MergeSort(int[] arr1, int[] arr2) {
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
