package Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums ={1,2,3};
        int k=4;
        rotateArray(nums,k);

    }

    private static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        if(n==1|| k==0)
            return;
        if(n>k)
            k=1;

        int[] res=new int[n];
        for (int j=0,i = Math.abs(n-k+j); i<n ; i++,j++) {
            res[j]=nums[i];
            if(i==n-1)
                break;
//            System.out.print(res[j] + " ");
        }
        for (int i = 0;  k<n; i++,k++) {
            res[k]=nums[i];

        }
        int i=0;
        for (int z : res) {
            System.out.print(z+ " ");

        }
        System.out.println();
        for (int x:res) {
            nums[i++]=x;

        }
        for (int y: nums) {
            System.out.print(y+" ");

        }
    }
}
