import java.util.*;

class fiboNum{
	private int a=1;
	public int fib(int n){
		if(n==0 || n==1){
			return n;
		}
		return fib(n-1)+fib(n-2);
	}
}
public class Fibonacci{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		fiboNum f1 = new fiboNum();
		int a,n;
		a=fib(n);
		System.out.println(a);
	}
}