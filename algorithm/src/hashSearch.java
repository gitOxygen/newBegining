import java.util.HashMap;
import java.util.Scanner;

public class hashSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a ={5,3,8,9,3,1,4,0,10};
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            hashMap.put(a[i],i);
        }
        System.out.println(hashsearch(hashMap, scanner.nextInt()));
    }

    /**
     * 哈希查找
     * @param hashMap 哈希表
     * @param target 目标值
     * @return 存在则返回下标 不存在则返回-1
     */
    public static int hashsearch(HashMap<Integer,Integer> hashMap, int target) {
            return hashMap.get(target)!=null?hashMap.get(target) : -1;
    }
}
