//SOLUTION-1 (BRUTE FORCE)
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> odd_map=new HashMap<>();
        HashMap<Character,Integer> even_map=new HashMap<>();
        StringBuffer sb=new StringBuffer();
        String s = scanner.nextLine();
        String palindromeString;
        int count=0;
        for(int i=0;i<s.length();i++){
            char k=s.charAt(i);
            count=map.getOrDefault(k,0);
            count++;
            map.put(k, count);
        }
        for(char key:map.keySet()){
            if (map.get(key)%2==1) {
                odd_map.put(key, map.get(key));
            }
            else{
                even_map.put(key, map.get(key));
            }
        }
        if (odd_map.size()>1) {
            System.out.println("NO SOLUTION");
        }
        else{
            for(Map.Entry<Character,Integer> entry:odd_map.entrySet()){
                int ct=entry.getValue();
                while (ct!=0) {
                    sb.append(entry.getKey());
                    ct--;
                }
            }
            for(Map.Entry<Character,Integer> entry:even_map.entrySet()){
                int j=entry.getValue();
                for(int i=1;i<=j/2;i++){
                    sb.append(entry.getKey());
                }
                for(int i=1;i<=j/2;i++){
                    sb.insert(0,entry.getKey());
                }
        }
        palindromeString=sb.toString();
        System.out.println(palindromeString);
        scanner.close();
    }
    }
}
