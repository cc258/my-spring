package javastudy.demo;

import java.util.Scanner;

public class ScannerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("输入多个数字，求个数，总数，平均数:");
        int count = 0;
        double sum = 0;
        double avg = 0;

        while(scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            count++;
            sum += x;
            avg = sum / count;
        }

        System.out.println("你输入了"+count+"个数据，总和为："+sum+", 平均值为："+ avg);

        scanner.close();


    }
}
