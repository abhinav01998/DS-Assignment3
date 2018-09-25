import java.util.*;

class checkAvail{
	private int i,flag=0;
	public boolean isAvail(int arr[],int m,int size)
	{
		for(i=0;i<size;i++){
			if(arr[i]==m){
				flag=1;
			}
		}
		if(flag==0){
			return false;
		}
		else{
			return true;
		}
	}
}

public class Availability{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		checkAvail cA = new checkAvail();
	  int i,m,n;
	  boolean avail;
	  n = sc.nextInt();
	  int arr[] = new int[n];
	  for(i=0;i<n;i++){
		  arr[i] = sc.nextInt();
	  }
	  m = sc.nextInt();
	  avail = cA.isAvail(arr,m,n);
	  System.out.println(avail);
	}
}