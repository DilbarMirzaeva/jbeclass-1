package az.turingacademy;

public class TypesPrint2 {
    public static void main(String[] args) {
        byte byte1=23;
        short short1=12000;
        int int1=75000;
        long long1=29800000;
        float float1=(float)3.5;
        double double1=6387.456;
        char char1='5';
        boolean boolean1=false;
        /*bir setirde print*/
        System.out.print("byte:"+byte1 +" short:"+short1 + " int:"+ int1+ " long:" +long1
                +" float:"+float1+" double:" +double1+ " char:"+char1 +" boolean:"+boolean1+ "\n");
        System.out.println("byte:"+byte1 +" short:"+short1 + " int:"+ int1+ " long:" +long1
                +" float:"+float1+" double:" +double1+ " char:"+char1 +" boolean:"+boolean1 );
        System.out.printf("byte:%d, short:%d, int:%d, long:%d, float:%f, double:%2f, char:%s," +
                "boolean:%s",byte1,short1,int1,long1,float1,double1,char1,boolean1 );
    }
}
