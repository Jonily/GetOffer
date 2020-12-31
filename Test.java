import java.util.LinkedHashMap;
import java.util.Map;
public class Test{
    public static void main(String[] args) {
        System.out.println(firstUniqChar("abaccdeff"));
    }
    public static char firstUniqChar(String s) {
        Map<Character, Boolean> dic = new LinkedHashMap<>();
        char[] sc = s.toCharArray();
        for(char c : sc){
            dic.put(c, !dic.containsKey(c));
        }

        for(Map.Entry<Character, Boolean> d : dic.entrySet()){
            if(d.getValue()){
                return d.getKey();
            }
        }
        return ' ';

    }

}