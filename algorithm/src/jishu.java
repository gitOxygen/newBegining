public class jishu {
    public static void main(String[] args) {
        int[] a = {2,20,2,5,7,9,3,5,1,0,5,3,11};
        jiShu(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    /**
     * 计数排序
     * @param a 待排序数组
     */
    public static void jiShu(int[] a) {
        if (a.length == 0) {
            return;
        }
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max <a[i]) {
                max = a[i];
            }
        }

        int[] p = new int[max+1];

        for (int i = 0; i < a.length; i++) {
            p[a[i]]++;
        }
         int j = 0;
        for (int k = 0; k < p.length; k++) {
            for (int i = 0; i<p[k];i++) {
                a[j] = k;
                j++;
            }
        }
    }
}
