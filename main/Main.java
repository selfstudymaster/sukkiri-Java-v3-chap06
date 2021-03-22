package main;

// code06-10 Java API 利用の例
public class Main {
    public static void main(String[] args) {
        int[] heights = {172, 149, 152, 191, 155};
        // Java APIに定義されているメソッドを呼び出して利用
        java.util.Arrays.sort(heights);

        for (int h : heights) {
            System.out.println(h);
        }
    }
}
