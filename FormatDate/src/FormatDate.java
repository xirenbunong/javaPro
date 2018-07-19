import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by li on 2018/7/18.
 */
public class FormatDate {
    public static void main(String[] args){
//        新建一个日期对象
        Date date = new Date();
//        获取中国日期与其格式，FULL完整格式，SHORT使用数字
        DateFormat formater = DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINA);
//        将值给string变量
        String string = formater.format(date);
        System.out.println("中国日期：" + string);
        formater = DateFormat.getDateInstance(DateFormat.FULL, Locale.JAPAN);
        System.out.println("日本日期：" + formater.format(date));
        formater = DateFormat.getDateInstance(DateFormat.FULL, Locale.CANADA);
        System.out.println("加拿大日期：" + formater.format(date));
        formater = DateFormat.getDateInstance(DateFormat.FULL, Locale.ITALIAN);
        System.out.println("意大利日期：" + formater.format(date));
    }
}
