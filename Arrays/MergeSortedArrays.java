package Arrays;
import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] a ={0,3,4,31};
        int[] b = {4,6,30};
        int n = a.length;
        int m = b.length;
        System.out.println(merge(a,b));

    }
    private static int[] merge(int[] a, int[] b) {
        int i=0;
        int j=0;
        int k=0;
        int n1 =a.length;
        int n2 = b.length;
        int[] c = new int[n1+n2];
        while(i<n1&&j<n2){
            if(a[i]<b[j]){
                c[k++]=a[i++];
            }else
                c[k++]=b[j++];

        }
        while(i<n1)
            c[k++]=a[i++];
        while(j<n2)
            c[k++]=b[j++];
        for(int x: c)
            System.out.print(x+ " ");

        return c;

    }
//static int[] merge(int A[], int m, int B[], int n) {
//        int a=m-1;
//        int b=n-1;
//        int i=m+n-1;    // calculate the index of the last element of the merged array
//
//        // go from the back by A and B and compare and put to the A element which is larger
//        while(a>=0 && b>=0){
//            if(A[a]>B[b]) A[i--]=A[a--];
//            else A[i--]=B[b--];
//        }
//
//        // if B is longer than A just copy the rest of B to A location, otherwise no need to do anything
//        while(b>=0) A[i--]=B[b--];
//
//        return A;
//    }
}
