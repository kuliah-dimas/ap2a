
public class Main {
    public static void main(String[] args) {
        int x = 0;
        int[][] myArr = { { 2, 5, 3 }, { 7, 1, 9 }, { 4, 6, 8 } };
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++) {
                if (myArr[i][j] > x) {
                    x = myArr[i][j];
                }
            }
        }
        System.out.println(x);
    }
}
