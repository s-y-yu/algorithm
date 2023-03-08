import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    HashMap<String, String> map = new HashMap<>();
    for(int n=0; n<N; n++) {

      String key = sc.next();
      String value = sc.next();
      if(value.equals("leave")) map.remove(key);
      else map.put(key, value);
    }
    List<String> keyList = new ArrayList<>(map.keySet());

    keyList.sort(Comparator.reverseOrder());
    for (String key: keyList) {
      System.out.println(key);
    }


  }
}
