public class xuanze {
    public static void main(String[] args) {
        int[] p = {5,3,8,4,3,4,8,10,9,0};
        int[] a = xuanZe(p);
        for (int i = 0; i < a.length; i++) {
            if (i!=a.length-1) {
                System.out.print(a[i] + ",");
            } else {
                System.out.println(a[i]);
            }
        }
    }

    /**
     * 选择排序
     * @param a 待排序数组
     * @return 升序后的数组
     */
    public static int[] xuanZe(int[] a){
        int size = a.length;
        for (int i = 0;i<size;i++) {
            int min = a[i];
            int index = i;
            int record = 0;
            for (int j = i+1;j<size;j++) {
                if (min > a[j]) {
                    //循环一遍寻找最小值并记录
                    min = a[j];
                    index = j;
                    record = 1;
                }
            }
            if (record == 1) {
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;

            }
        }
        return a;
    }
}
