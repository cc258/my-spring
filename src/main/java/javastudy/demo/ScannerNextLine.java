package javastudy.demo;

import java.util.Scanner;

public class ScannerNextLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入文字，空格也可以哦：");
        if(scanner.hasNextLine()){
            System.out.println("请输入文字：");
            String s = scanner.nextLine();
            System.out.println("你输入的文字是："+s);
        }
        scanner.close();

    }
}
