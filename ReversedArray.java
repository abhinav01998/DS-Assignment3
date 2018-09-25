import java.util.*;

class reverse{
	private int i,j=0;
	public int[] revArr(int arr[],int revarr[],int n){
		i = n-1; 
		if(i < 0){
			return revarr;
		}
		else{
			revarr[j]=arr[i];
			j++;
			revArr(arr,revarr,n-1);
		}
		return revarr;
	}
}

public class ReversedArray{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		reverse rev = new reverse();
	  int i,n;
	  //n is the size of array.
	  n = sc.nextInt();
	  int arr[] = new int[n];
	  int revarr[] = new int[n];
	  //entering values in array
	  for(i=0;i<n;i++){
		  arr[i] = sc.nextInt();
	  }
	  revarr = rev.revArr(arr,revarr,n);
	  for(i=0;i<n;i++){
		  System.out.print(revarr[i]+" ");
	  }
	}
}