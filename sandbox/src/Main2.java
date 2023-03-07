import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long M = sc.nextInt();
    long[]arr = new long[N];
    for(int i=0; i<N; i++) {
      arr[i] = sc.nextInt();
    }
    int p2 = 0;
    long min = 2000000000;
    Arrays.sort(arr);
    for(int p1=0; p1<N; p1++) {
      while(p2 < N && arr[p2] - arr[p1] < M ) p2++;
      if(p2 == N) break;
      min = Math.min(min, arr[p2] - arr[p1]);
    }

    System.out.println(min);
  }
}

