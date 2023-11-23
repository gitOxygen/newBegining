import java.util.Scanner;

public class shunxv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] test = {5,3,8,9,3,1,4,0,10};
        System.out.println(shunXv(test,scanner.nextInt()));
    }

    /**
     * 顺序查找
     * @param test
     * @param target
     * @return 存在则返回下标 否则返回-1
     */
    public static int shunXv(int[] test, int target) {
        for (int i = 0; i < test.length; i++) {
            if (target == test[i]) {
                return i;
            }
        }
        return -1;
    }
}
