package com.jerry.financecrawler.commons;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Jerry on 2015/10/12.
 */
public class StringUtil {

    public static final String SYMBOL_ASTERISK = "*";
    public static final String SYMBOL_QUESTION_MARK = "?";
    public static final String SYMBOL_PERCENT = "%";
    public static final String SYMBOL_WRAP = "\n";
    public static final String SYMBOL_DOUBLE_MINUS = "--";

    //substring
    public static final String SYMBOL_PRE_BRACKET = "（";

    public static final String SYMBOL_BACK_BRACKET = "）";




    public static String filterSymbol(String str,String symbol){
        return str.replace(symbol, "");
    }

    public static String filterAllSymbol(String str){
        String result = str.replace(SYMBOL_ASTERISK , "");
        result = result.replace(SYMBOL_WRAP , "");
        result = result.replace(SYMBOL_DOUBLE_MINUS , "");
        return result.replace(SYMBOL_PERCENT, "");
    }

    public static double StringToDouble(String str) throws ClassCastException{

        return Double.parseDouble(str);
    }

    public static Integer StringToInt(String str) throws ClassCastException{

        return Integer.parseInt(str);
    }



    public static String subPreBracket(String str) throws Exception{
        if(str.indexOf(SYMBOL_PRE_BRACKET) == -1){
            return str;
        }
        return str.substring( 0, str.indexOf(SYMBOL_PRE_BRACKET));
    }
    public static String subBackBracket(String str) throws Exception{
        if(str.indexOf(SYMBOL_PRE_BRACKET) == -1){
            return str;
        }
        return str.substring(str.indexOf(SYMBOL_PRE_BRACKET) + 1, str.indexOf(SYMBOL_BACK_BRACKET));
    }

    public static String addDateYear(String str){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        return sdf.format(date)+ "-" + str.trim();

    }

}
