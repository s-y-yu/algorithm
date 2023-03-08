package etc.b1620;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    int N = sc.nextInt();
    HashMap<String, String> map = new HashMap<>();
    String num = Integer.toString(1);
    for (int tc = 1; tc <= T; tc++) {

      String pokemon = sc.next();
      map.put(pokemon, num);
      map.put(num, pokemon);
      int parsednum = Integer.parseInt(num);
      num = Integer.toString(++parsednum);
    }

    for (int n = 0; n < N; n++) {
      String question = sc.next();
      String answer = map.get(question);
      System.out.println(answer);
    }
  }
}
//      String[]arr = new String[T+1];
//      for(int t=1; t<=T; t++) {
//        arr[t] = sc.next();
//      }
//
//    for (int n = 0; n < N; n++) {
//      String answer = "";
//      String question = sc.next();
//      for(int i=1; i<=T; i++) {
//        if(arr[i].equals(question)) {
//          answer = Integer.toString(i);
//          break;
//        }
//    }
//      if(answer.equals("")) answer= arr[Integer.parseInt(question)];
//      System.out.println(answer);
//    }
//  }
//}
