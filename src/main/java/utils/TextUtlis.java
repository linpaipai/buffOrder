package utils;

import model.GoodModel;

import java.util.Arrays;

public class TextUtlis {
    public static String decode(String unicodeStr) {
        if (unicodeStr == null) {
            return null;
        }
        StringBuffer retBuf = new StringBuffer();
        int maxLoop = unicodeStr.length();
        for (int i = 0; i < maxLoop; i++) {
            if (unicodeStr.charAt(i) == '\\') {
                if ((i < maxLoop - 5) && ((unicodeStr.charAt(i + 1) == 'u') || (unicodeStr.charAt(i + 1) == 'U')))
                    try {
                        retBuf.append((char) Integer.parseInt(unicodeStr.substring(i + 2, i + 6), 16));
                        i += 5;
                    } catch (NumberFormatException localNumberFormatException) {
                        retBuf.append(unicodeStr.charAt(i));
                    }
                else
                    retBuf.append(unicodeStr.charAt(i));
            } else {
                retBuf.append(unicodeStr.charAt(i));
            }
        }
        return retBuf.toString();
    }

    public static boolean isEmpty(String s){
        if(s ==null || s.equals("")){
            return true;
        }
        return false;
    }

    //返回价格的中位数
    public static double get_mid_price(Double[] arrays){
        Arrays.sort(arrays);
        if(arrays.length % 2 == 0){
            return ((arrays[(arrays.length)/2] + arrays[((arrays.length)/2)-1]))/2;

        }else{
            return arrays[(arrays.length-1)/2];
        }
    }


    public static void print(GoodModel goodModel,String name){
        System.out.println(goodModel.getName()+"=========="+name);
    }

    public static boolean isEqualZero(String s){
        if(isEmpty(s)){
            return true;
        }
        if(Compare.compare(s,"0")==0){
            return true;
        }
        return false;
    }





}
