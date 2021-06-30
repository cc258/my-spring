package javastudy.demo;

import java.util.Scanner;

public class ScannerNext {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入文字，空格后面的会去掉：");
        // 判断用户有没有输入, 使用next方式接收, 遇到空格，会自动去掉后面的输入。
        if(scanner.hasNext()){

            String s = scanner.next();
            System.out.println("输出的内容为："+s);
        }

        // 凡是属于IO流（输入输出流）的类，使用后需要关闭，如果不会关闭会一直占用资源。
        scanner.close();
    }
}
