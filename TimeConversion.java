package HackerRankProblems;
import java.util.*;
public class TimeConversion {
    static String timeConversion(String s) {
        String[] temp = s.split(":");
        String time = temp[2].substring(2);
        String result = "";
        if(time.equals("PM")) {
            if(temp[0].equals("12")) {
                result = s.substring(0,8);
            }else {
            result = 12 + Integer.parseInt(temp[0]) + s.substring(2,8);
            }
        }else {
            if(temp[0].equals("12")) {
                result = "00" + s.substring(2,8);
            }else {
                result = s.substring(0,8);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String result = timeConversion(s);
        System.out.print(result);
        scan.close();
    }


}