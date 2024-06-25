package InsertSort;

public class InsertSort {
	public static void main(String[]args) {
   int arr[]= {12,11,13,5,6};
   int length=arr.length;
   
   System.out.print("unsort array :");
   for(int i=0;i<length;i++) {
	   System.out.print(arr[i]+" ");
   }
   
   for(int i=1;i<length;i++) {
	   int key=arr[i];
	   int j=i-1;
	   
	   while(j>=0 && arr[j]>key) {
		   arr[j+1]=arr[j];
		   j=j-1;
		   
	   }
	   arr[j+1]=key;
   }
   System.out.println();
   System.out.print("sort array :");
   for(int i=0;i<length;i++) {
	   System.out.print(arr[i]+" ");
   }
}
}