package src.main.bag;

import java.util.Scanner;

public class zero_one_BagProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入物品的数量: ");
        int n = scanner.nextInt();
        System.out.print("输入背包的容积: ");
        int m = scanner.nextInt();
        //体积
        int[] v = new int[n+1];
        //价值
        int[] w = new int[n+1];

        System.out.println("分别输入物品的体积和价值： ");
        for (int i = 1; i < n+1; i++) {
            v[i] = scanner.nextInt();
            w[i] = scanner.nextInt();
        }

        //初始化f
        int[][] f = new int[n+1][m+1];

        //核心逻辑
        for (int i = 1; i < n+1; i++) { //物品j
            for (int j = 1; j < m+1; j++) { //容量j
                if (j<v[i]) {
                    //无法放入第i件物品
                    f[i][j] = f[i-1][j];
                } else {
                    f[i][j] = Math.max(f[i-1][j],f[i-1][j-v[i]]+w[i]);
                }
            }
        }
        //动态规划表输出
        System.out.println("动态规划表: ");
        for (int i = 0; i < n+1; i++) { //物品j
            for (int j = 0; j < m+1; j++) { //容量j
                System.out.print(f[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("背包里装入的物品具有最大的价值总和: ");
        System.out.println(f[n][m]);

        //输出哪个背包被选中
        System.out.print("被选中的背包是: ");
        int i = n;
        int j = m;
        while (i>0 && j>=0) {
            if (f[i][j] != f[i-1][j] && i-1>=0) {
                System.out.print(i + " ");
                j = j - v[i];
            }
            i--;
        }
    }
}
