package bigO;
import java.util.Arrays;
import java.time.LocalDateTime;
import java.util.Date;

public class nemo {
    public static void main(String[] args) {
        String[] nemo = {"nemo"};
        String[] everyone = {"doty","doty","doty","doty","doty","doty","doty","doty","doty","doty","doty","doty","nemo"};
        String[] large = new String[100000];
        Arrays.fill(large, "nemo");
        findNemo(large);
        
    }

    private static void findNemo(String[] arr) {
        long t0 = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == "nemo") ;
            System.out.println("Found NEMO!");
            break;
        }
        long t1= System.nanoTime();
        System.out.println("call to find nemo took: " + (t1-t0) /1e6+"  ms");
    }

}

