package erChaShu;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int[] a ={5,3,8,9,3,1,4,0,10};
        erChaSearchTree tree = new erChaSearchTree();
        for (int i = 0; i < a.length; i++) {
            tree.insert(a[i]);
        }
        System.out.print("请输入要查找的数： ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(tree.search(scanner.nextInt()));
    }
}
