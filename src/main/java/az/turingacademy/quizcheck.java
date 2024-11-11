package az.turingacademy;

public class quizcheck {
    public static void main(String[] args) {
        int[] numbers = {13, 4, 2, 22, 34, 17};
        int a = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < a) {
                a = numbers[i + 2];
            }
        }
        System.out.println(a);
    }
}
