import java.util.Scanner;
import java.util.LinkedList;
public class JOSEPHUS {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> q = new LinkedList<Integer>();
		
		int C = sc.nextInt();
		for(int i = 0; i < C; i++)
		{
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			q = josephus(N, K);
			
			System.out.printf("%d %d\n", q.get(0),q.get(1));
		}
		
		sc.close();
	}
	
	public static LinkedList<Integer> josephus(int N, int K)
	{
		LinkedList<Integer> q = new LinkedList<Integer>();
		
		for(int i = 1; i <= N ; i++)
			q.add(i);
		
		int kill = 0;
		
		while(q.size() > 2)
		{
			q.remove(kill);
			kill += K-1;
			kill %= q.size();
		}
		
		return q;
	}

}