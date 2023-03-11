import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeMap<String,TreeMap<String,Integer>> shop = new TreeMap<>();
        while (scan.hasNextLine()){
            TreeMap<String,Integer> product;
            String[] x = scan.nextLine().split(" ");
            if (shop.containsKey(x[0])){
                if (shop.get(x[0]).containsKey(x[1])){
                    shop.get(x[0]).replace(x[1],shop.get(x[0]).get(x[1]) + Integer.parseInt(x[2]));
                }
                else{
                    shop.get(x[0]).put(x[1],Integer.parseInt(x[2]));
                }
            }
            else{
                product = new TreeMap<>();
                product.put(x[1],Integer.parseInt(x[2]));
                shop.put(x[0],product);
            }
        }

        for(Map.Entry<String,TreeMap<String,Integer>> s: shop.entrySet()) {
            System.out.println(s.getKey() + ":");
            for(Map.Entry<String,Integer> p: s.getValue().entrySet()) {
                System.out.println(p.getKey() + " " + p.getValue());
            }
        }
    }
}