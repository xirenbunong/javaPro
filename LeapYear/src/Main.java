import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//        定义一个对象来接收参数
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年份!");
//        封装一个输入流对象year
        long year = scan.nextLong();
//        判断是否为闰年
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + "是闰年");
        }else{
            System.out.println(year + "不是闰年");
        }
    }
}
