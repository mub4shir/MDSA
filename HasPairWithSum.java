import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HasPairWithSum {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,11, 15, 17, 20};
        int target = 8;
        int[] res = hasPairsum(arr, target);
        System.out.println(res[0]+" "+res[1]);
    }
//    public static int[] hasPairsum(int[] nums, int target) {
//        int[] ans = new int[2];
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (!map.containsKey(nums[i])) {
//                map.put(target - nums[i], i);
//            } else {
//                ans[0] = i;
//                ans[1] = map.get(nums[i]);
//                break;
//            }
//        }
//        return ans;
//    }
//}

//    private static boolean hasPairsum(int[] arr, int target) {
//        Set<Integer> map = new HashSet<>();
//        for (int value:arr) {
//            if(map.contains(value))
//                return true;
//            map.add(target-value);
//         }
//        return false;
//    }
//}

    //  if array is sorted
    private static int[] hasPairsum(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int s = arr[low] + arr[high];
            if (s < target) low++;
            else high--;
            if (s == target)
                return new int[]{low, high};
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}


//    public static  int[] hasPairsum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target)
//                    return new int[]{i, j};
//            }
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }
//}





//
//    private static boolean hasPairsum(int[] arr, int target) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 1; j < arr.length ; j++) {
//                if(arr[i]+arr[j]==target)
//                    return true;
//
//            }
//
//        }
//        return false;
//    }

