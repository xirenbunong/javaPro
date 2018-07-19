import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入金额：");
        String convert = convert(scan.nextDouble());
        System.out.println(convert);


    }
}
