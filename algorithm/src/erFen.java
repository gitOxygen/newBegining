import java.util.Scanner;

public class erFen {
    public static void main(String[] args) {
        int[] a = {1,2,3,3,5,7,8};
        Scanner scanner = new Scanner(System.in);
        System.out.println("查找：");
        int target = scanner.nextInt();
        System.out.println(erfen(a,0,a.length-1,target)); //递归版本
        System.out.println(erfen1(a,0,a.length-1,target));//非递归版本
        System.out.println(erfen_cazhi(a,0,a.length-1,target));//插值查找
    }

    /**
     * 二分查找 递归版本
     * @param a
     * @param right 右边界
     * @param left 左边界
     * @param target 目标值
     * @return 存在则返回下标 否则返回-1
     */
    public static int erfen(int[] a , int left, int right, int target) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right)/2;
        if (target > a[mid]) {
            return erfen(a,mid+1,right,target);
        } else if (target < a[mid]){
            return erfen(a,left,mid-1,target);
        } else {
            return mid;
        }
    }

    /**
     *
     * 二分法 非递归版本
     * @param a
     * @param left
     * @param right
     * @param target
     * @return 存在则返回下标 否则返回-1
     */
    public static int erfen1(int[] a, int left, int right, int target) {
        while (left<=right) {
            int middle = (left + right)/2;
            if (target > a[middle]) {
                left = middle+1;
            } else if (target <a[middle]) {
                right = middle-1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static int erfen_cazhi(int[] a, int left, int right, int target) {
        while (left<=right) {
            int middle = left +(right - left)*(target-a[left])/(a[right]-a[left]);
            if (middle >= a.length || middle < left || middle > right) {
                break;
            }
            if (target > a[middle]) {
                left = middle+1;
            } else if (target <a[middle]) {
                right = middle-1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
