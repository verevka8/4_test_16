import java.util.*;

public class Main {


    public static void main(String[] args) {

        TreeMap<String,String> q = new TreeMap<>();
        q.put("read","R");
        q.put("write","W");
        q.put("execute","X");

        Scanner scan = new Scanner(System.in);
        TreeMap<String, List<String>> file = new TreeMap<>();

        int N = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < N;i++){
            String[] x = scan.nextLine().split(" ");
            List<String> actions = Arrays.asList(x).subList(1, x.length);
            file.put(x[0],actions);
        }

        int M = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < M;i++) {
            String[] x = scan.nextLine().split(" ");
            if (file.containsKey(x[1])){
                if (file.get(x[1]).contains(q.get(x[0]))){
                    System.out.println("OK");
                }
                else{
                    System.out.println("Access denied");
                }
            }
        }


    }
}