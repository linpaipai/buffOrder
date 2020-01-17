package utils;

public class Compare {
    public static int compare(String s1,String s2) {

        Double obj1 = new Double(s1);
        Double obj2 = new Double(s2);
        int retval =  obj1.compareTo(obj2);

        if(retval > 0) {
            return 1;
        }
        else if(retval < 0) {
            return 2;
        }
        else {
            return 0;
        }
    }
}
