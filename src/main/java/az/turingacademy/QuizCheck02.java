package az.turingacademy;

public class QuizCheck02 {
    public static void main(String[] args) {
        int[][] matrix=new int [3][2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=(i+j)*2;
            }
        }
        System.out.println(matrix[2][1]+matrix[1][1]);
    }
}
