package methods;

public class sum {
    public static void main(String[] args) {
        int[] nums={5,6};
        int cem=topla(nums);
        System.out.println(cem);
    }
    public static int topla(int[] vekils){
        int sum=vekils[0]+vekils[1];
        return sum;
    }
}
