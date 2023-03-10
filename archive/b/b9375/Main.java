package etc.b9375;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    for(int tc=1; tc<=T; tc++) {
      int N = sc.nextInt();
      HashMap<String, Integer> map = new HashMap<>();
      for(int n=0; n<N; n++) {
        String item = sc.next();
        String type = sc.next();

        if (map.containsKey(type)) {
          int val = map.get(type);
          map.put(type, ++val);
        } else map.put(type, 1);
      }
        int mul = 1;
        for (String key : map.keySet()) {
          int value = map.get(key);
          mul *= value;
        }
        if(mul == N) System.out.println(N);
        else System.out.println(N + mul);

    }
  }
}
