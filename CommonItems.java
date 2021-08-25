import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CommonItems {
    public static void main(String[] args) {
        char[] array1 = {'a','b','c','x','i'};
        char[] array2 = {'z','y','i'};
        System.out.println(anyCommomItem(array1,array2));
    }

    private static boolean anyCommomItem(char[] array1, char[] array2) {
        HashMap<Character,Boolean> map = new HashMap<>();
        for (char ch: array1)
            map.put(ch, true);
        for (char ch: array2)
            if(map.containsKey(ch))
                return true;
            return false;
    }


//    private static boolean anyCommomItem(char[] array1, char[] array2) {
//        int size = (array1.length + array1.length)-2;
//        Set<Character> set = new HashSet<Character>();
//        for (char i:array1)
//            set.add(i);
//        for (char i:array2)
//            set.add(i);
//        System.out.println(size);
//        System.out.println(set.size());
//        return !(set.size()==size);
//
//    }


//    private static boolean anyCommomItem(char[] array1, char[] array2) {
//        HashMap<Character,Integer> map = new HashMap<>();
//        for (int i = 0; i < array1.length; i++) {
//            char ch = array1[i];
//            if (map.containsKey(ch)) {
//                int val = map.get(ch);
//                map.put(ch, val + 1);
//            } else
//                map.put(ch, 1);
//        }
//        for (int i = 0; i <array2.length ; i++)
//            if(map.containsKey(array2[i]))
//                return true;
//            return false;
//    }





//    private static boolean anyCommomItem(char[] array1, char[] array2) {
//        for (int i = 0; i < array1.length; i++)
//            for (int j = 0; j < array2.length; j++)
//                if(array1[i]==array2[j])
//                    return true;
//                return false;

}
