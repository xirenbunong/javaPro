import java.io.FileNotFoundException;
import java.io.PrintStream;


public class Main {

    public static void main(String[] args) {
        try{
            PrintStream out = System.out;
//            创建文件输出流
            PrintStream ps = new PrintStream("./log.txt");
//            设置使用新的输出流，以下的输出均为在文件log.txt输出
            System.setOut(ps);
            int age = 18;
            System.out.println("年龄变量定义成功，初始值为18");
            String sex = "女";
            System.out.println("性别变量定义成功，初始值为女");
            String info = "这是个" + sex + "孩子，" + age + "岁了";
            System.out.println("info结果是" +  info);
//            恢复原有输出流，即之后println是在控制台输出
            System.setOut(out);
            System.out.println("程序运行完毕，请查看日志文件");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
