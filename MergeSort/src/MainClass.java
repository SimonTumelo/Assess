//Author:Tumelo Matlou
//Date:17 October 2021
//Purpose:The purpose of the project is to merge 3 inputs into 1 response 
public class MainClass {

		  public static void merge(int[] L_arr,int[] R_arr, int[] arr,int size_left, int size_right)
		  {
		      
		      int i=0,l=0,r = 0;
		      //The while loops check the conditions for merging
		      while(l<size_left && r<size_right)
		      {
		          
		          if(L_arr[l]<R_arr[r]){
		              arr[i++] = L_arr[l++];
		          }
		          else{
		              arr[i++] = R_arr[r++];
		          }
		      }
		      while(l<size_left){
		          arr[i++] = L_arr[l++];
		      }
		      while(r<size_right){
		        arr[i++] = R_arr[r++];
		      }
		  }

		  public static void mergeSort(int [] arr, int len)
		  {
		      if (len < 2){return;}
		      
		      int mid = len / 2;
		      int [] L_arr = new int[mid];
		      int [] R_arr = new int[len-mid];
		      
		    //Dividing array into two and copying into two separate arrays
		      int k = 0;
		      for(int i = 0;i<len;++i){
		          if(i<mid){
		              L_arr[i] = arr[i];
		          }
		          else{
		              R_arr[k] = arr[i];
		              k = k+1;
		          }
		      }
		    // Calling the function to divide the subarrays 
		      mergeSort(L_arr,mid);
		      mergeSort(R_arr,len-mid);
		    // Calling the merge method on each subdivision
		      merge(L_arr,R_arr,arr,mid,len-mid);
		  }
	 
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 int [] array = {9,1,10,5,5,2,6,1,11};
	        mergeSort(array,array.length);
	        for(int i =0; i< array.length;++i)
	        {
	            System.out.print( array[i]+ " ,");
	        }
	}
}


