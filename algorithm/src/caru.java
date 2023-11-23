public class caru {
    public static void main(String[] args) {
        int[] a = {1,5,8,3,0,4,8,9,10,2,3,-1};
        caRu(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    /**
     * 插入排序的步骤如下：每次从无序部分中取出一个元素，与有序部分中的元素从后向前依次进行比较，并找到合适的位置，将该元素插到有序组当中。
     * @param a
     * @return 升序后的数组
     */
    public static void caRu(int[] a) {
        int length = a.length;
        for (int i =1; i<length; i++) {
            //找到的第一个比a[i]大的index
            for (int j = 0; j<i;j++) {
                if (a[j]>a[i]) {
                    arraryCaRu(a,i,j);
                }
            }
        }
    }

    /**
     *
     * @param a
     * @param origin_index 原本的位置
     * @param move_index 需要移到的位置
     */
    public static void arraryCaRu(int[] a, int origin_index,int move_index) {
        //move_index之前的不用动 move_index到origin_index-1位置后移 origin_index移到move_index origin_index后的部分不用动
        int temp = a[origin_index];
        for (int i = origin_index; i>=move_index+1; i--) {
            a[i] = a[i-1];
        }
        a[move_index] = temp;
    }
}

