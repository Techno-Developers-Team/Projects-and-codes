import java.util.*;

public class Permutation{
	static List<Integer> perm(int n)
	{
		List<Integer> l = new ArrayList<>();
		if(n==1){
			System.out.println(1);
			return l;
		}

		if(n<=3)
		{
			System.out.println("NO SOLUTION");
			return l;
		}
		if(n%2==0){
			for(int i=2; i<=n; i+=2){
				l.add(i);
			}
			for(int i=1; i<=n; i+=2){
				l.add(i);
			}
		}
		else{
			for(int i=2; i<=n-1; i+=2){
				l.add(i);
			}
			for(int i=1; i<=n; i+=2){
				l.add(i);
			}
		}
		return l;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> l = perm(n);
		for(Integer x:l){
			System.out.print(x+" ");
		}
	}
}
