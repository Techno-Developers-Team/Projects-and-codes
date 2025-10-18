import java.util.*;
import java.io.*;
class MissingNumber{
public static long missnum(long[] arr, int n)
{
	long s = (long)n*(n+1)/2;
	for(int i=0; i<n-1; i++){
		s-=arr[i];
	}
	return s;
}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n-1];
		for(int i=0; i<n-1; i++){
			arr[i]=sc.nextLong();
		}
		System.out.println(missnum(arr, n));
	}
}


