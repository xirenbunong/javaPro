import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//        创建输入流扫描器
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入身份证号码：");
//        获取用户输入的一行文本，nextLine()是String类型
        String line = scan.nextLine();
        System.out.println("你的身份证号码是" + line.length() +"位");
    }
}
