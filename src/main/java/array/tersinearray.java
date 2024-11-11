package array;

import java.util.Arrays;

public class tersinearray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b=new int[5];
        for(int i=0;i<a.length;i++){
            b[b.length-1-i]=a[i];
        }
        System.out.println(Arrays.toString(b));
    }
}
