public class maoPao {
    public static void main(String[] args) {
        int[] a = {5,6,7,2,1,4,3,10,5,9,0,-1};
        int[] p = maopao(a);
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i]+" ");
        }
    }

    /**
     * 冒泡排序
     * @param a
     * @return 排序后数组
     */
    public static int[] maopao(int[] a) {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            for (int j = i+1;j<length;j++) {
                if (a[i]>a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}
