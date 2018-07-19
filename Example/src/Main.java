import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//        输入流的类变量in
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入新员工姓名：");
        String name = scan.nextLine();
        System.out.println("请输入新员工应聘职位语言：");
        String language = scan.nextLine();
//        对字符串的哈希码进行判断，使用hashCode()方法
        switch (language.hashCode()){
            case 3254818:
            case 2301506:
            case 2269730:
                System.out.println("员工" + name + "被分配到Java部门");
                break;
            case 3104:
            case 2112:
                System.out.println("员工" + name + "被分配到C#部门");
                break;
            default:
                System.out.println("不需要" + language + "开发的人员");
        }
    }
}
