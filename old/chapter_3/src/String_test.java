import java.util.Date;

/**
 * Created by udayanga on 4/4/16.
 */
public class String_test {
    public static void main(String[] args) {
        String txt="Hello";
        System.out.println(txt.isEmpty());
        System.out.println(txt.charAt(1));
        System.out.printf("%s %tB %<te, %<tY", "Due date:", new Date());
    }
}
