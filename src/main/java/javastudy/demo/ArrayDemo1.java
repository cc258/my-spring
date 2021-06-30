package javastudy.demo;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] nums1;
        int[][] nums2 = {{1,2},{2,3}};

        // dataType[] arrayRefVar = new dataType[arraySize];
        nums1 = new int[10];

        nums1[0] = 21;

        System.out.println("数组的长度是："+nums1.length);
        System.out.println("数组的第一项："+nums1[0]);
        System.out.println("多维数组显示"+nums2[0][0]);
    }
}
